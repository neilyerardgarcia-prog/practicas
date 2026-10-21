package com.example.myapplication

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.myapplication.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)

        enableEdgeToEdge()

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        ViewCompat.setOnApplyWindowInsetsListener(binding.root) { v, insets ->
            val systemBars = insets.getInsets(
                WindowInsetsCompat.Type.systemBars()
            )
            v.setPadding(
                systemBars.left,
                systemBars.top,
                systemBars.right,
                systemBars.bottom
            )
            insets
        }

        binding.butSignup.setOnClickListener {
            val email = binding.emailText.text.toString().trim()
            val password =
                binding.editTextTextPassword.text.toString().trim()

            if (email == "hola" && password == "jiji") {
                binding.textResultado.text = "Ok"
            } else {
                binding.textResultado.text = "Ko"
            }
        }

//        val texto = findViewById<EditText>(R.id.email_text)
//        val pasword = findViewById<EditText>(R.id.editTextTextPassword)
//        val comprobar = findViewById<Button>(R.id.but_signup)
//        val resultado = findViewById<TextView>(R.id.text_resultado)
//
//        comprobar.setOnClickListener {
//            val pass = pasword.text.toString()
//            val prueba = texto.text.aatoString()
//
//            if (prueba == "hola" && pass == "jiji") {
//                resultado.text = "Ok"
//            } else {
//                resultado.text = "Ko"
//            }

       }
    }
