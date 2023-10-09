package com.example.pertemuan3_miftahulhuda

import java.lang.Exception

fun main() {
    println("Coba exception handling 1")
    try {
        val testError = 10/0
        println("Contoh error")
        println(testError)
    }catch (e: ArithmeticException) {
        println("Aritmetic Exception")
    }catch (e: Exception) {
        println(e)
    }finally {
        println("Pada block Finally, apapun itu yang terjadi ya tetap di print")
    }

    println("\nCoba Exception handling 2")
    contohError()
}
fun contohError() {
    try{
        println("Sebelum exception")
        throw Exception("Hayooooo masalahnya masuk ke throw")
        println("Sesudah exception")

    } catch (e :  Exception) {
        println(e)
    }finally {
        println("Masih error, tapi finally tetap muncul ya")
    }
}