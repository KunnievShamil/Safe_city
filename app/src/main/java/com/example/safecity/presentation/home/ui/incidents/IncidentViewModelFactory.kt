package com.example.safecity.presentation.home.ui.incidents

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.safecity.data.repositoryes.IncidentsRepository
import com.example.safecity.domain.usercase.incidents.GetIncidentsUserCase

class IncidentViewModelFactory : ViewModelProvider.Factory {
    private val incidentsRepository = IncidentsRepository()
    private val getIncidentsUserCase = GetIncidentsUserCase(incidentsRepository)

    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        return IncidentsViewModel(getIncidentsUserCase) as T
    }
}