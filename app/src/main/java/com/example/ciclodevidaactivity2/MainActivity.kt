package com.example.ciclodevidaactivity2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    val tag = "MainActivity"
    //estado created (creada)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val helloText = findViewById<TextView>(R.id.Hello)
        //helloText.text = "Nuevo Saludo" no me deja acceder al metodo de la variable
        Log.d(tag, "onCreate")
    }

    //estado started (empesando)
    override fun onStart(){
        Log.d(tag, "onStart")
        super.onStart()
    }
    //estado Resumed (reanudado),pasa al primer plano, donde la app interactua con el usuario
    //hasta que sucede una llamada, navega a otra actividad, apague la pantalla.
    override fun onResume(){
        Log.d(tag, "onResume")
        super.onResume()
    }
    //Another activity comes into the foreground, otra actividad pasa a primer plano
    override fun onPause(){
        Log.d(tag, "onPause")
        super.onPause()
    }
    //the activity is no longer visible,la actividad ya no es visible
    //estado stopped(interrumpida), no puede ver la actividad
    //una actividad recien lanzada cubre la pantalla
    override fun onStop(){
        Log.d(tag, "onStop")
        super.onStop()
    }

    override fun onDestroy(){
        Log.d(tag, "onCreate")
        super.onDestroy()
    }

}