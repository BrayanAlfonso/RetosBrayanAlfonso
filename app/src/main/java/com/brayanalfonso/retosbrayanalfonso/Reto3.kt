package com.brayanalfonso.retosbrayanalfonso

import android.annotation.SuppressLint

class Reto3 {
}


fun main() {
    var carros= mutableListOf<String>()
    do {

    println("Bienvenido, al concesionario.")
    println("Ingresa el numero que deseas para realizar una accion. \n 1. Insertar auto. \n" +
            " 2. Mostrar todos los datos de la lista. \n" +
            " 3. Buscar carro. \n" +
            " 4. Modificar carro. \n" +
            " 5. Eliminar carro.")
    var option:Int= readLine()!!.toInt()


    if (option==1){
        println("Ingresa el nombre del auto que quieres insertar.")
                var nuevoCarro:String= readLine()!!.lowercase()

                if (carros.any{it == nuevoCarro}){
                    println("Lo sentimos este carro ya se encuentra en la lista")
                }else{
                    carros.add(nuevoCarro)
                    println("El carro $nuevoCarro ha sido registrado en la lista")
                }


    }else if (option==2){
        println("Los carros registrados son:")
        for ((index, carro) in carros.withIndex()){
            println("$index. $carro")
        }
    }else if (option==3){
        println("Ingresa el nombre del carro que deseas buscar")
        var buscarCarro:String= readLine()!!.lowercase()
        var indexCarro:Int=carros.indexOf(buscarCarro)
            if (indexCarro!=-1){
                println("El carro $buscarCarro se encuentra en la posicion $indexCarro de la lista.")
            }else{
                println("Lo sentimos el carro $buscarCarro no se encuentra en la lista")
            }
    }else if (option==4){
        println("Ingresa el nombre del carro que deseas actualizar")
        var buscarCarro:String=readLine()!!.lowercase()
        var indexCarro:Int=carros.indexOf(buscarCarro)
            if (indexCarro!=-1){
                println("Ingresa el nombre nuevo del carro $buscarCarro")
                var nuevoNombre:String= readLine()!!.lowercase()
                carros[indexCarro]=nuevoNombre
                println("El carro ha ido actualizado con el nombre $nuevoNombre")
            }else{
                println("Lo sentimos el carro $buscarCarro no se encuentra en la lista")
            }

    }else if (option==5){
        println("Ingresa el nombre del carro que deseas eliminar")
        var buscarCarro:String=readLine()!!.lowercase()
        var indexCarro:Int=carros.indexOf(buscarCarro)
            if (indexCarro!=-1){
                carros.remove(buscarCarro)
                println("El carro $buscarCarro ha sido eliminado")
            }else{
                println("Lo sentimos el carro $buscarCarro no se encuentra en la lista")
            }
    }else{
        println("Lo sentimos has ingresado una opcion invalida")
    }
        println("Deseas seguir consultando? Ingresa si para continuar")
        var seguir:String= readLine()!!.lowercase()
    }while (seguir=="si" || seguir=="sí")
}