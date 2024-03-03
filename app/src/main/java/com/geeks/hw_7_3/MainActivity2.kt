package com.geeks.hw_7_3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.geeks.hw_7_3.databinding.ActivityMain2Binding

class MainActivity2 : AppCompatActivity() {
    private lateinit var binding:ActivityMain2Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMain2Binding.inflate(layoutInflater)
        setContentView(binding.root)

        val musicName = intent.getStringExtra("musicName")
        binding.tvMusicName.text = musicName
    }
}