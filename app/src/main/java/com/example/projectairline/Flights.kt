package com.example.projectairline

data class Flights (
    val place_from: String,
    val place_to: String,
    val departure_date: String,
    val arrival_date: String,
    val departure_time: String,
    val arrival_time: String,
    val airport_from: String,
    val airport_to: String,
    val travel_time: Float
){
    fun toFlightDbEntity(): FlightDBEntity = FlightDBEntity(
        flight_id = 0,
        place_from = place_from,
        place_to = place_to,
        departure_date=departure_date,
        arrival_date=arrival_date,
        departure_time=departure_time,
        arrival_time=arrival_time,
        airport_from=airport_from,
        airport_to=airport_to,
        travel_time=travel_time
    )
}