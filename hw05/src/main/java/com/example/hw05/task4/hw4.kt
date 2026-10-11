package com.example.hw05.task4

data class Config(var host: String = "", var port: Int = 0, var debug: Boolean = false)
fun main() {
    // make apply
    val config = Config().apply {
        host = "localhost"
        port = 8080
        debug = true
    }
    println(config)
    // Make let jadi upper case kalo gak null
    val name: String? = "Rina"
    name?.let { println(it.uppercase()) }

    // Penggabungan
    val numbers = mutableListOf(6, 1, 7)
    numbers
        .also { println("Before: $it") }
        .apply { add(6) }
        .also { println("After: $it") }
}
