package com.brayanalfonso.retosbrayanalfonso

class Reto2 {
}

fun main() {
    var total: Float= 0F
    var descuento: Float= 0F
    var pago: Float= 0F
    var cambio: Float=0F

    do {

        println("Ingrese el precio del producto")
        var precio: Float= readLine()!!.toFloat()



        println("Ingrese la cantidad del producto")
        var cantidad:Int = readLine()!!.toInt()

        total += precio*cantidad

        println("Deseas agregar otro producto? Ingresa si para continuar")
        var opcion: String= readLine()!!

    }while (opcion=="si")



    if (total>50000){
        println("Felicidades has ingresado al concurso")
        var bolita: Int=(1..4).random()
        // 1 es roja, 2 es azul, 3 es amarilla, 4 es blanca

        println("Total neto a pagar: $total")

        if (bolita==1){
            println("Has sacado una bolita roja, tienes un descuento del 10% en tu compra!")
            descuento=total-(total*0.10F)
            println("Por lo que tu total a pagar es de $descuento")
        }else if (bolita==2){
            println("Has sacado una bolita azul, tienes un descuento del 30% en tu compra!")
            descuento=total-(total*0.30F)
            println("Por lo que tu total a pagar es de $descuento")
        }else if (bolita==3){
            println("Has sacado una bolita amarilla, tienes un descuento del 50% en tu compra!")
            descuento=total-(total*0.50F)
            println("Por lo que tu total a pagar es de $descuento")
        }else{
            println("Has sacado una bolita blanca, tienes un descuento del 100% en tu compra!")
            descuento=0F
            println("Por lo que tu total a pagar es de $0")
        }

        println("Con cuanto vas a pagar?")
        pago= readLine()!!.toFloat()

        cambio=pago-descuento

        println("Tu cambio es de $cambio")
    }else{
        println("Lo sentimos, no has podido ingresar D:")
        println("Tu valor a pagar es de $total")
        println("Con cuanto vas a pagar?")
        pago= readLine()!!.toFloat()
        cambio=pago-total
        println("Tu cambio es de $cambio")
    }
}