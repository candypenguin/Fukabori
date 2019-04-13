package com.example.fukabori

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class Result : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)

        var goal :TextView = findViewById(R.id.goal)
        var firstWhy : TextView = findViewById(R.id.firstwhy)
        var secondWhy : TextView = findViewById(R.id.secondwhy)
        var thirdWhy : TextView = findViewById(R.id.thirdwhy)

        var finishButton: Button = findViewById(R.id.finishButton)

        if (intent != null) {
            var fukabori = intent.getSerializableExtra("Fukabori") as Array<String>
            goal.text = fukabori[0]
            firstWhy.text = fukabori[1]
            secondWhy.text = fukabori[2]
            thirdWhy.text = fukabori[3]
        }

        finishButton.setOnClickListener {

            val intentFinish  = Intent(this, MainActivity::class.java)
            startActivity(intentFinish)
        }
    }
}
