package com.example.myapplication

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment

class Fragment2: Fragment(){

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        Log.d("life_cycle", "F onCreateView")
        // fragment가 인터페이스를 처음으로 그릴 때 호출된다
        // inflater -> view를 그려주는 역할
        // container -> 부모 view

        return inflater.inflate(R.layout.fragment_two, container, false)
    }
}
