/* made with love by Carson Quigley */

package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), View.OnClickListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        /*I almost defined another onCreate because I didn't realize
        there was already one here.. */

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //the magic happens with the OnClickListener.
        goButton.setOnClickListener(this)
    }


    override fun onClick(view: View?)   {
    /* when <button> do (->) <thing> */
        when(view)  {
            goButton -> textView.setText("Button Pressed!")

            //maybe I'll add a second button that does something else..
        }

    // I managed to launch this app on my own phone which is pretty cool imo
    }
}