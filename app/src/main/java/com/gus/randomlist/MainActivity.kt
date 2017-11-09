package com.gus.randomlist

import android.graphics.Color
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {
    private val programmingList = arrayListOf("C#", "PHP", "Java", "Ruby", "Kotlin")
    private val changeColor = arrayListOf("#39add1", "#e15258", "#f9845b", "#7d669e", "#838cc7")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        showBtn.setOnClickListener {
            val random = Random()
            val randomProgram = random.nextInt(programmingList.count())
            val randomColor = random.nextInt(changeColor.count())
            val color:String = changeColor[randomColor]
            val colorSet:Int = Color.parseColor(color)


            listTxt.text = programmingList[randomProgram]
            programmingBack.setBackgroundColor(colorSet)
            showBtn.setTextColor(colorSet)
        }
    }
}
