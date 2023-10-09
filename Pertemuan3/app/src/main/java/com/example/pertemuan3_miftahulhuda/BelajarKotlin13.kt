package com.example.pertemuan3_miftahulhuda

fun main() {
    val jumlah = {nilai1: Int, nilai2: Int -> nilai1 + nilai2}
    println("Hasil darri 10 + 3 = ${jumlah(10,3)}")

    val nama = {
        nama: String, tempatLahir: String -> println("Halo, namaku $nama. "+"aku lahir di $tempatLahir")
    }

    nama("Budi", "Dumai")
}