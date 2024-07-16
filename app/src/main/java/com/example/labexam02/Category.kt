package com.example.labexam02

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView

class Category : AppCompatActivity() {

    private lateinit var btnCatToHome: Button
    private lateinit var btnCatToProfile: Button
    private lateinit var btnCatToMoreDe: ImageView

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_category)

        //From Category To Home
        btnCatToHome = findViewById(R.id.home)

        btnCatToHome.setOnClickListener {
            val intent = Intent(this, HomePage::class.java)
            startActivity(intent)
        }

        //From Category to Profile
        btnCatToProfile = findViewById(R.id.profile)

        btnCatToProfile.setOnClickListener {
            val intent = Intent(this, UserProfile::class.java)
            startActivity(intent)
        }

        // From Category to More_Details_Category
        btnCatToMoreDe = findViewById(R.id.detailedtop)

        btnCatToMoreDe.setOnClickListener {
            val intent = Intent(this, MoreDetailsCat::class.java)
            startActivity(intent)
        }
    }
}