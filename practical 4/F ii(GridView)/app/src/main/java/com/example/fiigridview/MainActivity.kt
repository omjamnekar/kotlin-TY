package com.example.fiigridview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.ListView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val sub = arrayOf<String>("IS", "BIDA", "STQA", "BIDA", "FGIS");
        val lview = findViewById<ListView>(R.id.lview)
        val btn =findViewById<Button>(R.id.btnView)

        btn.setOnClickListener {
            lview.adapter = ArrayAdapter<String>(this,com.google.android.material.R.layout.support_simple_spinner_dropdown_item, sub)
        }

        lview.onItemClickListener =AdapterView.OnItemClickListener { parent, view, position, id ->

            Toast.makeText(this,"You Have Selected "+sub[position],Toast.LENGTH_LONG).show();
        }
    }
}