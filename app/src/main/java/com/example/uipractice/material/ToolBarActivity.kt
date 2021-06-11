package com.example.uipractice.material

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.uipractice.R
/*
1、Application当中的theme，当然会应用于所有的Window了，是的所有Activity，都会被Theme改变
2、Activity下的Theme，当然只会作用单个Activity Window的样式了
3、至于Application也有Theme，Activity下也有Theme，当然还是重写的思想，Application的Theme会失效， 此时Activity下的Theme会生效。
4、是的，Theme也就是Style，大号Style，Style里面还是Style，太疯狂了！
*/

class ToolBarActivity :AppCompatActivity(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.tool_bar_activity)
        setSupportActionBar(findViewById(R.id.my_toolbar))
    }
}