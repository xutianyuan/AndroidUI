package com.example.uipractice.material

import android.graphics.drawable.AnimationDrawable
import android.os.Bundle
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import com.example.uipractice.R

class DongHuaActivity :AppCompatActivity(){
    private lateinit var rocketAnimation: AnimationDrawable


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.donghua_activity)

        val rocketImage = findViewById<ImageView>(R.id.rocket_image).apply {
            setBackgroundResource(R.drawable.ic_donghua)
            rocketAnimation = background as AnimationDrawable
        }

        rocketImage.setOnClickListener { rocketAnimation.start() }
    }
}