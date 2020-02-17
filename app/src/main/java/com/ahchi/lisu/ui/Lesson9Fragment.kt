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

class Lesson9Fragment : Fragment() {

    private var consonantsArray: ArrayList<Consonants> = arrayListOf()
    private var cvArray: ArrayList<ConsonantsVowelsWord> = arrayListOf()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        var rootView =  inflater.inflate(R.layout.fragment_lesson9, container, false)

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
        consonantsArray.add(Consonants("ꓨ", "Ba", R.raw.a))
        consonantsArray.add(Consonants("ꓩ", "Pa", R.raw.b))
        consonantsArray.add(Consonants("ꓪ", "Pha", R.raw.c))
    }

    fun getIndexConsonantsVowelsItem() {
        cvArray = ArrayList<ConsonantsVowelsWord>()
        cvArray.add(ConsonantsVowelsWord("ꓯ"))
        cvArray.add(ConsonantsVowelsWord(""))
        cvArray.add(ConsonantsVowelsWord("ꓩꓯ"))
        cvArray.add(ConsonantsVowelsWord("ꓪꓯ"))

        cvArray.add(ConsonantsVowelsWord("ꓰ"))
        cvArray.add(ConsonantsVowelsWord(""))
        cvArray.add(ConsonantsVowelsWord("ꓩꓰ"))
        cvArray.add(ConsonantsVowelsWord("ꓪꓰ"))

        cvArray.add(ConsonantsVowelsWord("ꓱ"))
        cvArray.add(ConsonantsVowelsWord(""))
        cvArray.add(ConsonantsVowelsWord("ꓩꓱ"))
        cvArray.add(ConsonantsVowelsWord("ꓪꓱ"))

        cvArray.add(ConsonantsVowelsWord("ꓲ"))
        cvArray.add(ConsonantsVowelsWord(""))
        cvArray.add(ConsonantsVowelsWord("ꓩꓲ"))
        cvArray.add(ConsonantsVowelsWord("ꓪꓲ"))

        cvArray.add(ConsonantsVowelsWord("ꓳ"))
        cvArray.add(ConsonantsVowelsWord(""))
        cvArray.add(ConsonantsVowelsWord("ꓩꓳ"))
        cvArray.add(ConsonantsVowelsWord("ꓪꓳ"))

        cvArray.add(ConsonantsVowelsWord("ꓴ"))
        cvArray.add(ConsonantsVowelsWord(""))
        cvArray.add(ConsonantsVowelsWord("ꓩꓴ"))
        cvArray.add(ConsonantsVowelsWord("ꓪꓴ"))

        cvArray.add(ConsonantsVowelsWord("ꓵ"))
        cvArray.add(ConsonantsVowelsWord(""))
        cvArray.add(ConsonantsVowelsWord("ꓩꓵ"))
        cvArray.add(ConsonantsVowelsWord("ꓪꓵ"))

        cvArray.add(ConsonantsVowelsWord("ꓶ"))
        cvArray.add(ConsonantsVowelsWord(""))
        cvArray.add(ConsonantsVowelsWord("ꓩꓶ"))
        cvArray.add(ConsonantsVowelsWord("ꓪꓶ"))

        cvArray.add(ConsonantsVowelsWord("ꓷ"))
        cvArray.add(ConsonantsVowelsWord(""))
        cvArray.add(ConsonantsVowelsWord("ꓩꓷ"))
        cvArray.add(ConsonantsVowelsWord("ꓪꓷ"))
    }
}
