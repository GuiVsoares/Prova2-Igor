package com.example.prova2

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class ConfirmFem : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_confirm_fem)

        val data = intent.getStringExtra("Data")
        val hora = intent.getStringExtra("Hora")

        val dataAgenFem = findViewById<TextView>(R.id.dataAgenFem)
        val horaAgenFem = findViewById<TextView>(R.id.horaAgenFem)

        dataAgenFem.text = data
        horaAgenFem.text = hora
    }

    fun agendarfinalfem (view: View) {
        var intent = Intent(this, FinalFem()::class.java)
        startActivity(intent)
        Toast.makeText(this, "IT AVALIABLE, CONGRATULATIONS!!!", Toast. LENGTH_LONG).show()
    }
}