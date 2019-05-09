# KotlinTips

### Contents
1. [Arrays](#1-arrays)
2. [Access Modifiers](#2-access-modifiers)
3. [Scope Functions](#3-scope-functions)
4. [Control Flow](#4-control-flow)

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

### 3. Scope Functions
Five Scope Functions are:
1. let
2. run
3. with
4. apply
5. also

```kotlin
val firstName = "Bhavya"
val lastName = "Karia"

// 1. let - It is generally used for scoping and null checks
// Object reference inside the scope - it
val fullName = firstName.let {
    println("First Name is $it")
    it.plus(" $lastName")
}
println(fullName)

// 2. with - It is a non-extension function that can access members of its argument concisely: you can omit the instance name when referring to its members.
// Object reference inside the scope - this
val ironMan = Superheroes("Iron Man", "Marvel", "Avengers", 3)
with(ironMan) {
    name = "Captain America"
    println("$name is published by $publisher and has $numberOfFilms made on him")
}

// 3. run - It basically does exactly same as let. The main difference is that inside run the object is referenced by this
// Object reference inside the scope - this
val sampleString = "Its just a sample string"
val length = sampleString.run {
    println("isEmpty ${isEmpty()}")
    length
}
println("The length is $length")

// 4. apply - executes a block of code on an object and returns the object itself
// Object reference inside the scope - this
val captainAmerica = Superheroes()
val strSample = captainAmerica.apply {
    name = "Captain America"
    publisher = "Marvel"
    team = "Avengers"
    numberOfFilms = 3
}.toString()
println(strSample)

// 5. also - Works like apply
// Object reference inside the scope - it
val antMan = Superheroes("Ant Man", "Marvel", "None", numberOfFilms = 2).also {
    writeToLog(it)
}
```   

### 4. Control Flow
**Loops:**
1. Kotlin has all the common ones like for, while and do-while.
2. The for loop in Kotlin is slightly different than in Java/Javascript.

for loop in Java:
```java
for (int i = 0; i < 10; i++) {
    // do something...
}
```

for loop in Kotlin:
```kotlin
for (i in 0..10) {
    // do something...
}
```

**Ranges:**
1. There are various sets to define a range in Kotlin.
2. You can also iterate over char ranges i.e. a-z

```kotlin
(i in 0..10)        -> "Iterate from 0 to 10(inclusive) with increment of 1"
(i in 0 until 10)   -> "Iterate from 0 to 10(exclusive) with increment of 1"
(i in 2..10 step 2) -> "Iterate from 2 to 10(inclusive) with increment of 2"
(i in 3 downTo 0)   -> "Iterate in reverse order from 3 to 0"
(c in 'a'..'f')     -> "Iterate from a to f"
```


