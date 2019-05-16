package com.bhavya_karia.control_flow

/**
 * @author  Bhavya Karia
 */

/**
 * Kotlin support all the commonly used loops - for, while, do while
 * But the for loop works a bit differently than in Java. Here you will find various types of loops and its ranges
 *
 */

fun main() {

    // simple for loop with in
    for (i in 0..3) {
        println(i)
    }
    // Output: 0 1 2 3

    // simple for loop with until
    for (i in 0 until 5) {
        println(i)
    }
    // Output: 0 1 2 3 4

    // incrementing with n steps
    for (i in 0..10 step 2) {
        println(i)
    }
    // Output: 0 2 4 6 8 10

    // reverse counting till n
    for (i in 5 downTo 2) {
        println(i)
    }

    // you can even have char ranges
    for (a in 'a'..'f') {
        println(a)
    }

}