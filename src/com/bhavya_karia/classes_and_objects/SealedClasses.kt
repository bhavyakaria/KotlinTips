package com.bhavya_karia.classes_and_objects

/**
 * @author Bhavya Karia
 */

/**
 * Example of sealed classes
 *
 */

sealed class SealedClasses {
    val sampleValue = "Sample Value"
}

class ClassA : SealedClasses()

class ClassB : SealedClasses()


fun main() {
    val classA: ClassA = ClassA()

    checkSealedClasses(classA)
}

fun checkSealedClasses(aClass: SealedClasses) {
    when (aClass) {
        is ClassA -> println("It's a class A")
        is ClassB -> println("It's a class B")
    }
}



