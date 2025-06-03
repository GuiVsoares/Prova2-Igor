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

class AgendamentoMasc : AppCompatActivity() {
    lateinit var data : EditText
    lateinit var hora : EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_agendamento_masc)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }

    fun confirmMasc(view: View) {
        data = findViewById(R.id.data)
        hora = findViewById(R.id.hora)
        var intent = Intent(this, ConfirmMasc()::class.java)
        intent.putExtra("Data", data.text.toString())
        intent.putExtra("Hora", hora.text.toString())
        startActivity(intent)
    }

    fun iconMasc(view:View) {
        Toast.makeText(this, "AGENDAAAA!!!", Toast. LENGTH_LONG).show()
    }
}