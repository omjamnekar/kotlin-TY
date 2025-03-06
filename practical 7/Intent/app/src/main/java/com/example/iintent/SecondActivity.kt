package com.example.iintent
import android.content.Intent
import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class SecondActivity :AppCompatActivity(){

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.second_activity)

       val displaytext =findViewById<TextView>(R.id.txtDisplay)
        displaytext.setText(intent.getStringExtra("message") ?: "No message received")


    }


}