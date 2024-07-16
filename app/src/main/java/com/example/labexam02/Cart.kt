package com.example.labexam02

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Cart : AppCompatActivity() {

    private lateinit var btnCart2ToHome: Button
    private lateinit var btnCart2ToCategory: Button
    private lateinit var btnCart2ToProfile: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cart)

        //From Cart To Home
        btnCart2ToHome = findViewById(R.id.home)

        btnCart2ToHome.setOnClickListener {
            val intent = Intent(this, HomePage::class.java)
            startActivity(intent)
        }

        //From Cart to Category
        btnCart2ToCategory = findViewById(R.id.category)

        btnCart2ToCategory.setOnClickListener {
            val intent = Intent(this, Category::class.java)
            startActivity(intent)
        }

        // From Cart to Profile
        btnCart2ToProfile = findViewById(R.id.profile)

        btnCart2ToProfile.setOnClickListener {
            val intent = Intent(this, UserProfile::class.java)
            startActivity(intent)
        }

    }
}