package com.mgh.pmdm.contador

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    var contador=0
    // Esto es un comentario
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Referencia al TextView
        val textViewContador=findViewById<TextView>(R.id.textViewContador)

        // Inicializamos el TextView con el contador a 0
        textViewContador.setText(contador.toString())

        // Referencia al botón
        val botonMas=findViewById<Button>(R.id.botonMas)

        // Asociaciamos una expresióin lambda como
        // respuesta (callback) al evento Clic sobre
        // el botón
        botonMas.setOnClickListener {
            contador++
            textViewContador.setText(contador.toString())
        }

        val botonMenos=findViewById<Button>(R.id.botonMenos)

        // Asociaciamos una expresióin lambda como
        // respuesta (callback) al evento Clic sobre
        // el botón
        botonMenos.setOnClickListener {
            contador--
            textViewContador.setText(contador.toString())
        }



    }
}