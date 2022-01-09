package com.mobdeve.s11.roxas.michael.exercise2

import CustomListAdapter
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.LinearLayout
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.mobdeve.s11.roxas.michael.exercise2.databinding.ActivityMainBinding

class GameSaveActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private  var list: MutableList<Int> = mutableListOf(1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20)
    private  lateinit var recyleview: RecyclerView
    private var deletebtn: Button=  recyleview.findViewById(R.id.buttondelete)


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding  = ActivityMainBinding.inflate(layoutInflater)

        val view = binding.root

        setContentView(view)
        recyleview = binding.gamesavelist

        deletebtn.setOnClickListener{
            list.removeAt(3)
            print(list)
        }


    }
}

