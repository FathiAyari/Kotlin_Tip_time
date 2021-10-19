package com.fathi_ayari.tip_time

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.fathi_ayari.tip_time.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}