package com.example.filistview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    val sub = arrayOf<String>("STQA","FGIS","IS","AP","BIDA");
        val lview =findViewById<ListView>(R.id.myList);
        lview.adapter = ArrayAdapter<String>(this,com.google.android.material.R.layout.support_simple_spinner_dropdown_item,sub);

        lview.onItemClickListener = AdapterView.OnItemClickListener { parent, view, position, id ->

            Toast.makeText(this,"the Selected\n"+sub[position],Toast.LENGTH_LONG).show()
        }

    }
}