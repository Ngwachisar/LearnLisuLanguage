package com.ahchi.lisu.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.ahchi.lisu.R
import com.example.learnlisualphabet.model.Vowels
import kotlinx.android.synthetic.main.vowels.view.*

class VowelsViewHolder(itemView:View):RecyclerView.ViewHolder(itemView){
    var txtVowels = itemView.findViewById<TextView>(R.id.txtVowels)
    var txtSameVoice = itemView.findViewById<TextView>(R.id.txtSameVoice)

    fun bind(audio: Int, clickListener: vowelClickListener){
        itemView.setOnClickListener{
            clickListener.onClick(audio)
        }
    }
}

class VowelsAdapter (var vowelsList:ArrayList<Vowels>, val context:Context, val onClickListener:vowelClickListener):RecyclerView.Adapter<VowelsViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): VowelsViewHolder {
        var view = LayoutInflater.from(parent.context).inflate(R.layout.vowels,parent,false)
        return VowelsViewHolder(view)
    }

    override fun getItemCount(): Int {
        return vowelsList.size
    }

    override fun onBindViewHolder(holder: VowelsViewHolder, position: Int) {
        holder.txtVowels.text = vowelsList[position].vowelsChar
        holder.txtSameVoice.text = vowelsList[position].sameVoice
        holder.bind(vowelsList[position].vowelsAudio,onClickListener)
    }
}

interface vowelClickListener{
    fun onClick(audio:Int)
}