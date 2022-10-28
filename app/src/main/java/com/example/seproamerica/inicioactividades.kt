package com.example.seproamerica

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class inicioactividades : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_inicioactividades)

        val user = intent.getStringExtra("User")
        val textView = findViewById<TextView>(R.id.textView).apply {
            text = user
        }


    }
}