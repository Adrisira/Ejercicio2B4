package com.asiguenza.ejercicio2intents

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.asiguenza.ejercicio2intents.databinding.ActivityIrWebBinding


class IrWebActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ir_web)


        val binding = ActivityIrWebBinding.inflate(layoutInflater).apply {
            setContentView(root)

            button2.setOnClickListener(){
                contactos()
            }

        }
    }

    private fun contactos() {
        val uri = Uri.parse("content://contacts/people/")
        val intentContacts = Intent(Intent.ACTION_VIEW, uri)

        startActivity(intentContacts)
    }
}