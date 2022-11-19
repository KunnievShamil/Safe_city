package com.example.safecity.domain.repositories

import com.example.safecity.data.entity.Incident

interface IncidentsRepositoryImpl  {

    fun getIncidents() : List<Incident>

    fun addIncident(incident : Incident)

}