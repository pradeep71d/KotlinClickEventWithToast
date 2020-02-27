package com.example.kotlinclickeventontextview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val text1 = findViewById(R.id.t1) as TextView
        text1.setOnClickListener {
            Toast.makeText(this, "you have clicked on textview", Toast.LENGTH_SHORT).show()
        }

        val button1=findViewById(R.id.b1)as Button
        button1.setOnClickListener {
            Toast.makeText(this,"you clicked on Button",Toast.LENGTH_SHORT).show()
        }
    }
}
