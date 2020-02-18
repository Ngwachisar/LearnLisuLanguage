package com.ahchi.lisu.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.navigation.findNavController
import androidx.recyclerview.widget.RecyclerView
import com.ahchi.lisu.R
import com.ahchi.lisu.model.Tones

class TonesViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    var tonesLessonName = itemView.findViewById<TextView>(R.id.txtLessonName)
    var clickArea = itemView.findViewById<CardView>(R.id.carViewChapter1)
}

class TonesAdapter(var tonesLessonList: ArrayList<Tones>) :
    RecyclerView.Adapter<TonesViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TonesViewHolder {
        var view = LayoutInflater.from(parent.context).inflate(R.layout.tones, parent, false)
        return TonesViewHolder(view)
    }

    override fun getItemCount(): Int {
        return tonesLessonList.size
    }

    override fun onBindViewHolder(holder: TonesViewHolder, position: Int) {
        holder.tonesLessonName.text = tonesLessonList[position].lessonsName
        holder.clickArea.setOnClickListener { view: View ->
            when (tonesLessonList[position].lessonsName) {
                "Lesson1\n□ꓸ ꓟꓬꓸ ꓔꓲ" -> view.findNavController().navigate(R.id.action_tonesFragment_to_tonesLesson1Fragment)
                "Lesson2\n□ꓹ ꓠꓸ ꓑꓳꓸ" -> view.findNavController().navigate(R.id.action_tonesFragment_to_tonesLesson2Fragment)
                "Lesson3\n□ꓸꓸ ꓟꓬꓸꓸ ꓚꓬꓸ" -> view.findNavController().navigate(R.id.action_tonesFragment_to_tonesLesson3Fragment)
                "Lesson4\n□ꓻ ꓟꓬꓸꓸ ꓑꓳꓸꓸ" -> view.findNavController().navigate(R.id.action_tonesFragment_to_tonesLesson4Fragment)
                "Lesson5\n□ꓽ ꓟꓬꓸꓸ ꓙꓱꓸ" -> view.findNavController().navigate(R.id.action_tonesFragment_to_tonesLesson5Fragment)
                else -> view.findNavController().navigate(R.id.action_tonesFragment_to_tonesLesson6Fragment)
           }
        }
    }

}