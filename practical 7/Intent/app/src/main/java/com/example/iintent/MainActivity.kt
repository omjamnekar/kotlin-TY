package com.example.iintent

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val data= findViewById<EditText>(R.id.txtMessage)
        val submit =findViewById<Button>(R.id.btnSend)

        submit.setOnClickListener {
            val i =Intent(applicationContext,SecondActivity::class.java)

            i.putExtra("message",data.text.toString())
            startActivity(i)
        }


    }


}