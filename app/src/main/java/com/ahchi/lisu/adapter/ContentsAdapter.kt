package com.ahchi.lisu.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.ahchi.lisu.R
import com.ahchi.lisu.model.Contents

class ContentsViewHolder(itemView: View):RecyclerView.ViewHolder(itemView){
    var name = itemView.findViewById<TextView>(R.id.txtContent)
}

class ContentsAdapter (var contentsList:ArrayList<Contents>):RecyclerView.Adapter<ContentsViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ContentsViewHolder {
        var view = LayoutInflater.from(parent.context).inflate(R.layout.contents,parent,false)
        return ContentsViewHolder(view)
    }

    override fun getItemCount(): Int {
        return contentsList.size
    }

    override fun onBindViewHolder(holder: ContentsViewHolder, position: Int) {
        holder.name.text = contentsList[position].contents
    }

}