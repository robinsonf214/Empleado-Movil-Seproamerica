package com.example.seproamerica

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
   

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        
        val button = findViewById<Button>(R.id.button)
        button.setOnClickListener(){
            val editTextUser = findViewById<EditText>(R.id.editTextTextPersonName)
            val editTextPass = findViewById<EditText>(R.id.editTextTextPassword)
            val userAutorizado = "flota1"
            val passAutorizado = "flota1"
            val user = editTextUser.text.toString()
            val pass = editTextPass.text.toString()
            if (user == userAutorizado && pass == passAutorizado){
                callActivity(user)
            }
            else{

            }

        }
    }

    private fun callActivity(user: String) {

        val intent = Intent(this, inicioactividades::class.java).also{
            it.putExtra("User ", user)
            startActivity(it)
        }
    }
}