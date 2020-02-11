package com.ahchi.lisu.ui


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

import com.ahchi.lisu.R
import com.ahchi.lisu.adapter.ConsonantsAdapter
import com.ahchi.lisu.adapter.TonesAdapter
import com.ahchi.lisu.model.Tones
import com.example.learnlisualphabet.model.Consonants

class TonesFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        var rootView =  inflater.inflate(R.layout.fragment_tones, container, false)

        //Consonants
        var tonesLessonsList = ArrayList<Tones>()
        tonesLessonsList.add(Tones("Lesson1\n□ꓸ ꓟꓬꓸ ꓔꓲ"))
        tonesLessonsList.add(Tones("Lesson2\n□ꓹ ꓠꓸ ꓑꓳꓸ"))
        tonesLessonsList.add(Tones("Lesson3\n□ꓸꓸ ꓟꓬꓸꓸ ꓚꓬꓸ"))
        tonesLessonsList.add(Tones("Lesson4\n□ꓻ ꓟꓬꓸꓸ ꓑꓳꓸꓸ"))
        tonesLessonsList.add(Tones("Lesson5\n□ꓽ ꓟꓬꓸꓸ ꓙꓱꓸ"))
        tonesLessonsList.add(Tones("Lesson6\n□ꓼ ꓟꓬꓸꓸ ꓠ"))

        var recyclerTonesView:RecyclerView = rootView.findViewById(R.id.recyclerTonesList)
        recyclerTonesView.apply {
            layoutManager = LinearLayoutManager(context)
            var tonesAdapter = TonesAdapter(tonesLessonsList)
            adapter = tonesAdapter
        }
        return rootView
    }


}
