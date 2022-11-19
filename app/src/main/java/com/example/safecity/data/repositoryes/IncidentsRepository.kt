package com.example.safecity.data.repositoryes

import com.example.safecity.data.entity.Incident
import com.example.safecity.domain.repositories.IncidentsRepositoryImpl
import com.yandex.mapkit.geometry.Point

class IncidentsRepository : IncidentsRepositoryImpl {
    override fun getIncidents(): List<Incident> {
        val mas = ArrayList<Incident>()
        mas.add(Incident("Кот упал","Помогите коту",3,false))
        mas.add(Incident("Кот упал","Помогите коту",2,false))
        mas.add(Incident("Кот упал","Помогите коту",1,false))
        mas.add(Incident("Кот упал","Помогите коту",1,false))
        mas.add(Incident("Кот упал","Помогите коту",1,false))
        mas.add(Incident("Кот упал","Помогите коту",2,false))
        mas.add(Incident("Кот упал","Помогите коту",2,false))
        mas.add(Incident("Кот упал","Помогите коту",1,false))
        mas.add(Incident("Кот упал","Помогите коту",3,false))
        mas.add(Incident("Кот упал","Помогите коту",1,false))
        mas.add(Incident("Кот упал","Помогите коту",2,false))
        mas.add(Incident("Кот упал","Помогите коту",2,false))
        mas.add(Incident("Кот упал","Помогите коту",1,false))
        mas.add(Incident("Кот упал","Помогите коту",2,false))
        mas.add(Incident("Кот упал","Помогите коту",3,false))
        mas.add(Incident("Кот упал","Помогите коту",1,false))
        mas.add(Incident("Кот упал","Помогите коту",1,false))


        return mas
    }

    override fun addIncident(incident: Incident) {

    }
}