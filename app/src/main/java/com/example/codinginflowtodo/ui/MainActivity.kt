package com.example.codinginflowtodo.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.codinginflowtodo.R
import com.example.codinginflowtodo.databinding.ActivityMainBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}