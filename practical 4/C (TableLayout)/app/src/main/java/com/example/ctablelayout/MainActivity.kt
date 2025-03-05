package com.example.ctablelayout

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


    var un =findViewById<EditText>(R.id.uname)
    var btn = findViewById<Button>(R.id.btnLogin)


    btn.setOnClickListener {
         var msg:String
         msg= un.text.toString()
        Toast.makeText(this,"Hello World $msg", Toast.LENGTH_LONG).show()


    }
    }
}