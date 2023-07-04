package com.example.buttonanimation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.lifecycle.lifecycleScope
import com.example.buttonanimation.databinding.ActivityMainBinding
import kotlinx.coroutines.delay

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.btn2.text = "Let's get Started"

        binding.btn2.setOnClickListener {

            Toast.makeText(this@MainActivity, "clicked", Toast.LENGTH_LONG).show()
            binding.btn2. setUIState(MorphButton.UIState.Loading)

        }
    }


}



