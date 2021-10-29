package com.example.lab3_activity1

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.lab3_activity1.databinding.ActivitySecondBinding
import com.google.android.material.bottomnavigation.BottomNavigationView

class ActivitySecond : AppCompatActivity() {

    lateinit var binding: ActivitySecondBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivitySecondBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.toFirstButton.setOnClickListener { toFirstActivity() }
        binding.toThirdButton.setOnClickListener { toThirdActivity() }

        val bottom: BottomNavigationView = binding.bottomNav
        bottom.setOnItemSelectedListener { item ->
            if (item.itemId == R.id.item_about_activity)
                startActivity(Intent(this, ActivityAbout::class.java))
            return@setOnItemSelectedListener true
        }
    }

    private fun toFirstActivity() {
        finish()
    }

    private fun toThirdActivity() {
        val intent = Intent(this, ActivityThird::class.java)
        startActivityForResult(intent, THIRD_ACTIVITY_CODE)
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
         if (requestCode == THIRD_ACTIVITY_CODE && resultCode == Activity.RESULT_OK) {
             finish()
         }
    }

    companion object {
        @JvmStatic private val THIRD_ACTIVITY_CODE = 3
    }
}