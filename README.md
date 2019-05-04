# KotlinTips

### Contents
1. [Arrays](#1-arrays)
2. [Access Modifiers](#2-access-modifiers)

### 1. Arrays
```kotlin
// simple string array
val stringArray = arrayOf("Iron Man", "Hulk", "Captain America", "Thor")

// simple int array
val intArray = arrayOf(1, 2, 3, 4, 5)

com.bhavya_karia.arraysavya_karia.arrays
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
val arrayWithSize = arraycom.bhavya_karia.
arrays primitive com.bhavya_karia.arrays
val primitiveIntArray = IntArray(10) { i -> i + 1 }
primitiveIntArray.forEach { println(it) }
// Output: 1 2 3 4 5 6 7 8 9 10
```

#### Key Points
1. Whenever possible use com.bhavya_karia.arrays with primitive data type i.e. `IntArray`, `CharArray`, `ByteArray` and so on for better performance.
2. Unlike Java, com.bhavya_karia.arrays are invariant in Kotlin. This means that Kotlin does not let us assign an Array<String> to an Array<Any>, which prevents a possible runtime failure.

### 2. Access Modifiers
Four access modifiers are:
1. public
2. private
3. protected
4. internal

#### Key Points
1. By default, classes are public in Kotlin, unlike Java where they are package private.
2. Unlike Java, classes can be private and only items in that file can access them.
3. In Kotlin, outer class  cannot see private members of the inner class.
4. The jvm converts the `internal` modifier to public on compilation.
5. Special attention should be given to visibility of classes when using both Java and Kotlin.  