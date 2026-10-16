package com.example.hw04.task4

fun main() {
    //MutableList
    val courses = mutableListOf("SIF3002", "SIF617", "SIF0502", "SIF000")
    courses.add("SIF404")
    courses.add("SIF505")
    courses.remove("SIF3002")
    println("Final list: $courses")
    //Set
    val unikCourses = courses.toSet()
    println("Unique courses: $unikCourses")
    //Map
    val creditMap = mapOf(
        "SIF3002" to 3,
        "SIF617" to 4,
        "SIF0502" to 3,
        "SIF404" to 3,
        "SIF505" to 2
    )
    val credits617 = creditMap["SIF617"] ?: 0
    println("SIF617 credits: $credits617")
    val credits666 = creditMap.getOrDefault("SIF666", 0)
    println("SIF666 credits: $credits666 (course tidak ditemukan)")
    //Ringkasan
    val totalCredits = unikCourses.sumOf { creditMap[it] ?: 0 }
    println("Total courses terdaftar: ${unikCourses.size}")
    println("Total credit : $totalCredits")
}
