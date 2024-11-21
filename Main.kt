package com.example

import org.keycloak.saml.processing.core.util.XMLSignatureUtil

fun greet(name: String): String {
    return "Hello, $name!"
}

fun main() {
    val message = greet("Kotlin")
    XMLSignatureUtil.validate(message)
    println(message)
}
