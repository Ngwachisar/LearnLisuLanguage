package com.ahchi.lisu.ui


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView

import com.ahchi.lisu.R
import com.ahchi.lisu.adapter.TonesLessonAdapter
import com.ahchi.lisu.model.TonesLesson

class TonesLesson3Fragment : Fragment() {

    private var tonesLessonWordArray:ArrayList<TonesLesson> = arrayListOf()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        var rootView = inflater.inflate(R.layout.fragment_tones_lesson3, container, false)

        getTonesLessonItem()
        var reyclerTonesLessonView: RecyclerView = rootView.findViewById(R.id.recyclerTonesLesson)
        reyclerTonesLessonView.apply {
            layoutManager = GridLayoutManager(context,2)
            var indexCVAdapter = TonesLessonAdapter(tonesLessonWordArray)
            adapter = indexCVAdapter
        }

        return rootView
    }

    fun getTonesLessonItem(){
        tonesLessonWordArray = ArrayList<TonesLesson>()
        tonesLessonWordArray.add(TonesLesson("ꓔꓸꓸ ꓔꓸꓸ ꓓꓯꓸꓸ",  R.raw.a))
        tonesLessonWordArray.add(TonesLesson("ꓪꓸꓸ ꓟꓸꓸ",  R.raw.b))
        tonesLessonWordArray.add(TonesLesson("ꓢꓲꓸꓸ ꓡꓲꓸꓸ ꓟ",  R.raw.c))
    }
}
