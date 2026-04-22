package com.example.recyclersample

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.WindowCompat
import org.w3c.dom.Text

class DetailActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Enable edge-to-edge display on API level < 35
        WindowCompat.enableEdgeToEdge(window)

        // Display the layout
        setContentView(R.layout.activity_detail)

        val text_flower = intent.getStringExtra(ARG_FLOWER_NAME)

        val flowerTV : TextView = findViewById(R.id.text_view)
        flowerTV.text = "${text_flower} ${getString(R.string.default_text_flower)}"
    }
    companion object{
        const val ARG_FLOWER_NAME = "chiavefiore"
    }
}