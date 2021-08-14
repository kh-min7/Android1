package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_listener.*

class Listener : AppCompatActivity() {

    var number = 10

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_listener)


        // 뷰를 acitivity로 가져오는 방법
        // 1. 직접 찾아서 가져온다
        // val textView: TextView = findViewById(R.id.hihi)

        // 2.xml을 import해서 가져온다
        // hihi

        // 익명함수
        // 1 -> 람다 방식
        hihi.setOnClickListener {
            Log.d("click", "Click!!")
            hihi.setText("안녕하세요")
            image.setImageResource(R.drawable.dfs)
            number += 10
            Log.d("number",""+number)
        }



        // view를 조작하는 함수들
        // 1. setText
        // 2.
    }
}