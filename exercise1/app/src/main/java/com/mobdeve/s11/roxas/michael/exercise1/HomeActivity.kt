package com.mobdeve.s11.roxas.michael.exercise1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import com.mobdeve.s11.roxas.michael.exercise1.databinding.ActivityMainBinding


class HomeActivity : AppCompatActivity() {
    private lateinit var username:EditText
    private lateinit var playBtn: Button

    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        binding  = ActivityMainBinding.inflate(layoutInflater)

        val view = binding.root

        setContentView(view)





        binding.btnplay.setOnClickListener{

            var user = binding.username.text.toString()

            val intent = Intent(this, ProfileActivity::class.java)
            intent.putExtra("USERNAME", user)
            startActivity(intent)

        }

    }
}