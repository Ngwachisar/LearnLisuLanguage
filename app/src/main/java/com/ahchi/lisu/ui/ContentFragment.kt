package com.ahchi.lisu.ui


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageButton
import androidx.cardview.widget.CardView
import androidx.navigation.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

import com.ahchi.lisu.R
import com.ahchi.lisu.adapter.ContentsAdapter
import com.ahchi.lisu.model.Contents

/**
 * A simple [Fragment] subclass.
 */
class ContentFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        var root:View = inflater.inflate(R.layout.fragment_content, container, false)

        //go consonants table
        var btnGoConsonants = root.findViewById<CardView>(R.id.carViewConsonants)
        btnGoConsonants.setOnClickListener{view:View ->
            view.findNavController().navigate(R.id.action_contentFragment_to_consonantsFragment)
        }

        //go vowels table
        var btnVowels = root.findViewById<CardView>(R.id.cardViewVowels)
        btnVowels.setOnClickListener{view:View ->
            view.findNavController().navigate(R.id.action_contentFragment_to_vowelsFragment)
        }

        //go (consonants + vowels) table
        var btnConsonantsVowels = root.findViewById<CardView>(R.id.cardAlphabetDetail)
        btnConsonantsVowels.setOnClickListener{view:View ->
            view.findNavController().navigate(R.id.action_contentFragment_to_consonantsVowelsFragment)
        }

        //go tones table
        var btnTones = root.findViewById<CardView>(R.id.cardTones)
        btnTones.setOnClickListener{view:View ->
            view.findNavController().navigate(R.id.action_contentFragment_to_tonesFragment)
        }
        return root
    }

}
