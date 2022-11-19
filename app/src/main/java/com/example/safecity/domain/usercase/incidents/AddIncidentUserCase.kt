package com.example.safecity.domain.usercase.incidents

import com.example.safecity.data.entity.Incident
import com.example.safecity.domain.repositories.IncidentsRepositoryImpl

class AddIncidentUserCase(private val incidentsRepositoryImpl: IncidentsRepositoryImpl) {
    fun execute(incident: Incident) {
        incidentsRepositoryImpl.addIncident(incident)
    }
}