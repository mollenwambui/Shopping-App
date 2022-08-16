package com.example.shoppingapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.shoppingapp.databinding.ActivityPaymentsBinding

class Payments : AppCompatActivity() {
    lateinit var binding: ActivityPaymentsBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityPaymentsBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}