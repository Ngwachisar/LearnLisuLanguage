package com.ahchi.lisu.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.ahchi.lisu.R
import com.ahchi.lisu.ui.ConsonantsFragment
import com.example.learnlisualphabet.model.Consonants

class ConsonantsViewHolder(itemView: View):RecyclerView.ViewHolder(itemView){
    var txtConsonants = itemView.findViewById<TextView>(R.id.txtConsonants)
    var txtSameVoice = itemView.findViewById<TextView>(R.id.txtSameVoice)

    fun bind(audio: Int, consonantClickListener: consonantClickListener){
        itemView.setOnClickListener{
            consonantClickListener.onClick(audio)
        }
    }
}

class ConsonantsAdapter(var consonantsList:ArrayList<Consonants>, val context:Context, val consonantClickListener:consonantClickListener):RecyclerView.Adapter<ConsonantsViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ConsonantsViewHolder {
        var view = LayoutInflater.from(parent.context).inflate(R.layout.consonants,parent,false)
        return ConsonantsViewHolder(view)
    }

    override fun getItemCount(): Int {
        return consonantsList.size
    }

    override fun onBindViewHolder(holder: ConsonantsViewHolder, position: Int) {
        holder.txtConsonants.text = consonantsList[position].consonantChar
        holder.txtSameVoice.text = consonantsList[position].sameVoice
        holder.bind(consonantsList[position].consonantAudio,consonantClickListener)
    }
}

interface consonantClickListener{
    fun onClick(audio:Int)
}