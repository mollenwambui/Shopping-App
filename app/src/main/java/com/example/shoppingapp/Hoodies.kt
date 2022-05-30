package com.example.shoppingapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Hoodies : AppCompatActivity() {
    lateinit var btnAddtoCart:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_hoodies)
        btnAddtoCart=findViewById(R.id.btnAddtoCart)
        btnAddtoCart.setOnClickListener {
            val intent=Intent(this,Buy::class.java)
            startActivity(intent)
        }
    }
}