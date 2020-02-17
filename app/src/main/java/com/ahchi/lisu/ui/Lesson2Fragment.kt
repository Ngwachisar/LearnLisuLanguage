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

class Lesson2Fragment : Fragment() {

    private var consonantsArray:ArrayList<Consonants> = arrayListOf()
    private var cvArray:ArrayList<ConsonantsVowelsWord> = arrayListOf()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        var rootView =  inflater.inflate(R.layout.fragment_lesson2, container, false)

        //Consonants
        getIndexConsonantsItem()
        var recyclerIndexConsonantsView: RecyclerView = rootView.findViewById(R.id.recyclerIndexConsonants)
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
        consonantsArray.add(Consonants("ꓓ", "Ba", R.raw.a))
        consonantsArray.add(Consonants("ꓔ", "Pa", R.raw.b))
        consonantsArray.add(Consonants("ꓕ", "Pha", R.raw.c))
    }

    fun getIndexConsonantsVowelsItem() {
        cvArray = ArrayList<ConsonantsVowelsWord>()
        cvArray.add(ConsonantsVowelsWord("ꓯ"))
        cvArray.add(ConsonantsVowelsWord("ꓓꓯ"))
        cvArray.add(ConsonantsVowelsWord("ꓔꓯ"))
        cvArray.add(ConsonantsVowelsWord("ꓕꓯ"))

        cvArray.add(ConsonantsVowelsWord("ꓰ"))
        cvArray.add(ConsonantsVowelsWord("ꓓꓰ"))
        cvArray.add(ConsonantsVowelsWord("ꓔꓰ"))
        cvArray.add(ConsonantsVowelsWord("ꓕꓰ"))

        cvArray.add(ConsonantsVowelsWord("ꓱ"))
        cvArray.add(ConsonantsVowelsWord("ꓓꓱ"))
        cvArray.add(ConsonantsVowelsWord("ꓔꓱ"))
        cvArray.add(ConsonantsVowelsWord("ꓕꓱ"))

        cvArray.add(ConsonantsVowelsWord("ꓲ"))
        cvArray.add(ConsonantsVowelsWord("ꓓꓲ"))
        cvArray.add(ConsonantsVowelsWord("ꓔꓲ"))
        cvArray.add(ConsonantsVowelsWord("ꓕꓲ"))

        cvArray.add(ConsonantsVowelsWord("ꓳ"))
        cvArray.add(ConsonantsVowelsWord("ꓓꓳ"))
        cvArray.add(ConsonantsVowelsWord("ꓔꓳ"))
        cvArray.add(ConsonantsVowelsWord("ꓕꓳ"))

        cvArray.add(ConsonantsVowelsWord("ꓴ"))
        cvArray.add(ConsonantsVowelsWord("ꓓꓴ"))
        cvArray.add(ConsonantsVowelsWord("ꓔꓴ"))
        cvArray.add(ConsonantsVowelsWord("ꓕꓴ"))

        cvArray.add(ConsonantsVowelsWord("ꓵ"))
        cvArray.add(ConsonantsVowelsWord("ꓓꓵ"))
        cvArray.add(ConsonantsVowelsWord("ꓔꓵ"))
        cvArray.add(ConsonantsVowelsWord("ꓕꓵ"))

        cvArray.add(ConsonantsVowelsWord("ꓶ"))
        cvArray.add(ConsonantsVowelsWord("ꓓꓶ"))
        cvArray.add(ConsonantsVowelsWord("ꓔꓶ"))
        cvArray.add(ConsonantsVowelsWord("ꓕꓶ"))

        cvArray.add(ConsonantsVowelsWord("ꓷ"))
        cvArray.add(ConsonantsVowelsWord("ꓓꓷ"))
        cvArray.add(ConsonantsVowelsWord("ꓔꓷ"))
        cvArray.add(ConsonantsVowelsWord("ꓕꓷ"))
    }
}
