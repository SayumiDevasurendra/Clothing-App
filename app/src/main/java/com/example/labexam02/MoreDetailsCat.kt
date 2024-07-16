package com.example.labexam02

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MoreDetailsCat : AppCompatActivity() {

    private lateinit var btnDetails1ToHome: Button
    private lateinit var btnDetails1ToCategory: Button
    private lateinit var btnDetails1ToProfile: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_more_details_cat)

        //From Mor_Details_Cat To Home
        btnDetails1ToHome = findViewById(R.id.home)

        btnDetails1ToHome.setOnClickListener {
            val intent = Intent(this, HomePage::class.java)
            startActivity(intent)
        }

        //From Mor_Details_Cat to Category
        btnDetails1ToCategory = findViewById(R.id.category)

        btnDetails1ToCategory.setOnClickListener {
            val intent = Intent(this, Category::class.java)
            startActivity(intent)
        }

        // From Mor_Details_Cat to Profile
        btnDetails1ToProfile = findViewById(R.id.profile)

        btnDetails1ToProfile.setOnClickListener {
            val intent = Intent(this, UserProfile::class.java)
            startActivity(intent)
        }
    }
}