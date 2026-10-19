package com.example.myapplication

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        val texto = findViewById<EditText>(R.id.email_text)
        val pasword = findViewById<EditText>(R.id.editTextTextPassword)
        val comprobar = findViewById<Button>(R.id.but_signup)
        val resultado = findViewById<TextView>(R.id.text_resultado)

        comprobar.setOnClickListener {
            val pass = pasword.text.toString()
            val prueba = texto.text.toString()

            if (prueba == "hola" && pass == "jiji") {
                resultado.text = "Ok"
            } else {
                resultado.text = "Ko"
            }
        }
    }
}