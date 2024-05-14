package com.example.projectairline

data class Tickets (
    val fl_id: Long,
    val price: Float,
    val klass: String,
    val luggage: Boolean,
    val status: String
){
    fun toTicketDbEntity(): TicketDBEntity = TicketDBEntity(
        ticket_id = 0,
        fl_id=fl_id,
        price=price,
        klass=klass,
        luggage=luggage,
        status=status
    )
}
