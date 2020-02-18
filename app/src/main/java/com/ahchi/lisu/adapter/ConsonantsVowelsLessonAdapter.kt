package com.ahchi.lisu.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.navigation.findNavController
import androidx.recyclerview.widget.RecyclerView
import com.ahchi.lisu.R
import com.ahchi.lisu.model.ConsonantsVowelsLessons

class ConsonantsVowelsLessonViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    var lessonName = itemView.findViewById<TextView>(R.id.txtLessonName)
    var clickArea = itemView.findViewById<CardView>(R.id.carViewChapter1)
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
        holder.clickArea.setOnClickListener { view: View ->
            when (lessonList[position].lesson1) {
                "Lesson1" -> view.findNavController().navigate(R.id.action_consonantsVowelsFragment_to_lessonFragment)
                "Lesson2" -> view.findNavController().navigate(R.id.action_consonantsVowelsFragment_to_lesson2Fragment)
                "Lesson3" -> view.findNavController().navigate(R.id.action_consonantsVowelsFragment_to_lesson3Fragment)
                "Lesson4" -> view.findNavController().navigate(R.id.action_consonantsVowelsFragment_to_lesson4Fragment)
                "Lesson5" -> view.findNavController().navigate(R.id.action_consonantsVowelsFragment_to_lesson5Fragment)
                "Lesson6" -> view.findNavController().navigate(R.id.action_consonantsVowelsFragment_to_lesson6Fragment)
                "Lesson7" -> view.findNavController().navigate(R.id.action_consonantsVowelsFragment_to_lesson7Fragment)
                "Lesson8" -> view.findNavController().navigate(R.id.action_consonantsVowelsFragment_to_lesson8Fragment)
                "Lesson9" -> view.findNavController().navigate(R.id.action_consonantsVowelsFragment_to_lesson9Fragment)
                else -> view.findNavController().navigate(R.id.action_consonantsVowelsFragment_to_lesson10Fragment)
            }
        }
    }
}