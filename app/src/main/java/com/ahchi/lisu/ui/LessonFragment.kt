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
import com.ahchi.lisu.model.ConsonantsVowelsWord
import com.ahchi.lisu.model.LessonDetail
import com.example.learnlisualphabet.model.Consonants
import com.example.learnlisualphabet.model.Vowels
import kotlinx.android.synthetic.main.fragment_lesson.*

class LessonFragment : Fragment() {

    private var consonantsArray:ArrayList<Consonants> = arrayListOf()
    private var cvArray:ArrayList<ConsonantsVowelsWord> = arrayListOf()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        var rootView =  inflater.inflate(R.layout.fragment_lesson, container, false)

        //Consonants
        getIndexConsonantsItem()
        var recyclerIndexConsonantsView:RecyclerView = rootView.findViewById(R.id.recyclerIndexConsonants)
        recyclerIndexConsonantsView.apply {
            layoutManager = GridLayoutManager(context,3)
            var indexConsonatsAdapter = IndexConsonantsAdapter(consonantsArray)
            adapter = indexConsonatsAdapter
        }

        //Consonants + Vowels
        getIndexConsonantsVowelsItem()
        var reyclerIndexCVView:RecyclerView = rootView.findViewById(R.id.recyclerIndexCV)
        reyclerIndexCVView.apply {
            layoutManager = GridLayoutManager(context,4)
            var indexCVAdapter = ConsonantsVowelsWordAdapter(cvArray)
            adapter = indexCVAdapter
        }
        return rootView
    }

    fun getIndexConsonantsItem() {
        consonantsArray = ArrayList<Consonants>()
        consonantsArray.add(Consonants("ꓐ", "Ba", R.raw.a))
        consonantsArray.add(Consonants("ꓑ", "Pa", R.raw.b))
        consonantsArray.add(Consonants("ꓒ", "Pha", R.raw.c))
    }

    fun getIndexConsonantsVowelsItem() {
        cvArray = ArrayList<ConsonantsVowelsWord>()
        cvArray.add(ConsonantsVowelsWord("ꓯ"))
        cvArray.add(ConsonantsVowelsWord("ꓐꓯ"))
        cvArray.add(ConsonantsVowelsWord("ꓑꓯ"))
        cvArray.add(ConsonantsVowelsWord("ꓒꓯ"))

        cvArray.add(ConsonantsVowelsWord("ꓰ"))
        cvArray.add(ConsonantsVowelsWord("ꓐꓰ"))
        cvArray.add(ConsonantsVowelsWord("ꓑꓰ"))
        cvArray.add(ConsonantsVowelsWord("ꓒꓰ"))

        cvArray.add(ConsonantsVowelsWord("ꓱ"))
        cvArray.add(ConsonantsVowelsWord("ꓐꓱ"))
        cvArray.add(ConsonantsVowelsWord("ꓑꓱ"))
        cvArray.add(ConsonantsVowelsWord("ꓒꓱ"))

        cvArray.add(ConsonantsVowelsWord("ꓲ"))
        cvArray.add(ConsonantsVowelsWord("ꓐꓲ"))
        cvArray.add(ConsonantsVowelsWord("ꓑꓲ"))
        cvArray.add(ConsonantsVowelsWord("ꓒꓲ"))

        cvArray.add(ConsonantsVowelsWord("ꓳ"))
        cvArray.add(ConsonantsVowelsWord("ꓐꓳ"))
        cvArray.add(ConsonantsVowelsWord("ꓑꓳ"))
        cvArray.add(ConsonantsVowelsWord("ꓒꓳ"))

        cvArray.add(ConsonantsVowelsWord("ꓴ"))
        cvArray.add(ConsonantsVowelsWord("ꓐꓴ"))
        cvArray.add(ConsonantsVowelsWord("ꓑꓴ"))
        cvArray.add(ConsonantsVowelsWord("ꓒꓴ"))

        cvArray.add(ConsonantsVowelsWord("ꓵ"))
        cvArray.add(ConsonantsVowelsWord("ꓐꓵ"))
        cvArray.add(ConsonantsVowelsWord("ꓑꓵ"))
        cvArray.add(ConsonantsVowelsWord("ꓒꓵ"))

        cvArray.add(ConsonantsVowelsWord("ꓶ"))
        cvArray.add(ConsonantsVowelsWord("ꓐꓶ"))
        cvArray.add(ConsonantsVowelsWord("ꓑꓶ"))
        cvArray.add(ConsonantsVowelsWord("ꓒꓶ"))

        cvArray.add(ConsonantsVowelsWord("ꓷ"))
        cvArray.add(ConsonantsVowelsWord("ꓐꓷ"))
        cvArray.add(ConsonantsVowelsWord("ꓑꓷ"))
        cvArray.add(ConsonantsVowelsWord("ꓒꓷ"))

        cvArray.add(ConsonantsVowelsWord("ꓭ"))
        cvArray.add(ConsonantsVowelsWord("ꓐꓭ"))
    }
}
