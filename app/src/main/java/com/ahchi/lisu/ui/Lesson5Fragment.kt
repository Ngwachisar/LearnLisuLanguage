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

class Lesson5Fragment : Fragment() {

    private var consonantsArray: ArrayList<Consonants> = arrayListOf()
    private var cvArray: ArrayList<ConsonantsVowelsWord> = arrayListOf()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        var rootView = inflater.inflate(R.layout.fragment_lesson5, container, false)

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
        consonantsArray.add(Consonants("ꓜ", "Ba", R.raw.a))
        consonantsArray.add(Consonants("ꓝ", "Pa", R.raw.b))
        consonantsArray.add(Consonants("ꓞ", "Pha", R.raw.c))
    }

    fun getIndexConsonantsVowelsItem() {
        cvArray = ArrayList<ConsonantsVowelsWord>()
        cvArray.add(ConsonantsVowelsWord("ꓯ"))
        cvArray.add(ConsonantsVowelsWord("ꓜꓯ"))
        cvArray.add(ConsonantsVowelsWord("ꓝꓯ"))
        cvArray.add(ConsonantsVowelsWord("ꓞꓯ"))

        cvArray.add(ConsonantsVowelsWord("ꓰ"))
        cvArray.add(ConsonantsVowelsWord("ꓜꓰ"))
        cvArray.add(ConsonantsVowelsWord("ꓝꓰ"))
        cvArray.add(ConsonantsVowelsWord("ꓞꓰ"))

        cvArray.add(ConsonantsVowelsWord("ꓱ"))
        cvArray.add(ConsonantsVowelsWord("ꓜꓱ"))
        cvArray.add(ConsonantsVowelsWord("ꓝꓱ"))
        cvArray.add(ConsonantsVowelsWord("ꓞꓱ"))

        cvArray.add(ConsonantsVowelsWord("ꓲ"))
        cvArray.add(ConsonantsVowelsWord("ꓜꓲ"))
        cvArray.add(ConsonantsVowelsWord("ꓝꓲ"))
        cvArray.add(ConsonantsVowelsWord("ꓞꓲ"))

        cvArray.add(ConsonantsVowelsWord("ꓳ"))
        cvArray.add(ConsonantsVowelsWord("ꓜꓳ"))
        cvArray.add(ConsonantsVowelsWord("ꓝꓳ"))
        cvArray.add(ConsonantsVowelsWord("ꓞꓳ"))

        cvArray.add(ConsonantsVowelsWord("ꓴ"))
        cvArray.add(ConsonantsVowelsWord("ꓜꓴ"))
        cvArray.add(ConsonantsVowelsWord("ꓝꓴ"))
        cvArray.add(ConsonantsVowelsWord("ꓞꓴ"))

        cvArray.add(ConsonantsVowelsWord("ꓵ"))
        cvArray.add(ConsonantsVowelsWord("ꓜꓵ"))
        cvArray.add(ConsonantsVowelsWord("ꓝꓵ"))
        cvArray.add(ConsonantsVowelsWord("ꓞꓵ"))

        cvArray.add(ConsonantsVowelsWord("ꓶ"))
        cvArray.add(ConsonantsVowelsWord("ꓜꓶ"))
        cvArray.add(ConsonantsVowelsWord("ꓝꓶ"))
        cvArray.add(ConsonantsVowelsWord("ꓞꓶ"))

        cvArray.add(ConsonantsVowelsWord("ꓷ"))
        cvArray.add(ConsonantsVowelsWord("ꓜꓷ"))
        cvArray.add(ConsonantsVowelsWord("ꓝꓷ"))
        cvArray.add(ConsonantsVowelsWord("ꓞꓷ"))
    }
}
