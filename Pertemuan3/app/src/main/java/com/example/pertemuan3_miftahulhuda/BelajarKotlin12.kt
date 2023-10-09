package com.example.pertemuan3_miftahulhuda

fun main() {
    namaKu()
    contohReturn("budi", 12)
    println("Ini hasil dari function jumlah:  ${jumlah(5, 10,15,20)}")
}

fun namaKu(){
    println("Shumaya Resty R")
}

fun contohReturn(nama: String, umur: Int) {
    println("Halo, namaku $nama. umurku $umur tahum")
}

fun jumlah(vararg angka: Int): Int {
    var hasilJumlah = 0
    angka.forEach {nilai -> hasilJumlah += nilai}

    return hasilJumlah
}