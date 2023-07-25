package com.brayanalfonso.retosbrayanalfonso

class Nequi {

}
var phone:Int = 0
var password:Int = 0

fun createUser(){
    println("Estas en el aprtado de crear usuario, por favor ingresa lo siguiente: \n" +
            "1. Ingresa tu numero de telefono.\n")
        phone= readLine()!!.toInt()

    println("2. Ingresa una contraseña de 4 digitos.")
        password= readLine()!!.toInt()
}

fun login(lphone:Int, lpassword:Int):Boolean{
    if (lphone== phone && lpassword==password){
        println("Bienvenido al Login")
        return true
    }else{
        println("Lo sentimos tus datos de acceso son incorrectos")
        return false
    }
}

fun main() {



    do {

        println(
            "Bienvenido a nequi :D \n" +
                    "Por favor, selecciona.\n" +
                    "1. Tengo una cuenta, iniciar sesión.\n" +
                    "2. No tengo una cuenta, crear cuenta."
        )
        var respuesta: Int = readLine()!!.toInt()

        if (respuesta == 1) {

            println("Ingresa tu numero de telefono")
            var lphone: Int = readLine()!!.toInt()

            println("Ingresa tu clave")
            var lpassword: Int = readLine()!!.toInt()


            if (login(lphone, lpassword)==true){

                do {


                    var saldoDisponible = 4500
                    println("Tu saldo disponible es $saldoDisponible")
                    println(" ")
                    println(
                        "Que quieres hacer el dia de hoy? \n" +
                                "1. Sacar plata.\n" +
                                "2. Enviar plata \n" +
                                "3. Recarga.\n" +
                                "4. Salir."
                    )
                    var accion: Int = readLine()!!.toInt()

                    if (accion == 1) {
                        if (saldoDisponible>2000){
                            println("Por favor, selecciona en donde sacaras tu dinero\n" +
                                    "1. Cajero.\n" +
                                    "2. Punto fisico.")
                            var formaRetiro:Int= readLine()!!.toInt()
                            if (formaRetiro==1){
                                println("Has seleccionado la opcion de cajero.")
                            }else if (formaRetiro==2){
                                println("Has seleccionado la opcion de punto fisico")
                            }
                        }
                    } else if (accion == 2) {

                    } else if (accion == 3) {

                    } else if (accion == 4) {
                        println("Se ha cerrado tu sesión!")
                    } else {
                        println("Has ingresado un numero invalido")
                    }

                    println("Deseas volver al menu principal de opciones?")
                    var main:String= readLine()!!.lowercase()
                }while (main=="si")
            }else{
                println("Algo ha ocurrido")
            }


        } else if (respuesta == 2) {
            createUser()

        } else {
            println("Has ingresado una opcion invalida")
        }

        println("Deseas volver al login principal?")
        var continuar:String=readLine()!!

    }while (continuar=="si")
}