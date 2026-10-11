package com.example.hw05.task5

import kotlin.math.roundToInt
data class Student(val name: String, val score: Int, val year: Int)
val students = listOf(
    Student("Ali", 85, 2023),
    Student("Budi", 62, 2022),
    Student("Citra", 91, 2023),
    Student("Dewi", 58, 2022),
    Student("Eka", 76, 2023)
)
fun main() {
    // Make partition buat nentuin kelulusan
    val (passing, failing) = students.partition { it.score >= 70 }
    println("Passing: ${passing.size}   Failing: ${failing.size}")
    // Menemukan tertinggi dan terendah
    students.maxByOrNull { it.score }
        ?.let { println("Top scorer : ${it.name} (${it.score})") }
    students.minByOrNull { it.score }
        ?.let { println("Low scorer : ${it.name} (${it.score})") }
    // Menghitung rata-rata kelas
    val total = students.fold(0) { sum, student -> sum + student.score }
    val average = (total * 10.0 / students.size).roundToInt() / 10.0
    println("Class average: $average")
    // Membuat laporan
    val report = buildString {
        appendLine("--- Grade Report ---")
        students.forEach {
            val status = if (it.score >= 70) "PASS" else "FAIL"
            appendLine("${it.name.padEnd(9)}${it.score}  $status")
        }
    }
    print(report)
}
