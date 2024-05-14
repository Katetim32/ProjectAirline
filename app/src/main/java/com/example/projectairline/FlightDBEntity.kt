package com.example.projectairline
import androidx.room.*
import java.sql.Time
import java.util.Date

@Entity(
    tableName = "flights"
)
data class FlightDBEntity (
    @PrimaryKey(autoGenerate = true) val flight_id: Long,
    val place_from: String,
    val place_to: String,
    val departure_date: String,
    val arrival_date: String,
    val departure_time: String,
    val arrival_time: String,
    val airport_from: String,
    val airport_to: String,
    val travel_time: Float
)