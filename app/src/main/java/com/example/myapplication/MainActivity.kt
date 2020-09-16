package com.example.myapplication

import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*


//Fuente : https://dzone.com/articles/custom-spinner-for-android-application
class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val lista = listOf<Mood>(
            Mood(resources.getColor(R.color.blue, null), "Color1"),
            Mood(resources.getColor(R.color.purple, null), "Color2"),
            Mood(resources.getColor(R.color.green, null), "Color3"),
            Mood(resources.getColor(R.color.darkred, null), "Color4")
        )

        val adaptador = MoodArrayAdapter(this, lista)
        spinner1.adapter = adaptador

        spinner1.onItemSelectedListener = object :
            AdapterView.OnItemSelectedListener {
            override fun onItemSelected(p0: AdapterView<*>?, p1: View?, p2: Int, p3: Long) {

                val selectedItem = (p0?.selectedItem as Mood)
                if (selectedItem.description == "Color1") {
                    textView.setBackgroundResource(R.color.green)
                } else
                    if (selectedItem.description == "Color2") {
                        textView.setBackgroundResource(R.color.purple)
                    }
            }

            override fun onNothingSelected(p0: AdapterView<*>?) {
                TODO("Not yet implemented")
            }
        }
    }


}







