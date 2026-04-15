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

import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

// L'adapter e' responsabile di TUTTI i dati
class FlowerAdapter(private val flowerList: Array<String>) :
    RecyclerView.Adapter<FlowerAdapter.FlowerViewHolder>() {
    private val mTAG = this.javaClass.simpleName

    // Describes an item view and its place within the RecyclerView
    class FlowerViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        private val flowerTextView: TextView = itemView.findViewById(R.id.flower_text)
        private val positionTextView: TextView = itemView.findViewById(R.id.position_text)

        fun bind(word: String, pos: Int) {
            flowerTextView.text = word
            positionTextView.text = pos.toString().padStart(2, '0')
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
