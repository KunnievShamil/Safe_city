package com.example.safecity

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.widget.Button
import com.example.safecity.presentation.home.HomeActivity
import com.example.safecity.presentation.home.ui.home.addincident.IncidentAddFragmentDialog
import com.example.safecity.presentation.onboarding.OnboardingActivity
import com.google.android.material.bottomsheet.BottomSheetBehavior

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        setTheme(R.style.Theme_OnboardingScreen)
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        Handler().postDelayed(object : Runnable{
            override fun run() {
                startActivity(Intent(this@MainActivity,OnboardingActivity::class.java))
            }

        },1500)


    }
}