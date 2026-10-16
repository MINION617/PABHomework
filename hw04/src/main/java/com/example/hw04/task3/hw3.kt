package com.example.hw04.task3

//hitung huruf
fun String.hitungHuruf(): Int = split(" ").filter { it.isNotBlank() }.size

//kasih rupiah sama "."
fun Int.toRupiahString(): String {
    val tanda = if (this < 0) "-" else ""
    val digit = (if (this < 0) -this else this).toString()
    val satuin = digit.reversed().chunked(3).joinToString(".").reversed()
    return "Rp $tanda$satuin"
}

//Rata-rata make min dan max
fun List<Int>.clampedAverage(min: Int, max: Int): Double {
    val filtered = filter { it in min..max }
    if (filtered.isEmpty()) return 0.0
    return filtered.sum().toDouble() / filtered.size
}

fun main() {
    println("Kotlin".hitungHuruf())
    println("I love Kotlin".hitungHuruf())
    println("Mobile application development is fun and useful".hitungHuruf())

    println(1000.toRupiahString())
    println(50000.toRupiahString())
    println(1000000.toRupiahString())

    val result = listOf(10, 50, 200, 85, -5).clampedAverage(0, 100)
    println("listOf(10, 50, 200, 85, -5).clampedAverage(0, 100) = $result")
}
