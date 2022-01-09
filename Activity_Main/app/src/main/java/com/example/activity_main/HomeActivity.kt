package com.example.activity_main

import android.app.Activity
import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.example.activity_main.databinding.ActivityHomeBinding

class HomeActivity: AppCompatActivity() {

    var binding: ActivityHomeBinding? = null

    override fun onCreate(savedInstanceState: Bundle?){
        super.onCreate(savedInstanceState)
        binding = ActivityHomeBinding.inflate(layoutInflater)
        setContentView(binding!!.root)

        var bundle = intent.extras
        var usernameBundle = bundle!!.getString("username_bundle")
        var usernameExtra = intent.getStringExtra("username_extra")

        Log.i("Home Activity", "Username from Bundle: $usernameBundle")
        Log.i("Home Activity", "Username from Extra: $usernameExtra")
        binding!!.etMessage.text = "Hello World"
    }

}