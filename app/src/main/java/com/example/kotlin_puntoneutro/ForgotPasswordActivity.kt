package com.example.kotlin_puntoneutro

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class ForgotPasswordActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_forgot_password)

        // Flecha de regreso -> LoginActivity
        val backArrow = findViewById<ImageView>(R.id.back_arrow)
        backArrow.setOnClickListener {
            startActivity(Intent(this, LoginActivity::class.java))
            finish() // Cerrar ForgotPasswordActivity
        }

        // Botón Send Reset -> LoadingActivity (simulando envío)
        val btnSendReset = findViewById<Button>(R.id.btn_send_reset)
        btnSendReset.setOnClickListener {
            startActivity(Intent(this, LoadingActivity::class.java))
        }
    }
}