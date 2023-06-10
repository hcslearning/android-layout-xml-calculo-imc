package cl.iplacex.stgoneira.calculoimc

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnCalcularIMC  = findViewById<Button>(R.id.btnCalcularIMC)
        val etPeso          = findViewById<EditText>(R.id.etPeso)
        val etAltura        = findViewById<EditText>(R.id.etAltura)
        val tvResultado     = findViewById<TextView>(R.id.tvResultadoIMC)

        btnCalcularIMC.setOnClickListener {
            val peso    = etPeso.text.toString().toDouble()
            val altura  = etAltura.text.toString().toDouble()
            val imc     = calcularIMC(peso, altura)
            tvResultado.text = "El IMC es: " + imc
        }
    }
}

fun calcularIMC(peso:Double, altura:Double):Double {
    val imc = peso / Math.pow(altura, 2.0)
    return imc
}