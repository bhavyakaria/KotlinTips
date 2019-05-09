package com.bhavya_karia.control_flow

/**
 * @author  Bhavya Karia
 */

/**
 * Kotlin support all the commonly used loops - for, while, do while
 * But the for loop works a bit differently than in Java
 */

class SuperHeroes(val name: String)

class Avengers(private val heroes: List<SuperHeroes>) {

    // define an iterator with name as iterator and return user-defined data object
    operator fun iterator(): Iterator<SuperHeroes> {
        return heroes.iterator()
    }
}

fun main() {

    val carCompanies = listOf("Ferrari", "BMW", "Mercedes", "Audi", "Tata Motors")

    println("===== FOR =====")
    // for
    for (companyName in carCompanies) {
        println(companyName)
    }

    println("===== WHILE =====")
    // while
    var count = 0
    while (count < 5) {
        println(count)
        count++
    }

    println("===== DO-WHILE =====")
    // do-while
    var num = 100
    do {
        println(num)
        num++
    } while (num < 100)

    println("===== ITERATORS =====")
    // iterators - you can have your own custom iterator
    val avengers = Avengers(listOf(SuperHeroes("Iron Man"), SuperHeroes("Captain America"), SuperHeroes("Black Widow")))
    for (avenger in avengers) {
        println(avenger.name)
    }
}