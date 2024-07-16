package com.example.labexam02

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.textfield.TextInputLayout

class SignUp : AppCompatActivity() {

    private lateinit var btnToHomePage: Button

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_up)

        // Find the "GO" button by its ID
        btnToHomePage = findViewById(R.id.btn_home_page)

        // Set a click listener for the "GO" button
        btnToHomePage.setOnClickListener {
            // Create an Intent to navigate to HomePageActivity
            val intent = Intent(this, HomePage::class.java)

            // Start the HomePageActivity
            startActivity(intent)
        }
    }
}
