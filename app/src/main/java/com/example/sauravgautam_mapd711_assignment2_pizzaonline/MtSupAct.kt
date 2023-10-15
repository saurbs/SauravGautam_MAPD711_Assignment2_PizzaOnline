package com.example.sauravgautam_mapd711_assignment2_pizzaonline

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.RadioButton
import android.widget.RadioGroup
import android.widget.TextView
import android.widget.Toast

class MtSupAct : AppCompatActivity() {
    var radio: RadioGroup? = null
    lateinit var radiobn: RadioButton
    private lateinit var buttonsnd: Button

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        radio = findViewById(R.id.radiogroupmtsup)
        buttonsnd = findViewById(R.id.buttonmtSup)

        val slt: Int = radio!!.checkedRadioButtonId
        radiobn = findViewById(slt)

        buttonsnd.setOnClickListener{
            val slt: Int? = radio?.checkedRadioButtonId
            val radiobn = findViewById<RadioButton>(slt)
            SubBtn_Click()
        }

    }
    fun SubBtn_Click() {

    }
}