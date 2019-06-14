# Control Flow

**When**
1. Kotlin has when in place of `switch` and they are more flexible and clear to use.
2. In Kotlin, only one case gets executed unlike Java where if break is not provided then succeeding case might also get executed.
3. It can be used as an expression as well as statement.

```kotlin
// 1. When - Statement
when (obj) {
    1 -> println("Int 1")
    "One" -> println("String One")
    is Double -> println("Double 1.0")
    '1' -> println("Char 1")
    in 10..20 -> println("Number in 10-20")
}

// 2. When - Expression
val value = when ("Car") {
    "Car" -> "It's a car!"
    "Bus" -> "It's a bus."
    else -> "It's nothing."
}

// you can have when without argument
val num = 5
val string = "Ronaldo"
val res = when {
    num in 0..10 -> "It's cheap"
    string.contains("Ron") -> "String contains Ron"
    else -> ""
}
```

**Loops**
1. Kotlin has all the common ones like for, while and do-while.
2. The for loop in Kotlin is slightly different than in Java/Javascript.

for loop in Java:
```java
for (int i = 0; i < 10; i++) {
	// do something
```
for loop in Kotlin:
```kotlin
for (i in 0..10) {
	// do something
}
```

**Ranges**
1. There are various sets to define a range in Kotlin.
2. You can also iterate over char ranges i.e. a-z.
```kotlin
(i in 0..10)        -> "Iterate from 0 to 10(inclusive) with increment of 1"
(i in 0 until 10)   -> "Iterate from 0 to 10(exclusive) with increment of 1"
(i in 2..10 step 2) -> "Iterate from 2 to 10(inclusive) with increment of 2"
(i in 3 downTo 0)   -> "Iterate in reverse order from 3 to 0"
(c in 'a'..'f')     -> "Iterate from a to f"
```

