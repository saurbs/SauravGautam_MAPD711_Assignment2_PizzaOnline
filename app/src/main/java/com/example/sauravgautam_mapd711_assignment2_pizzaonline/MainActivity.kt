package com.example.sauravgautam_mapd711_assignment2_pizzaonline

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import android.content.Intent

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.pizzamenu,menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        val intent: Intent = when(item.itemId) {
            //meat supreme
            R.id.mtSup -> {
                //setContentView(R.layout.activity_mt_sup)
                Toast.makeText(this@MainActivity, "Selected Meat Supreme", Toast.LENGTH_LONG).show()
                Intent(this, MtSupAct::class.java)
            }
            //super hawaiian
            R.id.suHwn -> {
                //setContentView(R.layout.activity_su_hwn)
                Toast.makeText(this, "Selected Super Hawaiian", Toast.LENGTH_LONG).show()
                Intent(this, SuHwnAct::class.java)
            }
            //veggie
            R.id.veg -> {
                //setContentView(R.layout.activity_veg)
                Toast.makeText(this, "Selected Veggie", Toast.LENGTH_LONG).show()
                Intent(this, VegAct::class.java)
            }
            //Mediterranean
            R.id.medrn -> {
                //setContentView(R.layout.activity_medrn)
                Toast.makeText(this, "Selected Mediterranean", Toast.LENGTH_LONG).show()
                Intent(this, MedrnAct::class.java)
            }
            //cheddar supreme
            R.id.chSup -> {
                //setContentView(R.layout.activity_ch_sup)
                Toast.makeText(this, "Selected Cheddar Supreme", Toast.LENGTH_LONG).show()
                Intent(this, ChSupAct::class.java)
            }
            else -> {
                return super.onOptionsItemSelected(item)
            }
        }
        startActivity(intent)
        return true
    }
}