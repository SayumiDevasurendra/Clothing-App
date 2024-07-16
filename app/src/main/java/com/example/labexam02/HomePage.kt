package com.example.labexam02

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.ContactsContract.Profile
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView

class HomePage : AppCompatActivity() {

    private lateinit var btnHomeToCat: Button
    private lateinit var btnHomeToProfile: Button
    private lateinit var btnHomeToMoreDe: ImageView

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home_page)

        // Find the category btn by its ID
        btnHomeToCat = findViewById(R.id.category)

        // Set a click listener for the category btn
        btnHomeToCat.setOnClickListener {
            // Create an Intent to navigate to CategoryActivity
            val intent = Intent(this, Category::class.java)

            // Start the CategoryActivity
            startActivity(intent)
        }

        // From Home to Profile
        btnHomeToProfile = findViewById(R.id.profile)

        btnHomeToProfile.setOnClickListener {
            val intent = Intent(this, UserProfile::class.java)
            startActivity(intent)
        }

        // From Home to More_Details_Home
        btnHomeToMoreDe = findViewById(R.id.detaileddress)

        btnHomeToMoreDe.setOnClickListener {
            val intent = Intent(this, MoreDetailsHome::class.java)
            startActivity(intent)
        }
    }
}