package com.example.json

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.TextView

class ListAdapter(val context:Context, val list: ArrayList<MyData>):BaseAdapter() {

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        val v:View =LayoutInflater.from(context).inflate(R.layout.row_layout,parent,false)

        val r =v.findViewById<TextView>(R.id.rno)
        val sn =v.findViewById<TextView>(R.id.sname)
        val gr =v.findViewById<TextView>(R.id.grade)

        r.text= list[position].rno.toString()
        sn.text =list[position].sname
        gr.text =list[position].grade

        return v
    }

    override fun getItem(position: Int): Any {
        return list[position]

    }

    override fun getItemId(position: Int): Long {
        return position.toLong()
    }

    override fun getCount(): Int {
        return list.size

    }
}