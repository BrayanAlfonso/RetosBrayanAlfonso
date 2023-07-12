package com.brayanalfonso.retosbrayanalfonso

class Reto1 {
}

fun main() {
    var dado1: Int=(1..6).random()
    var dado2: Int=(1..6).random()
    println("El dado uno ha caido en $dado1")
    println("El dado dos ha caido en $dado2")

    var sum: Int=dado1+dado2

    if(dado1==1 && dado2==1){
        println("Felicitaciones has ganado")
    }else if (sum==3){
        println("Felicitaciones has ganado")
    }else if (sum==11){
        println("Felicitaciones has ganado")
    }else if(sum==1 || sum==12){
        println("Felicitaciones has ganado")
    }else if (sum==7){
        println("Felicitaciones has ganado")
    }else{
        println("Parece que has perdido")
    }
}