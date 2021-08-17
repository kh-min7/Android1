package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_thread_activitiy.*

class ThreadActivitiy : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_thread_activitiy)

        // 1
        val runnable: Runnable = object: Runnable{
            override fun run(){
                Log.d("thread-1", "Thread1 is made")
            }
        }

        val thread: Thread = Thread(runnable)

        button.setOnClickListener {
            thread.start()
        }

        // 2
        Thread(object: Runnable{
            override fun run(){
                Log.d("thread-1", "Thread2 is made")
            }
        }).start()

        // 3
        Thread(Runnable{
            Thread.sleep(2000)
            Log.d("thread-1", "Thread3 is made")

            runOnUiThread{
                button.setBackgroundColor(getColor(R.color.textview_color))
            }
        }).start()


    }
}