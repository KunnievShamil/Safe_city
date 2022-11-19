package com.example.safecity.presentation.onboarding

import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import androidx.viewpager2.widget.ViewPager2
import com.airbnb.lottie.LottieAnimationView
import com.example.safecity.R

class OnboardingAdapter(private val animationList : List<Int>, private val clickListener:(Int)->Boolean) : RecyclerView.Adapter<OnboardingAdapter.PagerVH>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PagerVH =
        PagerVH(
            LayoutInflater.from(parent.context).inflate(R.layout.onboarding_item1, parent, false)
        )


    override fun onBindViewHolder(holder: PagerVH, position: Int) = holder.itemView.run {
        val text =findViewById<TextView>(R.id.ontext).run {
            text = position.toString()
            this
        }
        findViewById<LottieAnimationView>(R.id.lottie).run {
            setAnimation(animationList[position])
            this
        }

        val button = findViewById<Button>(R.id.button2).run {
            setOnClickListener {

                 clickListener.invoke(4)

                 }
            if(position == animationList.size-1){
            this.text = "Приступить"
            }
        }

    }

    override fun getItemCount(): Int = animationList.size

    class PagerVH(private val itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun bind() {
            itemView.id
        }
    }
}