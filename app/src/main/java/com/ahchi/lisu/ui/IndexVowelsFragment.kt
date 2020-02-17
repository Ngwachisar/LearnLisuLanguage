package com.ahchi.lisu.ui


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

import com.ahchi.lisu.R
import com.ahchi.lisu.adapter.IndexVowelsAdapter
import com.example.learnlisualphabet.model.Vowels

/**
 * A simple [Fragment] subclass.
 */
class IndexVowelsFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        var view =  inflater.inflate(R.layout.fragment_index_vowels, container, false)

        var vowelArray = ArrayList<Vowels>()
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


        var recyclerView1: RecyclerView = view.findViewById(R.id.recyclerIndexVowels)
        recyclerView1.apply {
            layoutManager = LinearLayoutManager(context)
            var vowelsAdapter = IndexVowelsAdapter(vowelArray)
            adapter = vowelsAdapter
        }

        return view
    }


}
