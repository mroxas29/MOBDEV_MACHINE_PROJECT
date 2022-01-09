package com.mobdeve.s11.roxas.michael.exercise2
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class Save_VH (inflater: LayoutInflater, parent: ViewGroup):
    RecyclerView.ViewHolder(inflater.inflate(R.layout.item_row_save, parent, false)) {

        private var gameTextView: TextView? = null
        init{gameTextView = itemView.findViewById(R.id.textgamesave)}

    fun bind(saves: Int) {

        gameTextView?.text = "Game Save " + saves

    }


}