package com.example.shoppingapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.shoppingapp.databinding.ActivityHoodiesBinding

class Hoodies : AppCompatActivity() {
    lateinit var binding: ActivityHoodiesBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityHoodiesBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.btnAddtoCart.setOnClickListener {
            val intent=Intent(this,Buy::class.java)
            startActivity(intent)
        }
    }
}