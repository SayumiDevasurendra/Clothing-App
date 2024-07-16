package com.example.labexam02

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MoreDetailsHome : AppCompatActivity() {

    private lateinit var btnDetails2ToHome: Button
    private lateinit var btnDetails2ToCategory: Button
    private lateinit var btnDetails2ToProfile: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_more_details_home)

        //From Mor_Details_Hm To Home
        btnDetails2ToHome = findViewById(R.id.home)

        btnDetails2ToHome.setOnClickListener {
            val intent = Intent(this, HomePage::class.java)
            startActivity(intent)
        }

        //From Mor_Details_Hm to Category
        btnDetails2ToCategory = findViewById(R.id.category)

        btnDetails2ToCategory.setOnClickListener {
            val intent = Intent(this, Category::class.java)
            startActivity(intent)
        }

        // From Mor_Details_Hm to Profile
        btnDetails2ToProfile = findViewById(R.id.profile)

        btnDetails2ToProfile.setOnClickListener {
            val intent = Intent(this, UserProfile::class.java)
            startActivity(intent)
        }
    }
}