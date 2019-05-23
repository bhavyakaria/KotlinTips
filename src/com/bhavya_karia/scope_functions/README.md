# Scope Functions

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

