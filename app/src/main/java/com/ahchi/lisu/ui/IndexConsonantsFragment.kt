package com.ahchi.lisu.ui


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView

import com.ahchi.lisu.R
import com.ahchi.lisu.adapter.IndexConsonantsAdapter
import com.example.learnlisualphabet.model.Consonants

class IndexConsonantsFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        var view = inflater.inflate(R.layout.fragment_index_consonants, container, false)
        var consonantArray = ArrayList<Consonants>()
        consonantArray.add(Consonants("ꓐ","Ba", R.raw.a))
        consonantArray.add(Consonants("ꓑ","Pa", R.raw.b))
        consonantArray.add(Consonants("ꓒ","Pha", R.raw.c))

        var recyclerView: RecyclerView = view.findViewById(R.id.recyclerIndexConsonants)
        recyclerView.apply {
            layoutManager = GridLayoutManager(context, 3)
            var indexConsonantsAdapter = IndexConsonantsAdapter(consonantArray)
            adapter = indexConsonantsAdapter
        }
        return view
    }


}
