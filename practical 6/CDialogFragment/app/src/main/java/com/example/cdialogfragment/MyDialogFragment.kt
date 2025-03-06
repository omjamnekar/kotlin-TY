package com.example.cdialogfragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.RadioButton
import android.widget.RadioGroup
import android.widget.TextView
import androidx.fragment.app.DialogFragment
import androidx.fragment.app.Fragment

class MyDialogFragment:DialogFragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }



    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        var rootView =inflater!!.inflate(R.layout.dialog_fragment,container,false)

        val cencel= rootView.findViewById<Button>(R.id.btnCancel)
        val sumbit= rootView.findViewById<Button>(R.id.btnSubmit)
        val gradeRG=rootView.findViewById<RadioGroup>(R.id.myRG)

        cencel.setOnClickListener {
            dismiss()
        }

        sumbit.setOnClickListener {
            var selectedId =gradeRG.checkedRadioButtonId

            var selectedRB =rootView.findViewById<RadioButton>(selectedId)

            var t =rootView.findViewById<TextView>(R.id.txtGrade)

            if(selectedRB.text=="O")
                t.text="OutStanding"
            else if (selectedRB.text=="A+")
                t.text="Excellent"
            else if (selectedRB.text== "A")
                t.text="Very Good"
            else if(selectedRB.text=="B+")
                t.text="Good"
            else if(selectedRB.text=="B")
                t.text="Above Average"
            else if(selectedRB.text=="C")
                t.text="Average"
            else if(selectedRB.text=="D")
                t.text="Pass"
            else if(selectedRB.text=="F")
                t.text="Fail"
        }
        return rootView
    }




}