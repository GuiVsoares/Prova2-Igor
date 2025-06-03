package com.example.prova2

import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Close : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_close)


        val arrayAdapter : ArrayAdapter<*>

        val pessoas = arrayOf("JUAN - 1M", "CARLOS - 1M", "IGOR - 1M", "GABRIEL - 1M", "MARIA - 2KM", "JULIA - 5KM", "KETLIN - 10KM")

        var listaDePessoas  = findViewById<ListView>(R.id.listaClose)

        arrayAdapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, pessoas)

        listaDePessoas.adapter = arrayAdapter
    }
}