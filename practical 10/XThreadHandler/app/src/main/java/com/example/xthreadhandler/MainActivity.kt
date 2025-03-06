package com.example.xthreadhandler

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val view =findViewById<TextView>(R.id.txtDisplay)
        val random  =findViewById<Button>(R.id.submit)

        random.setOnClickListener {
             val h =Handler()
            Toast.makeText(
                    this,
                    "Random Number will be generate in 5 seconds",
                    Toast.LENGTH_LONG
                ).show()

                h.postDelayed(
                    {
                        val num =(Math.random() * 100) .toInt()
                        view.setText(num.toString())
                    },
                    5000
                )


        }
    }
}