package com.brayanalfonso.retosbrayanalfonso

class Nequi {

}

//variables y recursos goblales globales

var saldoDisponible:Float = 4500F
var contador:Int=3

var numerosTelefonicos = mutableListOf<Long>(3214243125,3112604202,3115655522)
var claves= mutableListOf<Int>(1234,4321,1324)


//Funciones

        fun login(lphone:Long, lpassword:Int):Boolean{

            var indexPhone= numerosTelefonicos.indexOf(lphone)
            //println(indexPhone) Verificar si se trae correctamente la posicion del elemento
            var indexClave= claves.indexOf(lpassword)
            //println(indexClave) Verificar si se trae correctamente la posicion del elemento


            return if (indexPhone==indexClave && indexClave!=-1 && indexPhone!=-1){
                println("Bienvenido de vuelta!")
                true
            }else{
                println("¡Upps! Parece que tus datos de acceso no son correctos.")
                false
            }
        }
        fun createUser(){
            println("Estas en el apartado de crear usuario, por favor ingresa lo siguiente: \n" +
                    "1. Ingresa tu numero de telefono.\n")
                    numerosTelefonicos.add(readLine()!!.toLong())
                    //println(numerosTelefonicos.toString())  Validar si se agrego el elemento a la lista :p

            println("2. Ingresa una contraseña de 4 digitos.")
                    claves.add(readLine()!!.toInt())
                    //println(claves.toString()) Validar si se agrego el elemento a la lista
        }




        fun retirarDinero() {
            if (saldoDisponible > 2000) {
                println("Por favor, ingresa la cantidad de dinero que deseas retirar.")
                var cantDinero: Float = readLine()!!.toFloat()

                println("Estas seguro de que deseas retirar la cantidad de $cantDinero")
                var respuesta: String = readLine()!!.lowercase()
                if (respuesta == "si" || respuesta=="sí") {
                    if (cantDinero < saldoDisponible) {
                        var random: Int = (100000..999999).random()
                        println("Tu codigo para retirar es: $random")
                        saldoDisponible -= cantDinero
                        println("Tu saldo disponible actual es $saldoDisponible")
                    } else {
                        println("Lo sentimos no tienes fondos suficientes")
                    }
                } else {
                    println("Has rechazado el retiro.")
                }
            } else {
                println("Lo sentimos necesitas mas de $2000 para retirar")
            }
        }
        fun enviarDinero(){
            println("Ingresa el numero de telefono al que deseas enviar dinero.")
            var numEnvio:Long= readLine()!!.toLong()

            println("Ingresa la cantidad de dinero que deseas enviar.")
            var cantDineroEnvio:Float = readLine()!!.toFloat()

            if (cantDineroEnvio<saldoDisponible){
                saldoDisponible-=cantDineroEnvio
                println("Felicidades, la transacción ha sido exitosa al numero$numEnvio!\n" +
                        "Tu saldo disponible actual es $saldoDisponible")
            }else{
                println("Lo sentimos no tienes fondos suficientes para enviar dinero")
            }

        }

        fun recarga(recarga:Float){
            println("Estas seguro de recargar $recarga?")
            var respuesta:String= readLine()!!.lowercase()

            if (respuesta=="si" || respuesta=="sí"){
                saldoDisponible+=recarga
                println("Felicidades, la recarga ha sido exitosa!\n" +
                        "Tu saldo disponible actual es $saldoDisponible")
            }else{
                println("Has rechazado la recarga")
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

            do {
                println(" ")
                println("Login de usuario.\n" +
                        "Ingresa tu numero de telefono")
                var lphone: Long = readLine()!!.toLong()

                println("Ingresa tu clave")
                var lpassword: Int = readLine()!!.toInt()

                if (login(lphone, lpassword)) {

                    do {
                        println("Tu saldo disponible es $saldoDisponible")

                        println("Que quieres hacer el dia de hoy? \n" +
                                    "1. Sacar plata.\n" +
                                    "2. Enviar plata \n" +
                                    "3. Recarga.\n" +
                                    "4. Salir."
                        )
                        var accion: Int = readLine()!!.toInt()

                        if (accion == 1) {
                            println(
                                "Por favor, selecciona en donde sacaras tu dinero\n" +
                                        "1. Cajero.\n" +
                                        "2. Punto fisico."
                            )
                            var formaRetiro: Int = readLine()!!.toInt()
                            if (formaRetiro == 1) {
                                println("Has seleccionado la opcion de cajero.")
                                retirarDinero();

                            } else if (formaRetiro == 2) {
                                println("Has seleccionado la opcion de punto fisico.")
                                retirarDinero()
                            }else{
                                println("Has seleccionado una opción invalida")
                            }

                        } else if (accion == 2) {
                            enviarDinero()
                        } else if (accion == 3) {
                            println("Ingresa el valor que deseas recargar.")
                            var valorRecarga: Float = readLine()!!.toFloat()
                            recarga(valorRecarga)
                        } else if (accion == 4) {
                            println("Se ha cerrado tu sesión!")
                            break //Importante el break en este caso es para que salga del ciclo sin preguntar
                        } else {
                            println("Has ingresado un numero invalido")
                        }

                        println("Deseas volver al menu principal de opciones?")
                        var main: String = readLine()!!.lowercase()

                    } while (main == "si" || main=="sí")
                } else {
                    println("Tienes $contador intentos mas")
                    contador-=1
                    when(contador){
                        -1->println("Ya no tienes mas intentos:(")
                    }
                }
                println("Salir de nequi?")
                var salir:String= readLine()!!.lowercase()
                if (salir=="si" || salir=="sí"){
                    break
                }
            }while (contador>=0)

        } else if (respuesta == 2) {
            createUser()
        } else {
            println("Has ingresado una opcion invalida")
        }

        println("Deseas volver al menu de login?")
        var continuar:String=readLine()!!.lowercase()

    }while (continuar=="si" || continuar=="sí")
}