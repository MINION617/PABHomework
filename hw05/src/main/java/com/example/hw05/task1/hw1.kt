package com.example.hw05.task1

fun main() {
//    Fungsi ganda
    val ganda ={ angka :Int ->  angka * 2 }
    println(ganda(7))
//    Cek huruf vokal di awal kata
    val mulaiVokal: (String) -> Boolean = {
        it.isNotEmpty() && it.first().lowercaseChar() in "aeiou"
    }
    println(mulaiVokal("apple"))
    println(mulaiVokal("Banana"))
    println(mulaiVokal("orange"))
    val lebihBesar: (Int, Int) -> Int = { a, b -> if (a > b) a else b }
    println(lebihBesar(12, 7))
}
