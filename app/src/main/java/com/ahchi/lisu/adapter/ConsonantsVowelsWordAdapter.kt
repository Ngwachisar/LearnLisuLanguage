package com.ahchi.lisu.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.ahchi.lisu.R
import com.ahchi.lisu.model.ConsonantsVowelsWord

class ConsonantsVowelsWordViewHolder(itemView: View):RecyclerView.ViewHolder(itemView){
    var indexCV = itemView.findViewById<TextView>(R.id.txtIndexCV)
}

class ConsonantsVowelsWordAdapter (var cvList:ArrayList<ConsonantsVowelsWord>):
        RecyclerView.Adapter<ConsonantsVowelsWordViewHolder>(){
    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): ConsonantsVowelsWordViewHolder {
        var view = LayoutInflater.from(parent.context).inflate(R.layout.index_consonantsvowels,parent,false)
        return ConsonantsVowelsWordViewHolder(view)
    }

    override fun getItemCount(): Int {
        return cvList.size
    }

    override fun onBindViewHolder(holder: ConsonantsVowelsWordViewHolder, position: Int) {
        holder.indexCV.text = cvList[position].cvChar
    }

}