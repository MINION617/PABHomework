package com.example.hw04.task1

data class Buku(val isbn: String, val title: String, val year: Int)

fun main() {
    //buku yang dipake
    val bukuKotlin = Buku("978-9-0002-0617-1", "Kotlin in Action", 2024)
    val bukuAndroid = Buku("978-7-0030-0502-8", "Android Basics", 2023)
    //toString otomatis
    println(bukuKotlin)
    println(bukuAndroid)
    //copy pake year
    val updatedBook = bukuKotlin.copy(year = 2026)
    println(updatedBook)
    println(bukuKotlin == bukuAndroid)
}
