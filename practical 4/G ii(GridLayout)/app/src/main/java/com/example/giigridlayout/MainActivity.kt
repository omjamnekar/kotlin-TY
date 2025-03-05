package com.example.giigridlayout

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val tiger =findViewById<ImageView>(R.id.imgTiger)
        val lion =findViewById<ImageView>(R.id.imgLion)
        val elephant =findViewById<ImageView>(R.id.imgElephant)
        val horse =findViewById<ImageView>(R.id.imgHorse)
        val giraffe=findViewById<ImageView>(R.id.imgGiraffe)
        val monkey =findViewById<ImageView>(R.id.imgMonkey)


        tiger.setOnClickListener {
        Toast.makeText(this,"Tiger",Toast.LENGTH_LONG).show();
        }

        lion.setOnClickListener {
            Toast.makeText(this,"Lion",Toast.LENGTH_LONG).show();
        }

        elephant.setOnClickListener {
            Toast.makeText(this,"Elephant",Toast.LENGTH_LONG).show();
        }

        horse.setOnClickListener {
            Toast.makeText(this,"Horse",Toast.LENGTH_LONG).show();
        }


        giraffe.setOnClickListener {
            Toast.makeText(this,"Giraffe",Toast.LENGTH_LONG).show();
        }

        monkey.setOnClickListener {
            Toast.makeText(this,"Monkey",Toast.LENGTH_LONG).show();
        }



    }
}