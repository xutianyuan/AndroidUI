package com.example.uipractice.layout

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.uipractice.R

class LayoutActivity: AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //1.基础用法
        //setContentView(R.layout.constraint_layout_base)
        //2.基线对齐
        //setContentView(R.layout.constraint_layout_base_line)
        //3.角度约束
        setContentView(R.layout.constraint_layout_angle)
    }
}