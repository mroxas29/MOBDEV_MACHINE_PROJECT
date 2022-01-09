package com.mobdeve.s11.roxas.michael.exercise4

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.core.content.ContextCompat

import com.google.android.material.snackbar.Snackbar
import com.mobdeve.s11.roxas.michael.exercise4.databinding.ActivityHomeBinding
import com.mobdeve.s11.roxas.michael.exercise4.databinding.ActivityProfileBinding

class ProfileActivity : AppCompatActivity() {
    private lateinit var  binding: ActivityProfileBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        binding  = ActivityProfileBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)

        val view = binding.root

        setContentView(view)

        if(intent.getStringExtra("sUSERNAME") != "")
        {
            binding.textusername.setText(intent.getStringExtra("sUSERNAME").toString())
            binding.textfirstname.setText(intent.getStringExtra("sFIRSTNAME").toString())
            binding.textlastname.setText(intent.getStringExtra("sLASTNAME").toString())
            binding.textemail.setText(intent.getStringExtra("sEMAIL").toString())
            binding.textbirthdate.setText(intent.getStringExtra("sBIRTHDAY").toString())

            val snackbar = Snackbar.make(view, "Profile Loaded", Snackbar.LENGTH_LONG)
            snackbar.show()
        }




        binding.btnsaveprofile.setOnClickListener(){

            var username = binding.textusername.text.toString()
            var firstName = binding.textfirstname.text.toString()
            var lastName = binding.textlastname.text.toString()
            var email = binding.textemail.text.toString()
            var birthday = binding.textbirthdate.text.toString()


            val intent = Intent(this, HomeActivity::class.java)
            intent.putExtra("USERNAME", username)
            intent.putExtra("FIRSTNAME", firstName)
            intent.putExtra("LASTNAME", lastName)
            intent.putExtra("EMAIL", email)
            intent.putExtra("BIRTHDAY", birthday)


            startActivity(intent)

        }

    }
}