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

class Lesson4Fragment : Fragment() {

    private var consonantsArray:ArrayList<Consonants> = arrayListOf()
    private var cvArray:ArrayList<ConsonantsVowelsWord> = arrayListOf()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        var rootView = inflater.inflate(R.layout.fragment_lesson4, container, false)

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
        var reyclerIndexCVView: RecyclerView = rootView.findViewById(R.id.recyclerIndexCV)
        reyclerIndexCVView.apply {
            layoutManager = GridLayoutManager(context,4)
            var indexCVAdapter = ConsonantsVowelsWordAdapter(cvArray)
            adapter = indexCVAdapter
        }

        return rootView
    }

    fun getIndexConsonantsItem() {
        consonantsArray = ArrayList<Consonants>()
        consonantsArray.add(Consonants("ꓙ", "Ba", R.raw.a))
        consonantsArray.add(Consonants("ꓚ", "Pa", R.raw.b))
        consonantsArray.add(Consonants("ꓛ", "Pha", R.raw.c))
    }

    fun getIndexConsonantsVowelsItem() {
        cvArray = ArrayList<ConsonantsVowelsWord>()
        cvArray.add(ConsonantsVowelsWord("ꓯ"))
        cvArray.add(ConsonantsVowelsWord("ꓙꓯ"))
        cvArray.add(ConsonantsVowelsWord("ꓚꓯ"))
        cvArray.add(ConsonantsVowelsWord("ꓛꓯ"))

        cvArray.add(ConsonantsVowelsWord("ꓰ"))
        cvArray.add(ConsonantsVowelsWord("ꓙꓰ"))
        cvArray.add(ConsonantsVowelsWord("ꓚꓰ"))
        cvArray.add(ConsonantsVowelsWord("ꓛꓰ"))

        cvArray.add(ConsonantsVowelsWord("ꓱ"))
        cvArray.add(ConsonantsVowelsWord("ꓙꓱ"))
        cvArray.add(ConsonantsVowelsWord("ꓚꓱ"))
        cvArray.add(ConsonantsVowelsWord("ꓛꓱ"))

        cvArray.add(ConsonantsVowelsWord("ꓲ"))
        cvArray.add(ConsonantsVowelsWord("ꓙꓲ"))
        cvArray.add(ConsonantsVowelsWord("ꓚꓲ"))
        cvArray.add(ConsonantsVowelsWord("ꓛꓲ"))

        cvArray.add(ConsonantsVowelsWord("ꓳ"))
        cvArray.add(ConsonantsVowelsWord("ꓙꓳ"))
        cvArray.add(ConsonantsVowelsWord("ꓚꓳ"))
        cvArray.add(ConsonantsVowelsWord("ꓛꓳ"))

        cvArray.add(ConsonantsVowelsWord("ꓴ"))
        cvArray.add(ConsonantsVowelsWord("ꓙꓴ"))
        cvArray.add(ConsonantsVowelsWord("ꓚꓴ"))
        cvArray.add(ConsonantsVowelsWord("ꓛꓴ"))

        cvArray.add(ConsonantsVowelsWord("ꓵ"))
        cvArray.add(ConsonantsVowelsWord("ꓙꓵ"))
        cvArray.add(ConsonantsVowelsWord("ꓚꓵ"))
        cvArray.add(ConsonantsVowelsWord("ꓛꓵ"))

        cvArray.add(ConsonantsVowelsWord("ꓶ"))
        cvArray.add(ConsonantsVowelsWord("ꓙꓶ"))
        cvArray.add(ConsonantsVowelsWord("ꓚꓶ"))
        cvArray.add(ConsonantsVowelsWord("ꓛꓶ"))

        cvArray.add(ConsonantsVowelsWord("ꓷ"))
        cvArray.add(ConsonantsVowelsWord("ꓙꓷ"))
        cvArray.add(ConsonantsVowelsWord("ꓚꓷ"))
        cvArray.add(ConsonantsVowelsWord("ꓛꓷ"))
    }
}
