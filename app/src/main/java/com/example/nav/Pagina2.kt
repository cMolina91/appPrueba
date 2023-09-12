package com.example.nav

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Pagina2 : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pagina2)

        val btnSiguiente: Button = findViewById(R.id.btnSiguiente2)
        val btnVolver: Button = findViewById(R.id.btnVolver2)

        val btnSalir: Button = findViewById(R.id.btnSalir2)

        val btnPagina1: Button = findViewById(R.id.btnPag2_1)
        val btnPagina3: Button = findViewById(R.id.btnPag2_3)
        val btnPagina4: Button = findViewById(R.id.btnPag2_4)

        btnSiguiente.setOnClickListener{
            startActivity( Intent(this, Pagina3:: class.java))
        }

        btnVolver.setOnClickListener{
            startActivity(Intent(this, Pagina1:: class.java))
        }

        btnPagina1.setOnClickListener {
            startActivity(Intent(this, Pagina1:: class.java))
        }

        btnPagina3.setOnClickListener {
            startActivity(Intent(this, Pagina3:: class.java))
        }

        btnPagina4.setOnClickListener {
            startActivity(Intent(this, Pagina4:: class.java))
        }

        btnSalir.setOnClickListener {
            startActivity(Intent(this, MainActivity:: class.java))
        }
    }
}