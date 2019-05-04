package arrays

fun main(args: Array<String>) {

    // simple string array
    val stringArray = arrayOf("Iron Man", "Hulk", "Captain America", "Thor")

    // simple int array
    val intArray = arrayOf(1, 2, 3, 4, 5)

    // simple long arrays
    val longArray1 = arrayOf(1L, 2L, 3L)
    val longArray2 = arrayOf<Long>(1, 2, 3)         // if data type not provided then smart casting will convert it into array of int

    // simple array of 10 even numbers from 0
    val evenNumbers = Array(10) { i -> i * 2 }
    evenNumbers.forEach { println(it) }
    // Output: 0 2 4 8 16 32 64 128 256 512

    // simple mixed array
    val mixedArray = arrayOf("Awesome", 22, 10.10, 'f')     // here mixedArray is of type Array<Any>

    // passing an array to a java method requiring primitive array type
    val numberToPass = intArrayOf(1, 2, 3, 4)       // you need
    DummyClass().printNumbers(numberToPass)
    // Output: 1 2 3 4

    // initialize array with fixed size but no values
    val arrayWithSize = arrayOfNulls<Int>(10)

    // primitive arrays
    val primitiveIntArray = IntArray(10) { i -> i + 1 }
    primitiveIntArray.forEach { println(it) }
    // Output: 1 2 3 4 5 6 7 8 9 10


}