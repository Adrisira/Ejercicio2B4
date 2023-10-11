package com.asiguenza.ejercicio2intents

import android.app.SearchManager
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.asiguenza.ejercicio2intents.databinding.ActivityWebBinding



class WebActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_web)


        val binding = ActivityWebBinding.inflate(layoutInflater).apply {
            setContentView(root)

            button3.setOnClickListener(){
                val texto = findViewById<TextView>(R.id.busqueda)

                val text = busqueda.text.toString()

                val query = text
                val intentWeb = Intent(Intent.ACTION_WEB_SEARCH)
                intent.putExtra(SearchManager.QUERY, query)

                startActivity(intentWeb)
            }
        }
    }
}