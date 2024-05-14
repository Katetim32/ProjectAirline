package com.example.projectairline
import androidx.room.*
@Entity(
    tableName = "tickets" ,
    foreignKeys = [
        ForeignKey(
            entity = FlightDBEntity::class,
            parentColumns = ["flight_id"],
            childColumns = ["fl_id"],
            onDelete = ForeignKey.CASCADE
        )
    ]
)
data class TicketDBEntity (
    @PrimaryKey(autoGenerate = true) val ticket_id: Long,
    val fl_id: Long,
    val price: Float,
    val klass: String,
    val luggage: Boolean,
    val status: String
)