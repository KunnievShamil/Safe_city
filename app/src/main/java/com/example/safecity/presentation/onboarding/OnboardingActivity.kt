package com.example.safecity.presentation.onboarding

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.viewpager2.widget.ViewPager2
import com.example.safecity.R
import com.tbuonomo.viewpagerdotsindicator.DotsIndicator

class OnboardingActivity : AppCompatActivity() {

    private lateinit var viewPager2 : ViewPager2

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        setTheme(R.style.Theme_OnboardingScreen)
        overridePendingTransition(R.anim.enter_a,R.anim.exit_a)
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_onboarding)

        viewPager2 = findViewById<ViewPager2>(R.id.onboarding_viewPager2)
        viewPager2.adapter = OnboardingAdapter (listOf(R.raw.loadingaimin,R.raw.loadingaimin,R.raw.loadingaimin,R.raw.loadingaimin,R.raw.loadingaimin)){ size ->
            if (size != viewPager2.currentItem){
                viewPager2.setCurrentItem(viewPager2.currentItem+1,true)
                return@OnboardingAdapter false
            }
            else{
                return@OnboardingAdapter true
            }


        }

        val dots = findViewById<com.tbuonomo.viewpagerdotsindicator.DotsIndicator>(R.id.dots_indicator)
        dots.attachTo(viewPager2 = viewPager2)


    }
}