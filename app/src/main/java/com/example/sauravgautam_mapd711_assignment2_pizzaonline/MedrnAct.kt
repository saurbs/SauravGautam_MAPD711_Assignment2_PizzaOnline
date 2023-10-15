package com.example.sauravgautam_mapd711_assignment2_pizzaonline

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MedrnAct : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_medrn)
        val button = findViewById<Button>(R.id.button5medrn)


        button.setOnClickListener{
            SubBtn_Click()      // calls the subBtn_Click function when the button is clicked
        }
    }
    fun SubBtn_Click() {


        //Creating an intent to start second activity and pass data to it
        val intent = Intent(this, Checkout::class.java).also {


            //start second activity with intent
            startActivity(it)


        }
    }
}