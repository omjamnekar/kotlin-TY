package com.example.amenu

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.google.android.material.bottomnavigation.BottomNavigationItemView
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {



    private val selectedItem = BottomNavigationView.OnNavigationItemSelectedListener{ item->
        when(item.itemId){

            R.id.video ->
            {
                val vf =VideoFragment()
                openFragement(vf)
                return@OnNavigationItemSelectedListener true
            }
            R.id.notes ->
            {
                val nf =NoteFragment()
                openFragement(nf)
                return@OnNavigationItemSelectedListener true

            }
            R.id.quiz ->
            {
                val qf =QuizFragment()
                openFragement(qf)
                return@OnNavigationItemSelectedListener true
            }

        }
        false
    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val nav =findViewById<BottomNavigationView>(R.id.navigation)
        nav.setOnNavigationItemSelectedListener(selectedItem)

    }


    private fun openFragement(f:Fragment){
        val t =supportFragmentManager.beginTransaction()
        t.replace(R.id.container,f)
        t.addToBackStack(null)
        t.commit()
    }







}