package com.example.json

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListView
import org.json.JSONArray
import java.io.InputStream
import java.lang.Exception

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        jsonResult()
    }

    private fun jsonResult(){
        var res:String? =null
        try {
            val myStream :InputStream =assets.open("myData.json")
            res =myStream.bufferedReader().use{it.readText()}

        }catch (e:Exception){
            e.printStackTrace()
        }

        val ja= JSONArray(res)
        val list=ArrayList<MyData>()
        var i =0

        while (i< ja.length()){
            val jo =ja.getJSONObject(i)
            list.add(
                MyData(
                    jo.getInt("rno"),
                    jo.getString("sname"),
                    jo.getString("grade")
                )
            )
            i++
        }

        val a= ListAdapter(this,list)
        val lview =findViewById<ListView>(R.id.myListView)
        lview.adapter =a
    }
}