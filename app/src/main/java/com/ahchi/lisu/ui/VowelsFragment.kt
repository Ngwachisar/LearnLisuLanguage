package com.ahchi.lisu.ui


import android.media.MediaPlayer
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView

import com.ahchi.lisu.R
import com.ahchi.lisu.adapter.VowelsAdapter
import com.ahchi.lisu.adapter.vowelClickListener
import com.example.learnlisualphabet.model.Vowels

class VowelsFragment : Fragment(),vowelClickListener {

    private lateinit var mPlayer: MediaPlayer

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        var rootView = inflater.inflate(R.layout.fragment_vowels, container, false)
        //Vowels
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

        var recyclerView: RecyclerView = rootView.findViewById(R.id.recyclerVowels)
        recyclerView.apply {
            layoutManager = GridLayoutManager(context, 3)
            var consonantsAdapter = VowelsAdapter(vowelArray,context,this@VowelsFragment)
            adapter = consonantsAdapter
        }

        return rootView
    }

    override fun onClick(audio: Int) {
        var pause:Boolean = false
        var play:Boolean = false

        if(play || pause.equals(true)){
            pause = false
            play = false
            mPlayer.stop()
            mPlayer.reset()
            mPlayer.release()
            //audio is stopped here
        }

        if(pause.equals(false)){
            mPlayer = MediaPlayer.create(context,audio)
            play = true
            mPlayer.start()
        }else{
            mPlayer.seekTo(mPlayer.currentPosition)
            mPlayer.start()
            pause = false
        }
    }
}
