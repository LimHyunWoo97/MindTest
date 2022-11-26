package com.example.mindtestapp

data class Ticket(val companyName : String, val name : String, var date : String, var seatNum : Int)
// 컴파일시 toString(), hashCode(), equals(), copy()
class TicketNormal(val companyName : String, val name : String, var date : String, var seatNum : Int)
fun main(){
    val ticketA = Ticket("koreanAir", "LimHyunWoo", "2022-11-24", 18)
    val ticketB = TicketNormal("koreanAir", "LimHyunWoo", "2022-11-24", 18)

    println(ticketA)
    println(ticketB)
}