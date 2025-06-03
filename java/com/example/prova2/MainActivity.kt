package com.example.prova2

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AlertDialog
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
    }
    fun entrar(view: View) {
        AlertDialog.Builder(this)
            .setTitle("ARE YOU SURE!!??")
            .setMessage("IF YOU WANT SOME FUNNY MOMENTS, IF YOU KNOW WHAT AM SAYING... CLICK: 'YES'")
            .setPositiveButton("YES") {
                variavel, numeroOpcao -> var intent = Intent(this, Login()::class.java)
                                         startActivity(intent)
                                         Toast.makeText(this, "YEEEEESSSS!!!", Toast. LENGTH_LONG).show()
            }
            .setNegativeButton("NOO") {
                variavel, numeroOpcao -> finish()
            }
            .create()
            .show()
    }
}