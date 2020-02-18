package com.ahchi.lisu.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.ahchi.lisu.R
import com.ahchi.lisu.model.TonesLesson
import kotlinx.android.synthetic.main.tones_lesson_detail.view.*

class TonesLessonViewHolder(itemView: View):RecyclerView.ViewHolder(itemView){
    var word = itemView.txtWord
}

class TonesLessonAdapter (var wordList:ArrayList<TonesLesson>):RecyclerView.Adapter<TonesLessonViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TonesLessonViewHolder {
        var view = LayoutInflater.from(parent.context).inflate(R.layout.tones_lesson_detail,parent,false)
        return TonesLessonViewHolder(view)
    }

    override fun getItemCount(): Int {
        return wordList.size
    }

    override fun onBindViewHolder(holder: TonesLessonViewHolder, position: Int) {
        holder.word.text = wordList[position].word
    }
}