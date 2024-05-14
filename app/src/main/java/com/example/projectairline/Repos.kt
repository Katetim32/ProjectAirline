package com.example.projectairline
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
class Repos(private val flightsDao: FlightsDao, private val ticketsDao: TicketsDao) {
    suspend fun insertNewFlight(flightDbEntity: FlightDBEntity){
        withContext(Dispatchers.IO){
            flightsDao.insertNewFlight(flightDbEntity)
        }
    }
    suspend fun getAllFlights(): List<FlightsInfoTuple>{
        return withContext(Dispatchers.IO) {
            return@withContext flightsDao.getFlights()
        }
    }
    suspend fun updateFlight(flightDbEntity: FlightDBEntity) {
        withContext(Dispatchers.IO) {
            flightsDao.updateFlight(flightDbEntity)
        }
    }
    suspend fun removeFlight(flightDbEntity: FlightDBEntity) {
        withContext(Dispatchers.IO) {
            flightsDao.deleteFlight(flightDbEntity)
        }
    }
    suspend fun insertNewTicket(ticketDbEntity: TicketDBEntity){
        withContext(Dispatchers.IO){
            ticketsDao.insertNewTicket(ticketDbEntity)
        }
    }
    suspend fun getAllTickets(): List<TicketsInfoTuple>{
        return withContext(Dispatchers.IO) {
            return@withContext ticketsDao.getTickets()
        }
    }
}