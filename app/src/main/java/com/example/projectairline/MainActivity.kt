package com.example.projectairline

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.content.Intent
import android.widget.SimpleAdapter
import android.widget.Toast
import com.example.projectairline.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private val viewModel by lazy { MainViewModel(Dependencies.Repository) }
    override fun onCreate(savedInstanceState: Bundle?) {
        Dependencies.init(applicationContext)
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater).also { setContentView(it.root) }
        binding.buttonSaveReis.setOnClickListener { addFlightButtonPressed() }

    }
    private fun addFlightButtonPressed() {
        if (isEditFlightEmpty()){
            viewModel.insertNewFlightDataInDatabase(
                place_from = binding.editTextPlaceFrom.text.toString(),
                place_to = binding.editTextPlaceTo.text.toString(),
                departure_date = binding.editTextDateDep.text.toString(),
                arrival_date = binding.editTextDateAr.text.toString(),
                departure_time = binding.editTextTimeDep.text.toString(),
                arrival_time = binding.editTextTimeAr.text.toString(),
                airport_from = binding.editTextAirportFrom.text.toString(),
                airport_to = binding.editTextAirportTo.text.toString(),
                travel_time = binding.editTextNumberTime.text.toString().toFloat()
            )
            Toast.makeText(this, "Данные были успешно вставлены в таблицу!", Toast.LENGTH_SHORT)
                .show()
        } else Toast.makeText(this, "Не все поля были заполнены!", Toast.LENGTH_SHORT)
            .show()

    }
    private fun isEditFlightEmpty(): Boolean {
        val isPlaceFRom = if (binding.editTextPlaceFrom.text.toString().isNotBlank()) {
            binding.editTextPlaceFrom.error = null
            true
        } else {
            binding.editTextPlaceFrom.error = "Field can not be empty!"
            false
        }
        val isPlaceTo = if (binding.editTextPlaceTo.text.toString().isNotBlank()) {
            binding.editTextPlaceTo.error = null
            true
        } else {
            binding.editTextPlaceTo.error = "Field can not be empty!"
            false
        }
        val isDateDepart = if (binding.editTextDateDep.text.toString().isNotBlank()) {
            binding.editTextDateDep.error = null
            true
        } else {
            binding.editTextDateDep.error = "Field can not be empty!"
            false
        }
        val isDateArrive = if (binding.editTextDateAr.text.toString().isNotBlank()) {
            binding.editTextDateAr.error = null
            true
        } else {
            binding.editTextDateAr.error = "Field can not be empty!"
            false
        }
        val isTimeDepart = if (binding.editTextTimeDep.text.toString().isNotBlank()) {
            binding.editTextTimeDep.error = null
            true
        } else {
            binding.editTextTimeDep.error = "Field can not be empty!"
            false
        }
        val isTimeArrive= if (binding.editTextTimeAr.text.toString().isNotBlank()) {
            binding.editTextTimeAr.error = null
            true
        } else {
            binding.editTextTimeAr.error = "Field can not be empty!"
            false
        }
        val isAirportFrom= if (binding.editTextAirportFrom.text.toString().isNotBlank()) {
            binding.editTextAirportFrom.error = null
            true
        } else {
            binding.editTextAirportFrom.error = "Field can not be empty!"
            false
        }
        val isAirportTo= if (binding.editTextAirportTo.text.toString().isNotBlank()) {
            binding.editTextAirportTo.error = null
            true
        } else {
            binding.editTextAirportTo.error = "Field can not be empty!"
            false
        }
        val isTimeTravel= if (binding.editTextNumberTime.text.toString().isNotBlank()) {
            binding.editTextNumberTime.error = null
            true
        } else {
            binding.editTextNumberTime.error = "Field can not be empty!"
            false
        }

        return isAirportFrom && isAirportTo && isDateArrive && isTimeArrive && isTimeDepart
                && isDateDepart && isPlaceTo && isPlaceFRom && isTimeTravel
    }

}