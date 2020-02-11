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
import com.ahchi.lisu.adapter.ConsonantsAdapter
import com.ahchi.lisu.adapter.consonantClickListener
import com.example.learnlisualphabet.model.Consonants

class ConsonantsFragment : Fragment(),consonantClickListener {

    private lateinit var mPlayer: MediaPlayer

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        var rootView = inflater.inflate(R.layout.fragment_consonants, container, false)

        //Consonants
        var consonantArray = ArrayList<Consonants>()
        consonantArray.add(Consonants("ꓐ","Ba", R.raw.a))
        consonantArray.add(Consonants("ꓑ","Pa", R.raw.b))
        consonantArray.add(Consonants("ꓒ","Pha", R.raw.c))
        consonantArray.add(Consonants("ꓓ","Da", R.raw.d))
        consonantArray.add(Consonants("ꓔ","Ta", R.raw.e))
        consonantArray.add(Consonants("ꓕ","Tha", R.raw.f))
        consonantArray.add(Consonants("ꓖ","Ga", R.raw.g))
        consonantArray.add(Consonants("ꓗ","Ka", R.raw.h))
        consonantArray.add(Consonants("ꓘ","Kha", R.raw.i))
        consonantArray.add(Consonants("ꓩ","Ja", R.raw.j))
        consonantArray.add(Consonants("ꓚ","Ca", R.raw.k))
        consonantArray.add(Consonants("ꓛ","Cha", R.raw.l))
        consonantArray.add(Consonants("ꓜ","Dza", R.raw.m))
        consonantArray.add(Consonants("ꓝ","Tsa", R.raw.n))
        consonantArray.add(Consonants("ꓞ","Tsha", R.raw.o))
        consonantArray.add(Consonants("ꓟ","Ma", R.raw.p))
        consonantArray.add(Consonants("ꓠ","Na", R.raw.q))
        consonantArray.add(Consonants("ꓡ","La", R.raw.r))
        consonantArray.add(Consonants("ꓢ","Sa", R.raw.s))
        consonantArray.add(Consonants("ꓣ","Zha", R.raw.t))
        consonantArray.add(Consonants("ꓤ","Za", R.raw.u))
        consonantArray.add(Consonants("ꓥ","Nga", R.raw.w))
        consonantArray.add(Consonants("ꓦ","Ha", R.raw.x))
        consonantArray.add(Consonants("ꓧ","Xa", R.raw.y))
        consonantArray.add(Consonants("ꓨ","Hha", R.raw.z))
        consonantArray.add(Consonants("ꓩ","Fa", R.raw.w))
        consonantArray.add(Consonants("ꓪ","Wa", R.raw.x))
        consonantArray.add(Consonants("ꓫ","Sha", R.raw.y))
        consonantArray.add(Consonants("ꓬ","Ya", R.raw.z))

        var recyclerView:RecyclerView = rootView.findViewById(R.id.recyclerConsonants)
        recyclerView.apply {
            layoutManager = GridLayoutManager(context, 3)
            var consonantsAdapter = ConsonantsAdapter(consonantArray,context,this@ConsonantsFragment)
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
