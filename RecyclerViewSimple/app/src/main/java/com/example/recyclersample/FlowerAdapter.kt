/*
 * Copyright (C) 2020 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.example.recyclersample

import android.content.Context
import android.content.Intent
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

// L'adapter e' responsabile di TUTTI i dati
class FlowerAdapter(private val flowerList: Array<String>, private val c : Context) :
    RecyclerView.Adapter<FlowerAdapter.FlowerViewHolder>() {
    private val mTAG = this.javaClass.simpleName

    /*private val onClickListener = View.OnClickListener { u ->
        val flowerName = (u as TextView).text.toString()

        val intent = Intent(u.context, DetailActivity::class.java)
        intent.putExtra(DetailActivity.ARG_FLOWER_NAME, flowerName)
        u.context.startActivity(intent)
    }*/

    // Describes an item view and its place within the RecyclerView
    class FlowerViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        private val flowerTextView: TextView = itemView.findViewById(R.id.flower_text)
        private val positionTextView: TextView = itemView.findViewById(R.id.position_text)

        fun bind(word: String, pos: Int) {
            flowerTextView.text = word
            positionTextView.text = pos.toString().padStart(2, '0')

            val myIntent = Intent(itemView.context, DetailActivity::class.java).apply {
                putExtra(DetailActivity.ARG_FLOWER_NAME, flowerTextView.text)
            }

            flowerTextView.setOnClickListener {
                itemView.context.startActivity(myIntent)
            }
        }
    }

    // Returns a new ViewHolder
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FlowerViewHolder {
        // il parent e' passato dal recyclerview e grazie al parent recupero il context
        val view = LayoutInflater.from(parent.context)
            // dall'inflate ottengo una reference, ottengo la radice della gerachia delle classi, in questo caso un FrameLayout
            .inflate(R.layout.flower_item, parent, false)

        val viewHolder = FlowerViewHolder(view)
        val viewHolderReference = "@${viewHolder.hashCode().toString(16)}"
        Log.d(mTAG, "Creazione ViewHolder: $viewHolderReference")

        //val tv : TextView = view.findViewById(R.id.flower_text)
        //tv.setOnClickListener(onClickListener)

        return viewHolder
    }

    // Returns size of data list
    override fun getItemCount(): Int {
        return flowerList.size
    }

    // Il view holder non conosce tutti i dati
    // Displays data at a certain position
    override fun onBindViewHolder(holder: FlowerViewHolder, position: Int) {
        holder.bind(flowerList[position], position + 1)
        // Log only the ViewHolder reference hash
        val viewHolderReference = "@${holder.hashCode().toString(16)}"
        Log.d(mTAG, "Aggiornato il dato del ViewHolder: $viewHolderReference")
    }
}
