package com.asiguenza.ejercicio2intents

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.AlarmClock
import android.widget.TextView
import com.asiguenza.ejercicio2intents.databinding.ActivityAlarmBinding


class AlarmActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_alarm)

        val binding = ActivityAlarmBinding.inflate(layoutInflater).apply {
            setContentView(root)
            button.setOnClickListener {

                //Asignamos lo que proviene del EditText a una variable
                val nombre = findViewById<TextView>(R.id.nombre)
                val hora = findViewById<TextView>(R.id.hora)
                val minuto = findViewById<TextView>(R.id.minuto)

                //Convertimos estas variables a el tipo de dato que queremos

                val nom = nombre.text.toString()
                val hor = hora.text.toString().toInt()
                val min = minuto.text.toString().toInt()



                val intentAlarma = Intent(AlarmClock.ACTION_SET_ALARM).apply {
                    putExtra(AlarmClock.EXTRA_MESSAGE, nom)
                    putExtra(AlarmClock.EXTRA_HOUR, hor)
                    putExtra(AlarmClock.EXTRA_MINUTES, min)
                    //putExtra(AlarmClock.EXTRA_SKIP_UI, true)
                }
                startActivity(intentAlarma)
            }
        }
    }
}