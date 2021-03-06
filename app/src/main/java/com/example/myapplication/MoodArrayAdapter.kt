package com.example.myapplication

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import kotlinx.android.synthetic.main.activity_main.view.*
import kotlinx.android.synthetic.main.spinner.view.*

class MoodArrayAdapter(ctx: Context,
                       moods: List<Mood>) :
    ArrayAdapter<Mood>(ctx, 0, moods) {
    override fun getView(position: Int, recycledView: View?, parent: ViewGroup): View {
        return this.createView(position, recycledView, parent)
    }
    override fun getDropDownView(position: Int, recycledView: View?, parent: ViewGroup): View {
        return this.createView(position, recycledView, parent)
    }
    private fun createView(position: Int, recycledView: View?, parent: ViewGroup): View {
        val mood = getItem(position)
        val view = recycledView ?: LayoutInflater.from(context).inflate(
            R.layout.spinner,
            parent,
            false
        )
        if (mood != null) {
            view.rootLayout.setBackgroundColor(mood.backgroundColor)


        }
        if (mood != null) {
            view.moodText.text = mood.description
        }
        return view
    }
}