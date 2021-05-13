package com.example.uipractice.layout

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.uipractice.R

class LayoutActivity: AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //位置约束

        //1.基础用法
        //setContentView(R.layout.constraint_layout_base)
        //2.基线对齐
        //setContentView(R.layout.constraint_layout_base_line)
        //3.角度约束
        //setContentView(R.layout.constraint_layout_angle)
        //4.百分比偏移
        //setContentView(R.layout.constraint_layout_percent)


        //边距

        //1.goneMargin
        // setContentView(R.layout.constraint_layout_gone_margin)



        //尺寸
        //1.限制
        // setContentView(R.layout.constraint_layout_size_limit)

        //2.充满约束,0dp(MATCH_CONSTRAINT），又分为三种情况spread|percent|wrap
        // setContentView(R.layout.constraint_layout_size_spread)
        // setContentView(R.layout.constraint_layout_size_percent)
        //匹配内容大小但不超过约束限制
        setContentView(R.layout.constraint_layout_size_wrap)

        //3.比例设置
       // setContentView(R.layout.constraint_layout_ratio)

        //链
        //1.均分剩余空间
        setContentView(R.layout.constraint_layout_chain_spread)
        //2.两侧的控件贴近两边，剩余的控件均分剩余空间
        setContentView(R.layout.constraint_layout_chain_spread_inside)
        //3.所有控件紧贴居中
        setContentView(R.layout.constraint_layout_chain_packed)
        // 支持权重
        setContentView(R.layout.constraint_layout_weight);


        //参考线
        setContentView(R.layout.constraint_layout_guide_line)

        //屏障
        setContentView(R.layout.constraint_layout_brrrier)

        //组
        setContentView(R.layout.constraint_layout_group)

        //占位符
        setContentView(R.layout.constraint_layout_place_holder)

        //流式虚拟布局

        //层布局



    }
}