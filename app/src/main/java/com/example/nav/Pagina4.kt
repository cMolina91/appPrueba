package com.example.nav

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Pagina4 : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pagina4)


        val btnSiguiente: Button = findViewById(R.id.btnSiguiente4)
        val btnVolver: Button = findViewById(R.id.btnVolver4)

        val btnSalir: Button = findViewById(R.id.btnSalir4)

        val btnPagina1: Button = findViewById(R.id.btnPag4_1)
        val btnPagina2: Button = findViewById(R.id.btnPag4_2)
        val btnPagina3: Button = findViewById(R.id.btnPag4_3)


        btnSiguiente.setOnClickListener{
            startActivity(Intent(this, Pagina1:: class.java))
        }

        btnVolver.setOnClickListener{
            startActivity(Intent(this, Pagina3:: class.java))
        }

        btnPagina1.setOnClickListener {
            startActivity(Intent(this, Pagina1:: class.java))
        }

        btnPagina2.setOnClickListener {
            startActivity(Intent(this, Pagina2:: class.java))
        }

        btnPagina3.setOnClickListener {
            startActivity(Intent(this, Pagina3:: class.java))
        }

        btnSalir.setOnClickListener {
            startActivity(Intent(this, MainActivity:: class.java))
        }


    }
}