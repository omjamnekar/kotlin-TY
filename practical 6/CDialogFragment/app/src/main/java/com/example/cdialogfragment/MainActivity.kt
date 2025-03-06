package com.example.cdialogfragment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        fun openFragment(){
            val fm= supportFragmentManager
            val myFragment  = MyDialogFragment()
            myFragment.show(fm,"My Fragment")
        }

        val gr=findViewById<Button>(R.id.btnStart)
        gr.setOnClickListener {
            openFragment()
        }
    }


}