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

class ConfirmMasc : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_confirm_masc)

        val data = intent.getStringExtra("Data")
        val hora = intent.getStringExtra("Hora")

        val dataAgenFem = findViewById<TextView>(R.id.dataAgenMasc)
        val horaAgenFem = findViewById<TextView>(R.id.horaAgenMasc)

        dataAgenFem.text = data
        horaAgenFem.text = hora
    }

    fun agendarfinalmasc (view: View) {
        var intent = Intent(this, FinalMasc()::class.java)
        startActivity(intent)
        Toast.makeText(this, "THIS MAN IS AVALIABLE, CONGRATULATIONS!!!", Toast. LENGTH_LONG).show()
    }
}