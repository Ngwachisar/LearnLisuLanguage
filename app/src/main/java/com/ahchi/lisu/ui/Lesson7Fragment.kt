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

class Lesson7Fragment : Fragment() {

    private var consonantsArray: ArrayList<Consonants> = arrayListOf()
    private var cvArray: ArrayList<ConsonantsVowelsWord> = arrayListOf()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        var rootView = inflater.inflate(R.layout.fragment_lesson7, container, false)

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
        consonantsArray.add(Consonants("ꓢ", "Ba", R.raw.a))
        consonantsArray.add(Consonants("ꓣ", "Pa", R.raw.b))
        consonantsArray.add(Consonants("ꓡ", "Pha", R.raw.c))
    }

    fun getIndexConsonantsVowelsItem() {
        cvArray = ArrayList<ConsonantsVowelsWord>()
        cvArray.add(ConsonantsVowelsWord("ꓯ"))
        cvArray.add(ConsonantsVowelsWord("ꓢꓯ"))
        cvArray.add(ConsonantsVowelsWord("ꓣꓯ"))
        cvArray.add(ConsonantsVowelsWord("ꓤꓯ"))

        cvArray.add(ConsonantsVowelsWord("ꓰ"))
        cvArray.add(ConsonantsVowelsWord("ꓢꓰ"))
        cvArray.add(ConsonantsVowelsWord("ꓣꓰ"))
        cvArray.add(ConsonantsVowelsWord("ꓤꓰ"))

        cvArray.add(ConsonantsVowelsWord("ꓱ"))
        cvArray.add(ConsonantsVowelsWord("ꓢꓱ"))
        cvArray.add(ConsonantsVowelsWord("ꓣꓱ"))
        cvArray.add(ConsonantsVowelsWord("ꓤꓱ"))

        cvArray.add(ConsonantsVowelsWord("ꓲ"))
        cvArray.add(ConsonantsVowelsWord("ꓢꓲ"))
        cvArray.add(ConsonantsVowelsWord("ꓣꓲ"))
        cvArray.add(ConsonantsVowelsWord("ꓤꓲ"))

        cvArray.add(ConsonantsVowelsWord("ꓳ"))
        cvArray.add(ConsonantsVowelsWord("ꓢꓳ"))
        cvArray.add(ConsonantsVowelsWord("ꓣꓳ"))
        cvArray.add(ConsonantsVowelsWord("ꓤꓳ"))

        cvArray.add(ConsonantsVowelsWord("ꓴ"))
        cvArray.add(ConsonantsVowelsWord("ꓢꓴ"))
        cvArray.add(ConsonantsVowelsWord("ꓣꓴ"))
        cvArray.add(ConsonantsVowelsWord("ꓤꓴ"))

        cvArray.add(ConsonantsVowelsWord("ꓵ"))
        cvArray.add(ConsonantsVowelsWord("ꓢꓵ"))
        cvArray.add(ConsonantsVowelsWord("ꓣꓵ"))
        cvArray.add(ConsonantsVowelsWord("ꓤꓵ"))

        cvArray.add(ConsonantsVowelsWord("ꓶ"))
        cvArray.add(ConsonantsVowelsWord("ꓢꓶ"))
        cvArray.add(ConsonantsVowelsWord("ꓣꓶ"))
        cvArray.add(ConsonantsVowelsWord("ꓤꓶ"))

        cvArray.add(ConsonantsVowelsWord("ꓷ"))
        cvArray.add(ConsonantsVowelsWord("ꓢꓷ"))
        cvArray.add(ConsonantsVowelsWord("ꓣꓷ"))
        cvArray.add(ConsonantsVowelsWord("ꓤꓷ"))
    }
}
