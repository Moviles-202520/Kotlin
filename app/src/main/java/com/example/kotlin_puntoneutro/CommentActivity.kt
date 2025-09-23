package com.example.kotlin_puntoneutro

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class CommentActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_comment)


        // Botón Sign In -> LoadingActivity
        val btnSignIn = findViewById<Button>(R.id.btn_comment)
        btnSignIn.setOnClickListener {
            startActivity(Intent(this, MainActivity::class.java))
        }
    }



}