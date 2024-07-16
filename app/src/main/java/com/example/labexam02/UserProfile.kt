package com.example.labexam02

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.ContactsContract
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView

class UserProfile : AppCompatActivity() {

    private lateinit var btnProfileToHome: Button
    private lateinit var btnProfileToCat: Button
    private lateinit var btnProfileToLogin: Button
    private lateinit var btnProfileToSignUp: Button
    private lateinit var btnProfileToCart: ImageView


    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_user_profile)

        //From Profile To Home
        btnProfileToHome = findViewById(R.id.home)

        btnProfileToHome.setOnClickListener {
            val intent = Intent(this, HomePage::class.java)
            startActivity(intent)
        }

        //From Profile to Category
        btnProfileToCat = findViewById(R.id.category)

        btnProfileToCat.setOnClickListener {
            val intent = Intent(this, Category::class.java)
            startActivity(intent)
        }

        //From Profile to Login
        btnProfileToLogin = findViewById(R.id.logout)

        btnProfileToLogin.setOnClickListener {
            val intent = Intent(this, Login::class.java)
            startActivity(intent)
        }

        //From Profile to SignUp
        btnProfileToSignUp = findViewById(R.id.btn_delete)

        btnProfileToSignUp.setOnClickListener {
            val intent = Intent(this, SignUp::class.java)
            startActivity(intent)
        }

        //From Profile to Cart
        btnProfileToCart = findViewById(R.id.go_to_cart)

        btnProfileToCart.setOnClickListener {
            val intent = Intent(this, Cart::class.java)
            startActivity(intent)
        }
    }
}