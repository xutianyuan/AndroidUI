package com.example.uipractice.tv

import android.content.Context
import android.graphics.Paint

/*单行缩放文字，可以测量出文字的宽度，根据控件的宽度，进行字体缩放*/
class TextSizeUtils private constructor(private val context: Context) {
    private val paint = Paint()
    fun getMinSize(
        standardTextSize: Float,
        maxWidth: Int,
        s: Array<String?>?
    ): Float {
        if (s == null || s.size == 0) {
            return standardTextSize
        }
        var minSize = standardTextSize
        for (i in s.indices) {
            val rightLineSize = getRightLineSize(standardTextSize, s[i], maxWidth)
            if (rightLineSize < minSize) {
                minSize = rightLineSize
            }
        }
        return minSize
    }

    fun getRightLineSize(
        standardTextSize: Float,
        text: String?,
        maxWidth: Int
    ): Float {
        paint.textSize = sp2px(standardTextSize, context).toFloat()
        paint.textAlign = Paint.Align.CENTER
        //根据最大值，计算出当前文本占用的宽度
        val preWidth = paint.measureText(text)

        //如果文本占用的宽度比画布宽度小，说明不用伸缩，直接返回当前字号
        return if (preWidth < maxWidth) {
            standardTextSize
        } else standardTextSize * maxWidth / preWidth
        //已知当前文本字号、文本占用宽度、画布宽度，计算出合适的字号，并返回
    }

    companion object {
        private val instance: TextSizeUtils? = null
        fun getInstance(context: Context): TextSizeUtils? {
            if (instance == null) {
                synchronized(TextSizeUtils::class.java) {
                    if (instance == null) {
                        return TextSizeUtils(context)
                    }
                }
            }
            return instance
        }

        // 提供sp 转 px的方法
        fun sp2px(spValue: Float, context: Context): Int {
            val scale = context.resources.displayMetrics.density
            return (spValue * scale + 0.5f).toInt()
        }
    }

}