package com.brayanalfonso.retosbrayanalfonso

class Reto1 {
}

fun main() {

    println("RREGLAS DEL JUEGO \n" +
            "Puedes ganar si obtienes:\n" +
            "Un par de unos en ambos dados\n" +
            "Un total de tres en la suma de ambos lados\n" +
            "Un total de 11 en la suma de ambos lados\n" +
            "Si se obtienes dos o doce en la suma de los lados\n" +
            "Un total de 7 en la suma de los lados\n")
    var dado1: Int=(1..6).random()
    var dado2: Int=(1..6).random()
    println("El dado uno ha caido en $dado1")
    println("El dado dos ha caido en $dado2")

    var sum: Int=dado1+dado2

    if(dado1==1 && dado2==1){
        println("Felicitaciones has ganado ya que los dos lados salieron 1")
    }else if (sum==3){
        println("Felicitaciones has ganado ya que la suma de ambos numeros es 3")
    }else if (sum==11){
        println("Felicitaciones has ganado ya que la suma de ambos numeros es 11")
    }else if(sum==1 || sum==12){
        println("Felicitaciones has ganado ya que la suma de ambos lados ha sido 1 o 12")
    }else if (sum==7){
        println("Felicitaciones has ganado ya que la suma de ambos numeros es 7")
    }else{
        println("Parece que has perdido")
    }
}