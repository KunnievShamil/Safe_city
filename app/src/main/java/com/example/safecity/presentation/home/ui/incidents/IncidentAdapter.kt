package com.example.safecity.presentation.home.ui.incidents

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.airbnb.lottie.LottieAnimationView
import com.example.safecity.R
import com.example.safecity.data.entity.Incident

class IncidentAdapter(private val incidentArray : List<Incident>) : RecyclerView.Adapter<IncidentAdapter.IncidentHolder>() {

    class IncidentHolder(itemView : View) : RecyclerView.ViewHolder(itemView){
    fun setData(incident: Incident) {
        itemView.findViewById<LottieAnimationView>(R.id.item_lottie).run {
            when(incident.importance) {
                1-> setAnimation(R.raw.importance_1)
                2-> setAnimation(R.raw.importance_2)
                3-> setAnimation(R.raw.importance_3)
            }

        }
    }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): IncidentHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.incident_item,parent,false)

        return IncidentHolder(itemView = view)

    }

    override fun onBindViewHolder(holder: IncidentHolder, position: Int) {
        holder.setData(incidentArray.get(position))
    }

    override fun getItemCount(): Int = incidentArray.size
}