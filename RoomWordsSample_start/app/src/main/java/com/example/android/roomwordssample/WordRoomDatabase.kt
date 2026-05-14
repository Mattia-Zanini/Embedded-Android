package com.example.android.roomwordssample

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import androidx.sqlite.db.SupportSQLiteDatabase
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

@Database(entities = [Word::class], version = 1)
abstract class WordRoomDatabase : RoomDatabase() {
    abstract fun wordDao(): WordDao

    companion object {
        // mi tengo una reference al database in quanto non voglio creare un database ogni volta
        private var INSTANCE: WordRoomDatabase? = null
        fun getDatabase(
            context: Context,
            scope: CoroutineScope
        ): WordRoomDatabase {
            return INSTANCE ?: synchronized(this) {
                val instance = Room.databaseBuilder(
                    context.applicationContext,
                    WordRoomDatabase::class.java,
                    "word_database"
                )
                    .fallbackToDestructiveMigration()
                    .addCallback(WordDatabaseCallBack(scope))
                    .build()
                INSTANCE = instance
                instance
            }
        }

        private class WordDatabaseCallBack(
            private val scope: CoroutineScope
        ) : RoomDatabase.Callback() {
            override fun onOpen(db: SupportSQLiteDatabase) {
                super.onOpen(db)

                INSTANCE?.let { database ->
                    scope.launch(Dispatchers.IO) {
                        populateDatabase(database.wordDao())
                    }
                }
            }
        }

        fun populateDatabase(wordDao: WordDao) {
            // wordDao.deleteAll() // risulta che, ogni volta che il database viene aperto, viene cancellato tutto

            // NON ci sono problemi con il popolamento del database, in quanto ho aggiunto la strategia di gestione dei conflitti
            // ripopolo il db con delle parole di default
            wordDao.insert(Word("Hello"))
            wordDao.insert(Word("World!"))
        }
    }
}