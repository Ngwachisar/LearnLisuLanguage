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

class Lesson3Fragment : Fragment() {

    private var consonantsArray:ArrayList<Consonants> = arrayListOf()
    private var cvArray:ArrayList<ConsonantsVowelsWord> = arrayListOf()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        var rootView =  inflater.inflate(R.layout.fragment_lesson3, container, false)

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
        consonantsArray.add(Consonants("ꓖ", "Ba", R.raw.a))
        consonantsArray.add(Consonants("ꓗ", "Pa", R.raw.b))
        consonantsArray.add(Consonants("ꓘ", "Pha", R.raw.c))
    }

    fun getIndexConsonantsVowelsItem() {
        cvArray = ArrayList<ConsonantsVowelsWord>()
        cvArray.add(ConsonantsVowelsWord("ꓯ"))
        cvArray.add(ConsonantsVowelsWord("ꓖꓯ"))
        cvArray.add(ConsonantsVowelsWord("ꓗꓯ"))
        cvArray.add(ConsonantsVowelsWord("ꓘꓯ"))

        cvArray.add(ConsonantsVowelsWord("ꓰ"))
        cvArray.add(ConsonantsVowelsWord("ꓖꓰ"))
        cvArray.add(ConsonantsVowelsWord("ꓗꓰ"))
        cvArray.add(ConsonantsVowelsWord("ꓘꓰ"))

        cvArray.add(ConsonantsVowelsWord("ꓱ"))
        cvArray.add(ConsonantsVowelsWord("ꓖꓱ"))
        cvArray.add(ConsonantsVowelsWord("ꓗꓱ"))
        cvArray.add(ConsonantsVowelsWord("ꓘꓱ"))

        cvArray.add(ConsonantsVowelsWord("ꓲ"))
        cvArray.add(ConsonantsVowelsWord("ꓖꓲ"))
        cvArray.add(ConsonantsVowelsWord("ꓗꓲ"))
        cvArray.add(ConsonantsVowelsWord("ꓘꓲ"))

        cvArray.add(ConsonantsVowelsWord("ꓳ"))
        cvArray.add(ConsonantsVowelsWord("ꓖꓳ"))
        cvArray.add(ConsonantsVowelsWord("ꓗꓳ"))
        cvArray.add(ConsonantsVowelsWord("ꓘꓳ"))

        cvArray.add(ConsonantsVowelsWord("ꓴ"))
        cvArray.add(ConsonantsVowelsWord("ꓖꓴ"))
        cvArray.add(ConsonantsVowelsWord("ꓗꓴ"))
        cvArray.add(ConsonantsVowelsWord("ꓘꓴ"))

        cvArray.add(ConsonantsVowelsWord("ꓵ"))
        cvArray.add(ConsonantsVowelsWord("ꓖꓵ"))
        cvArray.add(ConsonantsVowelsWord("ꓗꓵ"))
        cvArray.add(ConsonantsVowelsWord("ꓘꓵ"))

        cvArray.add(ConsonantsVowelsWord("ꓶ"))
        cvArray.add(ConsonantsVowelsWord("ꓖꓶ"))
        cvArray.add(ConsonantsVowelsWord("ꓗꓶ"))
        cvArray.add(ConsonantsVowelsWord("ꓘꓶ"))

        cvArray.add(ConsonantsVowelsWord("ꓷ"))
        cvArray.add(ConsonantsVowelsWord("ꓖꓷ"))
        cvArray.add(ConsonantsVowelsWord("ꓗꓷ"))
        cvArray.add(ConsonantsVowelsWord("ꓘꓷ"))
    }
}
