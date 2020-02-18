package com.ahchi.lisu.ui


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.ahchi.lisu.R
import com.ahchi.lisu.adapter.ConsonantsVowelsLessonAdapter
import com.ahchi.lisu.model.ConsonantsVowelsLessons

class ConsonantsVowelsFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        var rootView = inflater.inflate(R.layout.fragment_consonants_vowels, container, false)

        var lessonList = ArrayList<ConsonantsVowelsLessons>()
        lessonList.add(ConsonantsVowelsLessons("Lesson1"))
        lessonList.add(ConsonantsVowelsLessons("Lesson2"))
        lessonList.add(ConsonantsVowelsLessons("Lesson3"))
        lessonList.add(ConsonantsVowelsLessons("Lesson4"))
        lessonList.add(ConsonantsVowelsLessons("Lesson5"))
        lessonList.add(ConsonantsVowelsLessons("Lesson6"))
        lessonList.add(ConsonantsVowelsLessons("Lesson7"))
        lessonList.add(ConsonantsVowelsLessons("Lesson8"))
        lessonList.add(ConsonantsVowelsLessons("Lesson9"))
        lessonList.add(ConsonantsVowelsLessons("Lesson10"))

        var recyclerLessonListView:RecyclerView = rootView.findViewById(R.id.recyclerLessonsList)
        recyclerLessonListView.apply {
            layoutManager = LinearLayoutManager(context)
            var lessonListAdapter = ConsonantsVowelsLessonAdapter(lessonList)
            adapter = lessonListAdapter
        }

        return  rootView
    }

}
