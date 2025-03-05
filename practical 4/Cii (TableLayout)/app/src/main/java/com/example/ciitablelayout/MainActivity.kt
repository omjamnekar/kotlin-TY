package com.example.ciitablelayout

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var b1 = findViewById<Button>(R.id.btn1)
        var b2 = findViewById<Button>(R.id.btn2)
        var b3 = findViewById<Button>(R.id.btn3)
        var b4 = findViewById<Button>(R.id.btn4)
        var b5 = findViewById<Button>(R.id.btn5)
        var b6 = findViewById<Button>(R.id.btn6)

        b1.setOnClickListener {
            Toast.makeText(this,"Button 1",Toast.LENGTH_LONG).show()

        }
        b2.setOnClickListener {
            Toast.makeText(this,"Button 2",Toast.LENGTH_LONG).show()

        }
        b3.setOnClickListener {
            Toast.makeText(this,"Button 3",Toast.LENGTH_LONG).show()

        }
        b4.setOnClickListener {
            Toast.makeText(this,"Button 4",Toast.LENGTH_LONG).show()

        }
        b5.setOnClickListener {
            Toast.makeText(this,"Button 5",Toast.LENGTH_LONG).show()

        }
        b6.setOnClickListener {
            Toast.makeText(this,"Button 6",Toast.LENGTH_LONG).show()

        }
    }



}