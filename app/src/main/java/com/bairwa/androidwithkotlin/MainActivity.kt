package com.bairwa.androidwithkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.RadioButton
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    button.setOnClickListener {
       val checkmeatRadioButton=Rgmeat.checkedRadioButtonId
        val meat=findViewById<RadioButton>(checkmeatRadioButton)
        val cheese=chesse.isChecked
        val onion=onion.isChecked

        val res="you order a burger with \n"+"${meat.text}"+(if (cheese)"\ncheese" else " ")+(if(onion)"\nonion" else "")
        result.text=res
    }


    }
}
