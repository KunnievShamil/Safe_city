package com.example.safecity.presentation.onboarding

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.viewpager2.widget.ViewPager2
import com.example.safecity.R

class OnboardingActivity : AppCompatActivity() {

    private lateinit var viewPager2 : ViewPager2

    override fun onCreate(savedInstanceState: Bundle?) {
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


    }
}