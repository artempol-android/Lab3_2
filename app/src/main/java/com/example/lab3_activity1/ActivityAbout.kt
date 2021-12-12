package com.example.lab3_activity1

import android.R
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.lab3_activity1.databinding.ActivityAboutBinding

class ActivityAbout : AppCompatActivity() {

    lateinit var binding: ActivityAboutBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityAboutBinding.inflate(layoutInflater)
        setContentView(binding.root)

        supportActionBar!!.setDisplayHomeAsUpEnabled(true)

        binding.backAbout.setOnClickListener { finish() }
    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }

}