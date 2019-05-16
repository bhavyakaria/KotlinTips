package com.bhavya_karia.control_flow

/**
 * @author  Bhavya Karia
 */

/**
 * When - Instead of switch, we have when in Kotlin which is more flexible and clear to use.
 * It can be used as an expression or as a statement.
 *
 */

fun main() {

    // 1. When - Statement
    cases(1)
    cases("One")
    cases(1.0)
    cases('1')
    cases(15)

    // 2. When - Expression
    val value = when ("Car") {
        "Car" -> "It's a car!"
        "Bus" -> "It's a bus."
        else -> "It's nothing."
    }
    println(value)

    // you can have when without argument
    val num = 5
    val string = "Ronaldo"
    val res = when {
        num in 0..10 -> "It's cheap"
        string.contains("Ron") -> "String contains Ron"
        else -> ""
    }
    println(res)

}

fun cases(obj: Any) {
    when (obj) {
        1 -> println("Int 1")
        "One" -> println("String One")
        is Double -> println("Double 1.0")
        '1' -> println("Char 1")
        in 10..20 -> println("Number in 10-20")
    }
}