package com.example.aservices

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val i =Intent(this,MyService::class.java)
        val start=findViewById<Button>(R.id.btnStart)
        val stop= findViewById<Button>(R.id.btnStop)


        start.setOnClickListener {
            Toast.makeText(this,"Service Started",Toast.LENGTH_LONG).show()
            startService(i)
        }
        stop.setOnClickListener {
            Toast.makeText(this,"service Stopped",Toast.LENGTH_LONG).show()
            stopService(i)
        }
    }

}

