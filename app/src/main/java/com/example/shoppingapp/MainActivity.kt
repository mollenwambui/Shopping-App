package com.example.shoppingapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import com.example.shoppingapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var  binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.imgman3.setOnClickListener {
            val intent=Intent(this,Hoodies::class.java)
            startActivity(intent)
        }
        binding.imgHoodie.setOnClickListener {
            val intent=Intent(this,Hoodies::class.java)
            startActivity(intent)
        }
    }
}