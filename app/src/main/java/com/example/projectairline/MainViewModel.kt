package com.example.projectairline
import android.view.View
import android.widget.AdapterView
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.launch
class MainViewModel(private val statisticRepository: Repos) : ViewModel() {
    fun insertNewFlightDataInDatabase(
        place_from: String, place_to: String, departure_date: String, arrival_date: String,
        departure_time: String, arrival_time: String, airport_from: String, airport_to: String,
        travel_time: Float
    ) {
        viewModelScope.launch {
            val newFlight = Flights(place_from, place_to, departure_date, arrival_date,
                departure_time, arrival_time, airport_from, airport_to, travel_time )
            statisticRepository.insertNewFlight(newFlight.toFlightDbEntity())
        }
    }
}