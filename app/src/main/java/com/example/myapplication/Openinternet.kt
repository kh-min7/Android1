package com.example.myapplication

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.util.Log
import kotlinx.android.synthetic.main.activity_openinternet.*

class Openinternet : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_openinternet)


        open.setOnClickListener{
            val internet = address_edit_text.text.toString()
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse(internet))
            startActivity(intent)
        }


        address_edit_text.addTextChangedListener(object: TextWatcher{
            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {
                Log.d("edit","beforeTextChanged : " + s)
            }

            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
                Log.d("edit","onTextChanged : " + s)
            }

            override fun afterTextChanged(s: Editable?) {
                if(s.toString() == "abc"){
                    Log.d("edit", "text is abc")
                }
                Log.d("edit","afterTextChanged : " + s)
            }
        })
    }
}