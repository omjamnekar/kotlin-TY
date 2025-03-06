  package com.example.biialertdialog_tooverridebackbutton

import android.content.DialogInterface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import android.window.OnBackInvokedDispatcher
import androidx.appcompat.app.AlertDialog

  class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }


      override fun onBackPressed() {
          val myAlert =AlertDialog.Builder(this).create()
          myAlert.setCancelable(false)
          myAlert.setMessage("Go Back?")
          myAlert.setButton(AlertDialog.BUTTON_POSITIVE,"Yes",DialogInterface.OnClickListener { dialog, which ->

                myAlert.dismiss()
              super.onBackPressed()
          })

          myAlert.setButton(AlertDialog.BUTTON_NEGATIVE,"No",DialogInterface.OnClickListener { dialog, which ->

              Toast.makeText(this,"Not exiting",Toast.LENGTH_LONG).show()
          })

          myAlert.show()
      }
}