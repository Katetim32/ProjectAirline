package com.example.projectairline
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query

@Dao
interface TicketsDao {
    @Insert(entity = TicketDBEntity::class)
    fun insertNewTicket(ticket: TicketDBEntity)

    @Query("SELECT ticket_id, fl_id, price, klass, luggage, status FROM tickets " +
            "INNER JOIN flights ON tickets.fl_id = flights.flight_id;")
    fun getTickets(): List<TicketsInfoTuple>

}