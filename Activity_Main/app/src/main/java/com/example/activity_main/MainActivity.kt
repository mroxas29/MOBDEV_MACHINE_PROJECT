package com.example.activity_main

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    var et_username: TextView? = null
    var et_password: TextView? = null
    var btn_submit: Button? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        et_username = findViewById(R.id.et_username)
        et_password = findViewById(R.id.et_passwd)
        btn_submit = findViewById(R.id.btn_submit)

        btn_submit!!.setOnClickListener{
            Log.i("MainActivity","name: ${et_username?.text} pass:${et_password?.text}")

            Toast.makeText(applicationContext
            , "name: ${et_username?.text} pass:${et_password?.text}"
            , Toast.LENGTH_SHORT).show()

            var gotoHomeActivity = Intent(applicationContext, HomeActivity::class.java)

            var bundle = Bundle()
            bundle.putString("username", et_username!!.toString())

            gotoHomeActivity.putExtras(bundle)
            gotoHomeActivity.putExtra("username", et_username!!.text.toString())

            startActivity(gotoHomeActivity)
            finish()
        }
    }
}