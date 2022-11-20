package com.example.safecity.presentation.home

import android.os.Bundle
import android.util.Log
import android.view.View
import android.view.animation.Animation
import android.view.animation.ScaleAnimation
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController
import com.example.safecity.R
import com.example.safecity.databinding.ActivityHomeBinding
import com.example.safecity.presentation.home.ui.home.addincident.IncidentAddFragmentDialog
import com.google.android.material.bottomnavigation.BottomNavigationView
import java.time.Duration


class HomeActivity : AppCompatActivity() {

    private lateinit var binding: ActivityHomeBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityHomeBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.addIncidentButton.setOnClickListener {
            IncidentAddFragmentDialog().show(supportFragmentManager, "tag")
        }

        val navView: BottomNavigationView = binding.navView

        val navController = findNavController(R.id.nav_host_fragment_activity_home)
        val appBarConfiguration = AppBarConfiguration(
            setOf(
                R.id.navigation_home, R.id.navigation_dashboard, R.id.navigation_notifications
            )
        )
        setupActionBarWithNavController(navController, appBarConfiguration)
        navView.setupWithNavController(navController)

        navView.setOnItemReselectedListener {
             Log.d("AAAA","${it.itemId}")
            if(binding.addIncidentButton.scaleX == 1f) {
               // scaleView(binding.addIncidentButton,1f,0f)
                binding.addIncidentButton.visibility = View.GONE
            }
        }
//        navView.setOnItemSelectedListener {
//            Log.d("AAA2","${it.itemId}")
//            false
//        }







    }

    fun scaleView(v: View, startScale: Float, endScale: Float, duration: Long = 500) {
        val anim: Animation = ScaleAnimation(
            1f, 1f,  // Start and end values for the X axis scaling
            startScale, endScale,  // Start and end values for the Y axis scaling
            Animation.RELATIVE_TO_SELF, 0f,  // Pivot point of X scaling
            Animation.RELATIVE_TO_SELF, 1f
        ) // Pivot point of Y scaling
        anim.fillAfter = true // Needed to keep the result of the animation
        anim.duration = duration
        v.startAnimation(anim)
        if (startScale>endScale) {
            v.visibility = View.VISIBLE
        }
        else{
            v.visibility = View.GONE
        }
    }



    fun showAddIncidentButton() {
        binding.addIncidentButton.visibility = View.VISIBLE
    }
}