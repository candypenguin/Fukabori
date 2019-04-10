package com.example.fukabori

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val startButton = findViewById<Button>(R.id.start)
        startButton.setOnClickListener{
            //遷移先に送るデータ
            val intent  = Intent(this, Fukabori::class.java)
            startActivity(intent)
        }
    }
}
