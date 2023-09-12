package com.example.nav

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.CheckBox
import android.widget.ProgressBar
import android.widget.RadioButton
import android.widget.RatingBar
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class Pagina1 : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pagina1)

        //Variables de los botones
        val btnSiguiente1: Button = findViewById(R.id.btnSiguiente1)
        val btnVolver1: Button = findViewById(R.id.btnVolver1)

        val btnSalir: Button = findViewById(R.id.btnSalir1)

        val btnPagina2: Button = findViewById(R.id.btnPag1_2)
        val btnPagina3: Button = findViewById(R.id.btnPag1_3)
        val btnPagina4: Button = findViewById(R.id.btnPag1_4)

        //Accion de boton siguiente
        btnSiguiente1.setOnClickListener{
            startActivity(Intent(this, Pagina2:: class.java))
        }

        //Accion de boton volver
        btnVolver1.setOnClickListener{
            startActivity(Intent(this, Pagina4:: class.java))
        }

        //setOnClickeListener para viajar entre paginas
        btnPagina2.setOnClickListener {
            startActivity(Intent(this, Pagina2:: class.java))
        }

        btnPagina3.setOnClickListener {
            startActivity(Intent(this, Pagina3:: class.java))
        }

        btnPagina4.setOnClickListener {
            startActivity(Intent(this, Pagina4:: class.java))
        }

        //Boton salir -> Pantalla de login
        btnSalir.setOnClickListener {
            startActivity(Intent(this, MainActivity:: class.java))
        }

        //Configuracion de ratingBar , progresBar , radioButton y checkBox
        val ratingBar: RatingBar = findViewById(R.id.ratingBar)

        val progresBar: ProgressBar = findViewById(R.id.progressBar)

        val radioButton1: RadioButton = findViewById(R.id.radioButton)
        val radioButton2: RadioButton = findViewById(R.id.radioButton2)

        val checkBox: CheckBox = findViewById(R.id.checkBox)


        //Barra de progreso
        progresBar.progress = 20
        progresBar.visibility = View.INVISIBLE



        //Obtener la calificacion seleccionada
        ratingBar.rating // no sirve para nada, pero lo puso el profe

        ratingBar.numStars = 5
        ratingBar.setOnRatingBarChangeListener{_,rating, _ ->
            Toast.makeText(this, "Calificacion: $rating", Toast.LENGTH_SHORT).show()
            progresBar.visibility = View.VISIBLE

        }

        //Seleccionar radioButton
        radioButton1.setOnClickListener {
            Toast.makeText(this, "Opcion 1 - Seleccionado", Toast.LENGTH_SHORT).show()
        }

        radioButton2.setOnClickListener {
            Toast.makeText(this, "Opcion 2 - Seleccionado", Toast.LENGTH_SHORT).show()
        }

        //checkBox funciones
        checkBox.setOnCheckedChangeListener { _, isChecked ->
            if(isChecked){
                Toast.makeText(this, "Marcado", Toast.LENGTH_SHORT).show()
            }
            else{
                Toast.makeText(this, "Desmarcado", Toast.LENGTH_SHORT).show()
            }
        }

    }
}