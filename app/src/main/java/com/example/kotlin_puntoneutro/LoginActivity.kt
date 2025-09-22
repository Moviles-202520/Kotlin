package com.example.kotlin_puntoneutro

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        // Botón Sign In -> LoadingActivity
        val btnSignIn = findViewById<Button>(R.id.btn_signin)
        btnSignIn.setOnClickListener {
            startActivity(Intent(this, LoadingActivity::class.java))
        }

        // Tab Register -> RegisterActivity
        val tabRegister = findViewById<TextView>(R.id.tab_register)
        tabRegister.setOnClickListener {
            startActivity(Intent(this, RegisterActivity::class.java))
        }

        // Forgot Password -> ForgotPasswordActivity
        val forgotPassword = findViewById<TextView>(R.id.forgot_password)
        forgotPassword.setOnClickListener {
            startActivity(Intent(this, ForgotPasswordActivity::class.java))
        }
    }
}