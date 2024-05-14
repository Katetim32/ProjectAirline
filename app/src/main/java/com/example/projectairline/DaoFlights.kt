package com.example.projectairline
import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update

@Dao
interface FlightsDao {
    @Insert(entity = FlightDBEntity::class)
    fun insertNewFlight(flight: FlightDBEntity)

    @Query("SELECT flight_id, place_from, place_to, departure_date, " +
            "arrival_date, departure_time,arrival_time, airport_from, airport_to," +
            "travel_time FROM flights;")
    fun getFlights(): List<FlightsInfoTuple>

    @Query("SELECT ticket_id, fl_id, price, klass, luggage, status FROM tickets " +
            "INNER JOIN flights ON tickets.fl_id = flights.flight_id;")
    fun getTickets(): List<TicketsInfoTuple>

    @Update(entity = FlightDBEntity::class)
    fun updateFlight(flight: FlightDBEntity)

    @Delete(entity = FlightDBEntity::class)
    fun deleteFlight(flight: FlightDBEntity)
}