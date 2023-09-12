package com.example.nav

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import android.widget.Toast


class MainActivity : AppCompatActivity() {

    private lateinit var usernameEditText: EditText
    private lateinit var passwordEditText: EditText
    private lateinit var loginButton: Button


    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        usernameEditText = findViewById(R.id.txtUser)
        passwordEditText = findViewById(R.id.txtClave)
        loginButton = findViewById(R.id.btnIngresar)

        val imageView: ImageView = findViewById(R.id.imgCubo)
        imageView.setImageResource(R.drawable.img)

        loginButton.setOnClickListener {
            validarUsuario()
        }
    }

    private fun validarUsuario(){
        val usuario = usernameEditText.text.toString()
        val clave = passwordEditText.text.toString()

        if (usuario == "profe" && clave == "1234"){
            Toast.makeText(this, "Usuario Correcto", Toast.LENGTH_SHORT).show()
            startActivity(Intent(this, Pagina1:: class.java))
            finish()

        }
        else{
            Toast.makeText(this, "Usuario No Existe", Toast.LENGTH_SHORT).show()
        }
    }


}