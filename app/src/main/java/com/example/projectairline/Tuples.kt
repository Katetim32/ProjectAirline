package com.example.projectairline

data class FlightsInfoTuple (
    val flight_id: Long,
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
data class TicketsInfoTuple(
    val ticket_id: Long,
    val fl_id: Long,
    val price: Float,
    val klass: String,
    val luggage: Boolean,
    val status: String
)