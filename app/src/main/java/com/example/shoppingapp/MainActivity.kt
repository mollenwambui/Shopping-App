package com.example.shoppingapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton

class MainActivity : AppCompatActivity() {
    lateinit var imgHoodie: ImageButton
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        imgHoodie=findViewById(R.id.imgHoodie)

        imgHoodie.setOnClickListener {
            val intent=Intent(this,Hoodies::class.java)
            startActivity(intent)
        }
    }
}