package com.mobdeve.s11.roxas.michael.exercise1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.mobdeve.s11.roxas.michael.exercise1.databinding.ActivityMainBinding
import com.mobdeve.s11.roxas.michael.exercise1.databinding.ActivityProfileBinding

class ProfileActivity : AppCompatActivity() {

    private lateinit var binding: ActivityProfileBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


        binding  = ActivityProfileBinding.inflate(layoutInflater)

        val view = binding.root

        setContentView(view)

        binding.textusername.setText("Good Day, " + intent.getStringExtra("USERNAME" ).toString())

        binding.buttonBegin.setOnClickListener{
            val intent = Intent(this, GameActivity::class.java)
            startActivity(intent)

        }

    }
}