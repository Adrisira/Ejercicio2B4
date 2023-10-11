package com.asiguenza.ejercicio2intents

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.activity.result.ActivityResult
import androidx.activity.result.contract.ActivityResultContracts
import com.asiguenza.ejercicio2intents.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val binding = ActivityMainBinding.inflate(layoutInflater).apply {
            setContentView(root)

            val startForResult =
                registerForActivityResult(ActivityResultContracts.StartActivityForResult()) {
                        result: ActivityResult ->
                    if (result.resultCode == Activity.RESULT_OK) {
                        val intent = result.data
                    }
                }


            alarma.setOnClickListener {
                val i = Intent(this@MainActivity, AlarmActivity::class.java)
                 // BUNDLE
                //i.putExtra("identificado_del_bundle", et.text.toString())
                startForResult.launch(i)
            }

            web.setOnClickListener {
                val i = Intent(this@MainActivity, WebActivity::class.java)
                // BUNDLE
                //i.putExtra("identificado_del_bundle", et.text.toString())
                startForResult.launch(i)
            }

            irweb.setOnClickListener {
                val i = Intent(this@MainActivity, IrWebActivity::class.java)
                // BUNDLE
                //i.putExtra("identificado_del_bundle", et.text.toString())
                startForResult.launch(i)
            }
        }
    }
}