package com.example.safecity.presentation.home.ui.incidents

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.safecity.data.entity.Incident
import com.example.safecity.domain.usercase.incidents.GetIncidentsUserCase

class IncidentsViewModel(private val getIncidentsUserCase: GetIncidentsUserCase) : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "This is dashboard Fragment"
    }
    val text: LiveData<String> = _text

    fun getIncidentsList() : List<Incident> = getIncidentsUserCase.execute()
}