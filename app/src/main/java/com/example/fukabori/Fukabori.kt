package com.example.fukabori

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class Fukabori : AppCompatActivity() {

        var count : Int = 0
        var fukaboriList : Array<String> = arrayOf("","","","")
        var why : TextView? = null
        var reason : TextView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fukabori)

        why = findViewById(R.id.Naze)
        reason = findViewById(R.id.why)
        var nextButton: Button = findViewById(R.id.nextButton)

        nextButton.setOnClickListener {
            fukaboriList[count] = reason.toString()
            count++

            if(count != 4){

                show()
            }else{

                val intent  = Intent(this, Result::class.java)
                intent.putExtra("Fukabori", fukaboriList )
                startActivity(intent)
            }
        }

    }

    fun show() {

        if(count > 0){

            why!!.text = "なぜ？"
        }else{

            why!!.text = "なにがしたいの？"
        }

        reason!!.text = ""
    }
}
