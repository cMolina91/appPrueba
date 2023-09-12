package com.example.nav

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Pagina3 : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pagina3)


        val btnSiguiente: Button = findViewById(R.id.btnSiguiente3)
        val btnVolver: Button = findViewById(R.id.btnVolver3)

        val btnSalir: Button = findViewById(R.id.btnSalir3)

        val btnPagina1: Button = findViewById(R.id.btnPag3_1)
        val btnPagina2: Button = findViewById(R.id.btnPag3_2)
        val btnPagina4: Button = findViewById(R.id.btnPag3_4)

        btnSiguiente.setOnClickListener{
            startActivity(Intent(this, Pagina4:: class.java))
        }

        btnVolver.setOnClickListener{
            startActivity(Intent(this, Pagina2:: class.java))
        }

        btnPagina1.setOnClickListener {
            startActivity(Intent(this, Pagina1:: class.java))
        }

        btnPagina2.setOnClickListener {
            startActivity(Intent(this, Pagina2:: class.java))
        }

        btnPagina4.setOnClickListener {
            startActivity(Intent(this, Pagina4:: class.java))
        }

        btnSalir.setOnClickListener {
            startActivity(Intent(this, MainActivity:: class.java))
        }
    }
}