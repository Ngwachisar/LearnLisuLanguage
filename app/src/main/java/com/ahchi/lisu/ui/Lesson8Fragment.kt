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

class Lesson8Fragment : Fragment() {

    private var consonantsArray: ArrayList<Consonants> = arrayListOf()
    private var cvArray: ArrayList<ConsonantsVowelsWord> = arrayListOf()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        var rootView = inflater.inflate(R.layout.fragment_lesson8, container, false)

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
        consonantsArray.add(Consonants("ꓥ", "Ba", R.raw.a))
        consonantsArray.add(Consonants("ꓦ", "Pa", R.raw.b))
        consonantsArray.add(Consonants("ꓡ", "Pha", R.raw.c))
    }

    fun getIndexConsonantsVowelsItem() {
        cvArray = ArrayList<ConsonantsVowelsWord>()
        cvArray.add(ConsonantsVowelsWord("ꓯ"))
        cvArray.add(ConsonantsVowelsWord("ꓥꓯ"))
        cvArray.add(ConsonantsVowelsWord("ꓦꓯ"))
        cvArray.add(ConsonantsVowelsWord("ꓧꓯ"))

        cvArray.add(ConsonantsVowelsWord("ꓰ"))
        cvArray.add(ConsonantsVowelsWord("ꓥꓰ"))
        cvArray.add(ConsonantsVowelsWord("ꓦꓰ"))
        cvArray.add(ConsonantsVowelsWord("ꓧꓰ"))

        cvArray.add(ConsonantsVowelsWord("ꓱ"))
        cvArray.add(ConsonantsVowelsWord("ꓥꓱ"))
        cvArray.add(ConsonantsVowelsWord("ꓦꓱ"))
        cvArray.add(ConsonantsVowelsWord("ꓧꓱ"))

        cvArray.add(ConsonantsVowelsWord("ꓲ"))
        cvArray.add(ConsonantsVowelsWord("ꓥꓲ"))
        cvArray.add(ConsonantsVowelsWord("ꓦꓲ"))
        cvArray.add(ConsonantsVowelsWord("ꓧꓲ"))

        cvArray.add(ConsonantsVowelsWord("ꓳ"))
        cvArray.add(ConsonantsVowelsWord("ꓥꓳ"))
        cvArray.add(ConsonantsVowelsWord("ꓦꓳ"))
        cvArray.add(ConsonantsVowelsWord("ꓧꓳ"))

        cvArray.add(ConsonantsVowelsWord("ꓴ"))
        cvArray.add(ConsonantsVowelsWord("ꓥꓴ"))
        cvArray.add(ConsonantsVowelsWord("ꓦꓴ"))
        cvArray.add(ConsonantsVowelsWord("ꓧꓴ"))

        cvArray.add(ConsonantsVowelsWord("ꓵ"))
        cvArray.add(ConsonantsVowelsWord("ꓥꓵ"))
        cvArray.add(ConsonantsVowelsWord("ꓦꓵ"))
        cvArray.add(ConsonantsVowelsWord("ꓧꓵ"))

        cvArray.add(ConsonantsVowelsWord("ꓶ"))
        cvArray.add(ConsonantsVowelsWord("ꓥꓶ"))
        cvArray.add(ConsonantsVowelsWord("ꓦꓶ"))
        cvArray.add(ConsonantsVowelsWord("ꓧꓶ"))

        cvArray.add(ConsonantsVowelsWord("ꓷ"))
        cvArray.add(ConsonantsVowelsWord("ꓥꓷ"))
        cvArray.add(ConsonantsVowelsWord("ꓦꓷ"))
        cvArray.add(ConsonantsVowelsWord("ꓧꓷ"))
    }
}
