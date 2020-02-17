package com.ahchi.lisu.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.ahchi.lisu.R
import com.example.learnlisualphabet.model.Consonants
import kotlinx.android.synthetic.main.fragment_lesson.view.*

class IndexConsonantsViewHolder(itemView:View):RecyclerView.ViewHolder(itemView){
    var indexConsonants = itemView.findViewById<TextView>(R.id.indexConsonants)
}

class IndexConsonantsAdapter (var consonantsList:ArrayList<Consonants>):RecyclerView.Adapter<IndexConsonantsViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): IndexConsonantsViewHolder {
        var view = LayoutInflater.from(parent.context).inflate(R.layout.index_consonants,parent,false)
        return IndexConsonantsViewHolder(view)
    }

    override fun getItemCount(): Int {
        return consonantsList.size
    }

    override fun onBindViewHolder(holder: IndexConsonantsViewHolder, position: Int) {
        holder.indexConsonants.text = consonantsList[position].consonantChar
    }
}