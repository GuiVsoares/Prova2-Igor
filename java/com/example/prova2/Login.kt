package com.example.prova2

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Login : AppCompatActivity() {
    lateinit var email:EditText
    lateinit var senha:EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_login)

        email = findViewById(R.id.email)
        senha = findViewById(R.id.senha)

    }
    private fun verifica (username: String, password:String):Boolean {
        return username=="admin" && password=="1234"
    }

    fun logar(view: View) {
        var username = email.text.toString()
        var password = senha.text.toString()

        if(verifica(username,password)) {
            var intent = Intent(this, Menu()::class.java)
            startActivity(intent)
            Toast.makeText(this, "WELCOME!!!", Toast. LENGTH_LONG).show()
        } else{
            Toast.makeText(this, "OH NOO, YOU CAN'T!!!", Toast. LENGTH_LONG).show()
        }

    }
}