package com.example.funcion_kotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        operacion("Mario Castillo",25)
    }
    private fun operacion(nombre: String, edad: Int){
        var cadena: String = ""
        var entero: Int = 0
        val tvResultado = findViewById(R.id.tvResultado) as TextView
        cadena = nombre
        entero = edad
        if(entero > 18){
            tvResultado.text = "Tu nombre es:"+ cadena + " tu edad es: " + edad + " años \n y eres mayor de edad"
        }

    }
}




