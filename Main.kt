package com.example

fun greet(name: String): String {
    return "Hello, $name!"
}

fun main() {
    val message = greet("Kotlin")
    println(message)
}
