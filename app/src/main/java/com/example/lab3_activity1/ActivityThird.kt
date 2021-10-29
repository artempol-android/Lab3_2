package com.example.lab3_activity1

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.lab3_activity1.databinding.ActivityThirdBinding
import com.google.android.material.bottomnavigation.BottomNavigationView

class ActivityThird : AppCompatActivity() {

    lateinit var binding: ActivityThirdBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityThirdBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.toSecondButton.setOnClickListener { toSecondActivity() }
        binding.toFirstButton2.setOnClickListener { toFirstActivity() }

        val bottom: BottomNavigationView = binding.bottomNav
        bottom.setOnItemSelectedListener { item ->
            if (item.itemId == R.id.item_about_activity)
                startActivity(Intent(this, ActivityAbout::class.java))
            return@setOnItemSelectedListener true
        }
    }

    private fun toSecondActivity() {
        finish()
    }

    private fun toFirstActivity() {
        val intent = Intent()
        setResult(Activity.RESULT_OK, intent)
        finish()
    }
}