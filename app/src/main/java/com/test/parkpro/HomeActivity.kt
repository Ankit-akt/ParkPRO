package com.test.parkpro

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.test.parkpro.databinding.ActivityHomeBinding
import com.test.parkpro.databinding.ActivityMainBinding

class HomeActivity : AppCompatActivity() {

    private var binding : ActivityHomeBinding? =  null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityHomeBinding.inflate(layoutInflater)
        setContentView(binding?.root)

        val username = intent.getStringExtra("Username")
        binding?.username?.text = "Hi, $username"
    }
}