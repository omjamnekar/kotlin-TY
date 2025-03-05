package com.example.bialertdialog

import android.content.DialogInterface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AlertDialog

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val submit= findViewById<Button>(R.id.btnSubmit)
        val uname =findViewById<EditText>(R.id.uname)

    var un:String
    submit.setOnClickListener {
         un =uname.text.toString()
        val myAlert= AlertDialog.Builder(this).create()

        myAlert.setTitle("Confirmation")
        myAlert.setMessage("Are you above 18 Years age?")
        myAlert.setButton(AlertDialog.BUTTON_POSITIVE,"Yes",DialogInterface.OnClickListener { dialog, which ->

            Toast.makeText(this,"$un can vote", Toast.LENGTH_LONG).show()

        })

        myAlert.setButton(AlertDialog.BUTTON_NEGATIVE,"No",DialogInterface.OnClickListener { dialog, which ->

            Toast.makeText(this,"$un cannot vote", Toast.LENGTH_LONG).show()

        })

        myAlert.setButton(AlertDialog.BUTTON_NEUTRAL,"Cancel",DialogInterface.OnClickListener { dialog, which ->

            Toast.makeText(this,"$un can vote", Toast.LENGTH_LONG).show()

        })

        myAlert.show()

    }
    }



}