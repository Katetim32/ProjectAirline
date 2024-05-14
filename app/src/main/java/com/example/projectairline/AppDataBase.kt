package com.example.projectairline
import androidx.room.Database
import androidx.room.RoomDatabase
@Database(
    version = 1,
    entities = [
        FlightDBEntity::class,
        TicketDBEntity::class
    ]
)
abstract  class AppDataBase:RoomDatabase() {
    abstract fun getFlightsDao(): FlightsDao
    abstract fun getTicketsDao(): TicketsDao
}
