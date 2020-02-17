package com.ahchi.lisu.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.cardview.widget.CardView
import androidx.navigation.findNavController
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.ahchi.lisu.R
import com.ahchi.lisu.adapter.*
import com.ahchi.lisu.model.LessonDetail
import com.example.learnlisualphabet.model.Consonants
import com.example.learnlisualphabet.model.Vowels

class LessonFragment : Fragment() {

    private lateinit var vowelArray:ArrayList<Vowels>

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        var rootView =  inflater.inflate(R.layout.fragment_lesson, container, false)

//        var lessonDetailArray = ArrayList<LessonDetail>()
//        lessonDetailArray.add(LessonDetail("ꓮ","ꓐA",R.raw.a))
//        lessonDetailArray.add(LessonDetail("ꓯ","ꓐꓯ",R.raw.b))
//        lessonDetailArray.add(LessonDetail("ꓰ","ꓐE",R.raw.c))
//        lessonDetailArray.add(LessonDetail("ꓱ","ꓐꓱ",R.raw.d))
//        lessonDetailArray.add(LessonDetail("ꓲ","ꓐI",R.raw.e))
//        lessonDetailArray.add(LessonDetail("ꓳ","ꓐO",R.raw.f))
//        lessonDetailArray.add(LessonDetail("ꓴ","ꓐU",R.raw.g))
//        lessonDetailArray.add(LessonDetail("ꓵ","ꓐꓵ",R.raw.h))
//        lessonDetailArray.add(LessonDetail("ꓶ","ꓐꓶ",R.raw.i))
//        lessonDetailArray.add(LessonDetail("ꓷ","ꓐꓷ",R.raw.j))
//        lessonDetailArray.add(LessonDetail("ꓭ","ꓐꓭ",R.raw.k))


        return rootView
    }

    fun setIndexVowelsRecycler(){
        vowelArray = ArrayList<Vowels>()
        vowelArray.add(Vowels("ꓮ","A",R.raw.a))
        vowelArray.add(Vowels("ꓯ","AE",R.raw.b))
        vowelArray.add(Vowels("ꓰ","E",R.raw.c))
        vowelArray.add(Vowels("ꓱ","EU",R.raw.d))
        vowelArray.add(Vowels("ꓲ","I",R.raw.e))
        vowelArray.add(Vowels("ꓳ","O",R.raw.f))
        vowelArray.add(Vowels("ꓴ","U",R.raw.g))
        vowelArray.add(Vowels("ꓵ","UE",R.raw.h))
        vowelArray.add(Vowels("ꓶ","UH",R.raw.i))
        vowelArray.add(Vowels("ꓷ","OE",R.raw.j))
        vowelArray.add(Vowels("ꓭ","GHA",R.raw.k))

    }
}
