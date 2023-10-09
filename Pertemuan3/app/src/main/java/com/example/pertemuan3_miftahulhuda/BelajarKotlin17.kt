package com.example.pertemuan3_miftahulhuda

fun main() {
    println("Contoh High order 1")
    contohFungsi(3, :: contohFungsi2)

    println("\nContoh High order 2")
    val jumlah = contohFungsi3(25)
    println("Hasil penjumlahan 25 + 30 = ${jumlah(30)}")
}

fun contohFungsi(kls: Int, fungsi:(Int) -> Unit){
    print("selamat kalian sudah berhasil naik kelas")
    fungsi(kls)
}

fun contohFungsi2(kls: Int){
    println(kls)
}

fun contohFungsi3(nilai1: Int): (Int) -> Int = {
    nilai2 -> nilai2 + nilai1
}