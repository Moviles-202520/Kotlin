package com.example.kotlin_puntoneutro

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class RegisterActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

        // Tab Sign In -> LoginActivity
        val tabSignIn = findViewById<TextView>(R.id.tab_signin)
        tabSignIn.setOnClickListener {
            startActivity(Intent(this, LoginActivity::class.java))
            finish() // Cerrar RegisterActivity
        }

        // Botón Register -> LoadingActivity
        val btnRegister = findViewById<Button>(R.id.btn_register)
        btnRegister.setOnClickListener {
            startActivity(Intent(this, LoadingActivity::class.java))
        }
    }
}