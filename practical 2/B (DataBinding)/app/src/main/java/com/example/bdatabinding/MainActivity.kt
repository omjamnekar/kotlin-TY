package com.example.bdatabinding

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val s:String =getString(R.string.myText);
        Toast.makeText(this,s,Toast.LENGTH_LONG).show();
    }


}