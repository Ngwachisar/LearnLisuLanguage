package com.ahchi.lisu.ui


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView

import com.ahchi.lisu.R
import com.ahchi.lisu.adapter.ConsonantsVowelsWordAdapter
import com.ahchi.lisu.adapter.IndexConsonantsAdapter
import com.ahchi.lisu.model.ConsonantsVowelsWord
import com.example.learnlisualphabet.model.Consonants

class Lesson6Fragment : Fragment() {

    private var consonantsArray: ArrayList<Consonants> = arrayListOf()
    private var cvArray: ArrayList<ConsonantsVowelsWord> = arrayListOf()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        var rootView = inflater.inflate(R.layout.fragment_lesson6, container, false)

        //Consonants
        getIndexConsonantsItem()
        var recyclerIndexConsonantsView: RecyclerView =
            rootView.findViewById(R.id.recyclerIndexConsonants)
        recyclerIndexConsonantsView.apply {
            layoutManager = GridLayoutManager(context, 3)
            var indexConsonatsAdapter = IndexConsonantsAdapter(consonantsArray)
            adapter = indexConsonatsAdapter
        }

        //Consonants + Vowels
        getIndexConsonantsVowelsItem()
        var reyclerIndexCVView: RecyclerView = rootView.findViewById(R.id.recyclerIndexCV)
        reyclerIndexCVView.apply {
            layoutManager = GridLayoutManager(context, 4)
            var indexCVAdapter = ConsonantsVowelsWordAdapter(cvArray)
            adapter = indexCVAdapter
        }

        return rootView
    }

    fun getIndexConsonantsItem() {
        consonantsArray = ArrayList<Consonants>()
        consonantsArray.add(Consonants("ꓟ", "Ba", R.raw.a))
        consonantsArray.add(Consonants("ꓠ", "Pa", R.raw.b))
        consonantsArray.add(Consonants("ꓡ", "Pha", R.raw.c))
    }

    fun getIndexConsonantsVowelsItem() {
        cvArray = ArrayList<ConsonantsVowelsWord>()
        cvArray.add(ConsonantsVowelsWord("ꓯ"))
        cvArray.add(ConsonantsVowelsWord("ꓟꓯ"))
        cvArray.add(ConsonantsVowelsWord("ꓠꓯ"))
        cvArray.add(ConsonantsVowelsWord("ꓡꓯ"))

        cvArray.add(ConsonantsVowelsWord("ꓰ"))
        cvArray.add(ConsonantsVowelsWord("ꓟꓰ"))
        cvArray.add(ConsonantsVowelsWord("ꓠꓰ"))
        cvArray.add(ConsonantsVowelsWord("ꓡꓰ"))

        cvArray.add(ConsonantsVowelsWord("ꓱ"))
        cvArray.add(ConsonantsVowelsWord("ꓟꓱ"))
        cvArray.add(ConsonantsVowelsWord("ꓠꓱ"))
        cvArray.add(ConsonantsVowelsWord("ꓡꓱ"))

        cvArray.add(ConsonantsVowelsWord("ꓲ"))
        cvArray.add(ConsonantsVowelsWord("ꓟꓲ"))
        cvArray.add(ConsonantsVowelsWord("ꓠꓲ"))
        cvArray.add(ConsonantsVowelsWord("ꓡꓲ"))

        cvArray.add(ConsonantsVowelsWord("ꓳ"))
        cvArray.add(ConsonantsVowelsWord("ꓟꓳ"))
        cvArray.add(ConsonantsVowelsWord("ꓠꓳ"))
        cvArray.add(ConsonantsVowelsWord("ꓡꓳ"))

        cvArray.add(ConsonantsVowelsWord("ꓴ"))
        cvArray.add(ConsonantsVowelsWord("ꓟꓴ"))
        cvArray.add(ConsonantsVowelsWord("ꓠꓴ"))
        cvArray.add(ConsonantsVowelsWord("ꓡꓴ"))

        cvArray.add(ConsonantsVowelsWord("ꓵ"))
        cvArray.add(ConsonantsVowelsWord("ꓟꓵ"))
        cvArray.add(ConsonantsVowelsWord("ꓠꓵ"))
        cvArray.add(ConsonantsVowelsWord("ꓡꓵ"))

        cvArray.add(ConsonantsVowelsWord("ꓶ"))
        cvArray.add(ConsonantsVowelsWord("ꓟꓶ"))
        cvArray.add(ConsonantsVowelsWord("ꓠꓶ"))
        cvArray.add(ConsonantsVowelsWord("ꓡꓶ"))

        cvArray.add(ConsonantsVowelsWord("ꓷ"))
        cvArray.add(ConsonantsVowelsWord("ꓟꓷ"))
        cvArray.add(ConsonantsVowelsWord("ꓠꓷ"))
        cvArray.add(ConsonantsVowelsWord("ꓡꓷ"))
    }
}
