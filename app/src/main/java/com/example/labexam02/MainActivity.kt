package com.example.labexam02

import android.app.ActivityOptions
import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.view.View
import android.view.WindowManager
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    // variables for animation
    private lateinit var topAnim: Animation
    private lateinit var bottomAnim: Animation
    private lateinit var image: ImageView
    private lateinit var slog1: TextView
    private lateinit var slog2: TextView
    private lateinit var sl1: TextView
    private lateinit var sl2: TextView
    private lateinit var sl3: TextView

    private val SPLASH_SCREEN = 3000

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //Hide the Status Bar
        window.setFlags(
            WindowManager.LayoutParams.FLAG_FULLSCREEN,
            WindowManager.LayoutParams.FLAG_FULLSCREEN
        )
        setContentView(R.layout.activity_main)

        // Animations
        topAnim = AnimationUtils.loadAnimation(this, R.anim.top_animation)
        bottomAnim = AnimationUtils.loadAnimation(this, R.anim.bottom_animation)

        // Hooks
        slog1 = findViewById(R.id.wel)
        slog2 = findViewById(R.id.appn)
        image = findViewById(R.id.flowerlogo)
        sl1 = findViewById(R.id.sl1)
        sl2 = findViewById(R.id.sl2)
        sl3 = findViewById(R.id.sl3)

        slog1.startAnimation(topAnim)
        slog2.startAnimation(topAnim)
        image.startAnimation(topAnim)
        sl1.startAnimation(bottomAnim)
        sl2.startAnimation(bottomAnim)
        sl3.startAnimation(bottomAnim)

        //login screen display with delay
        Handler().postDelayed({
            val intent = Intent(this, Login::class.java)

            //next activity  want with animation
            val pairs = arrayOf(
                android.util.Pair<View, String>(image, "logo_image"),
                android.util.Pair<View, String>(slog1, "logo_text2"),
                android.util.Pair<View, String>(slog2, "logo_text2")
            )

            val options = ActivityOptions.makeSceneTransitionAnimation(this, *pairs)
            startActivity(intent, options.toBundle())
        }, SPLASH_SCREEN.toLong())
    }
}
