package com.example.myapplication

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

//Fuente : https://dzone.com/articles/custom-spinner-for-android-application
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        spinner.adapter = MoodArrayAdapter(
            this,
            listOf(

                Mood(resources.getColor(R.color.blue, null), "Color1"),
                Mood(resources.getColor(R.color.purple, null), "Color2"),
                Mood(resources.getColor(R.color.green, null), "Color3"),
                Mood(resources.getColor(R.color.darkred, null), "Color4")
            //Si se trabaja con Fragment agregar Mood(context.resources.getColor(R.color.blue,null), "Angry")


            )
        )

    }


}


