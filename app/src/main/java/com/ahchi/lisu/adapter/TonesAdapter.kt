package com.ahchi.lisu.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.ahchi.lisu.R
import com.ahchi.lisu.model.Tones

class TonesViewHolder(itemView: View):RecyclerView.ViewHolder(itemView){
    var tonesLessonName = itemView.findViewById<TextView>(R.id.txtLessonName)
}

class TonesAdapter (var tonesLessonList:ArrayList<Tones>):RecyclerView.Adapter<TonesViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TonesViewHolder {
        var view = LayoutInflater.from(parent.context).inflate(R.layout.tones,parent,false)
        return TonesViewHolder(view)
    }

    override fun getItemCount(): Int {
        return tonesLessonList.size
    }

    override fun onBindViewHolder(holder: TonesViewHolder, position: Int) {
        holder.tonesLessonName.text = tonesLessonList[position].lessonsName
    }

}