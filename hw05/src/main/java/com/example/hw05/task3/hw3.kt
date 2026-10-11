package com.example.hw05.task3

data class Student(val name: String, val score: Int, val year: Int)
val students = listOf(
    Student("Ali", 85, 2023),
    Student("Budi", 62, 2022),
    Student("Citra", 91, 2023),
    Student("Dewi", 58, 2022),
    Student("Eka", 76, 2023)
)
fun main() {
//    Buat nyaring nilai 70
    val passing = students.filter { it.score >= 70 }
    println("Students with score >= 70: ${passing.size}")
//    Buat map
    students
        .map { "${it.name} (${it.score})" }
        .forEach { println(it) }
//    Penyaringan make score
    val topThree = students
        .sortedByDescending { it.score }
        .take(3)
        .map { it.name }
    println("Top 3: ${topThree.joinToString(", ")}")
//    Menghitung total score dan rata2 kelas
    val total = students.fold(0) { sum, student -> sum + student.score }
    val average = total.toDouble() / students.size
    println("Total: $total   Average: $average")
//    Kelompokin murid
    students
        .groupBy { it.year }
        .forEach { (year, group) -> println("$year: ${group.map { it.name }}") }
}
