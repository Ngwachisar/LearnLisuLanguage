package com.ahchi.lisu.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.ahchi.lisu.R
import com.ahchi.lisu.model.LessonDetail
import com.example.learnlisualphabet.model.Vowels

class IndexVowelsViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    var consonantsVowels = itemView.findViewById<TextView>(R.id.consonantsVowels)
}

class IndexVowelsAdapter (var indexVowelsList:ArrayList<Vowels>):
        RecyclerView.Adapter<IndexVowelsViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): IndexVowelsViewHolder {
        var view = LayoutInflater.from(parent.context).inflate(R.layout.index_vowels,parent,false)
        return IndexVowelsViewHolder(view)
    }

    override fun getItemCount(): Int {
        return indexVowelsList.size
    }

    override fun onBindViewHolder(holder: IndexVowelsViewHolder, position: Int) {
        holder.consonantsVowels.text = indexVowelsList[position].vowelsChar
    }
}