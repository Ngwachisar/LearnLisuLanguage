package com.ahchi.lisu.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.ahchi.lisu.R
import com.ahchi.lisu.model.ConsonantsVowelsLessons

class ConsonantsVowelsLessonViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    var lessonName = itemView.findViewById<TextView>(R.id.txtLessonName)
}

class ConsonantsVowelsLessonAdapter(var lessonList: ArrayList<ConsonantsVowelsLessons>) :
    RecyclerView.Adapter<ConsonantsVowelsLessonViewHolder>() {
    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): ConsonantsVowelsLessonViewHolder {
        var view = LayoutInflater.from(parent.context)
            .inflate(R.layout.consonants_vowels_lesson_list, parent, false)
        return ConsonantsVowelsLessonViewHolder(view)
    }

    override fun getItemCount(): Int {
        return lessonList.size
    }

    override fun onBindViewHolder(holder: ConsonantsVowelsLessonViewHolder, position: Int) {
        holder.lessonName.text = lessonList[position].lesson1
    }

}