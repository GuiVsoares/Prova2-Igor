package com.example.prova2

import android.content.Intent
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.widget.LinearLayout
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Menu : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_menu)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        setSupportActionBar(findViewById(R.id.toolbar))
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        menuInflater.inflate(R.menu.menu_principal, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when(item?.itemId) {
            R.id.gay -> {
                var intent = Intent(this, ModelosMasculinos()::class.java)
                startActivity(intent)
                Toast.makeText(this, "GAAAAAAAAYYY!!!", Toast. LENGTH_LONG).show()
            }
            R.id.close -> {
                var intent = Intent(this, Close()::class.java)
                startActivity(intent)
                Toast.makeText(this, "CLOSE TO YOU HMM...", Toast. LENGTH_LONG).show()
            }
        }
        return true
    }

    fun perfil (view: View) {
        var intent = Intent(this, PerfilModeloFem()::class.java)
        startActivity(intent)
    }
}