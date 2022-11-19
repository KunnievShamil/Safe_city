package com.example.safecity.domain.usercase.incidents

import com.example.safecity.data.entity.Incident
import com.example.safecity.domain.repositories.IncidentsRepositoryImpl

class GetIncidentsUserCase(private val incidentsRepository: IncidentsRepositoryImpl) {
    fun execute() : List<Incident>{
        return incidentsRepository.getIncidents()
    }
}