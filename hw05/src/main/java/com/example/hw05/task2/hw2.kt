package com.example.hw05.task2

fun applyTwice(n: Int, operation: (Int) -> Int): Int = operation(operation(n))

fun printIf(items: List<String>, condition: (String) -> Boolean) {
    items.filter(condition).forEach { println(it) }
}
fun <T> transform(list: List<T>, mapper: (T) -> String): List<String> = list.map(mapper)
fun main() {
    val ganda ={ angka :Int ->  angka * 2 }
    val mulaiVokal: (String) -> Boolean = {
        it.isNotEmpty() && it.first().lowercaseChar() in "aeiou"
    }
    println(applyTwice(3, ganda))
    val courses = listOf(
        "Algorithms",
        "Database",
        "Informatics",
        "Mobile Application Development",
        "Operating Systems"
    )
    printIf(courses, mulaiVokal)
    println(transform(listOf(2, 3, 4)) { (it * it).toString() })
}
