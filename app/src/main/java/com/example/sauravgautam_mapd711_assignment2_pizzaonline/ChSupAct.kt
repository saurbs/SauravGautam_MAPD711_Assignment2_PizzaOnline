package com.example.sauravgautam_mapd711_assignment2_pizzaonline

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.RadioButton
import android.widget.RadioGroup
import android.widget.Toast

class ChSupAct : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {

        var radioGroup: RadioGroup
         var radioButton: RadioButton
         var button: Button

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ch_sup)

        radioGroup = findViewById(R.id.radiogrpchSup)
        button = findViewById(R.id.button4chSup)

        val selectedOption: Int = radioGroup!!.checkedRadioButtonId

        radioButton = findViewById(selectedOption)

        button.setOnClickListener{

            //val selectedOption1: Int? = radioGroup.checkedRadioButtonId
            Button4chSupClick()

        }

    }
    fun Button4chSupClick(){
//
//        val intent = Intent(this, PizzaTops::class.java).also {
//            //val selectedOption1: Int? = radioGroup.checkedRadioButtonId
//            val sel = "okay"
//            Toast.makeText(this,"radio button selected", Toast.LENGTH_LONG).show()
//            it.putExtra("selectedOption_", sel)
//            startActivity(it)
//        }
    }

}