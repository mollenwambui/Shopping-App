package com.example.shoppingapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.shoppingapp.databinding.ActivityBuyBinding

class Buy : AppCompatActivity() {
    lateinit var binding: ActivityBuyBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityBuyBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.btnLipa.setOnClickListener {
            val intent=Intent(this,Payments::class.java)
            startActivity(intent)
        }
    }

}
