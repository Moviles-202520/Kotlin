package com.example.kotlin_puntoneutro

import android.content.Intent
import android.os.Bundle
import android.widget.Button

import androidx.appcompat.app.AppCompatActivity





class ProfileActivity: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile)

        val btnLogOut = findViewById<Button>(R.id.btn_logout)
        btnLogOut.setOnClickListener {
            startActivity(Intent(this, LogOutActivity::class.java))
        }




    }


}


