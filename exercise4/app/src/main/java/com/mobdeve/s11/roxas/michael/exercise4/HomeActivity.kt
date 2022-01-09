package com.mobdeve.s11.roxas.michael.exercise4

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.android.material.snackbar.Snackbar
import com.mobdeve.s11.roxas.michael.exercise4.databinding.ActivityHomeBinding

class HomeActivity : AppCompatActivity() {
    private lateinit var  binding: ActivityHomeBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding  = ActivityHomeBinding.inflate(layoutInflater)

        val view = binding.root

        setContentView(view)


        if(intent.getStringExtra("USERNAME") != null){
            binding.username.setText(intent.getStringExtra("USERNAME").toString())
            binding.firstname.setText(intent.getStringExtra("FIRSTNAME").toString())
            binding.lastname.setText(intent.getStringExtra("LASTNAME").toString())
            binding.email.setText( intent.getStringExtra("EMAIL").toString())
            binding.birthday.setText( intent.getStringExtra("BIRTHDAY").toString())





        }


        binding.btncreateprofile.setOnClickListener{


            val intent = Intent(this, ProfileActivity::class.java)

            var savedUsername = binding.username.text.toString()
            var savedFirstName = binding.firstname.text.toString()
            var savedLastName = binding.lastname.text.toString()
            var savedEmail = binding.email.text.toString()
            var savedBday = binding.birthday.text.toString()

            intent.putExtra("sUSERNAME", savedUsername)
            intent.putExtra("sFIRSTNAME", savedFirstName)
            intent.putExtra("sLASTNAME", savedLastName)
            intent.putExtra("sEMAIL", savedEmail)
            intent.putExtra("sBIRTHDAY", savedBday)


            startActivity(intent)



        }
        binding.btnplaygame.setOnClickListener{




        }

    }
}