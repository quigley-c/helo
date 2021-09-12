package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), View.OnClickListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        goButton.setOnClickListener(this)
    }


    override fun onClick(view: View?)   {
        when(view)  {
            goButton -> textView.setText("Button Pressed!")
        }

    }
}