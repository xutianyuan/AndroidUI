package com.example.uipractice.material

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.uipractice.R
import com.google.android.material.floatingactionbutton.FloatingActionButton
import com.google.android.material.snackbar.Snackbar




class FloatingActionButtonActivity:AppCompatActivity(){

    private lateinit var ft:FloatingActionButton

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.floating_action_button_activity)

        ft = findViewById(R.id.ft)
        ft.setOnClickListener { view ->
            Snackbar.make(view, "Here's a Snackbar", Snackbar.LENGTH_LONG)
                    .setAction("Action", null)
                    .show()
        }
    }
}


