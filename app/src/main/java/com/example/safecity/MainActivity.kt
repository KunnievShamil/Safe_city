package com.example.safecity

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.safecity.presentation.home.HomeActivity
import com.example.safecity.presentation.home.ui.home.addincident.IncidentAddFragmentDialog
import com.example.safecity.presentation.onboarding.OnboardingActivity
import com.google.android.material.bottomsheet.BottomSheetBehavior

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)





        findViewById<Button>(R.id.button).setOnClickListener {
            startActivity(Intent(this, HomeActivity::class.java))
           // IncidentAddFragmentDialog().show(supportFragmentManager, "tag")
        }
    }
}