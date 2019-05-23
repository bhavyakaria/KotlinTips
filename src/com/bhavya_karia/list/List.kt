package com.bhavya_karia.list

/**
 * @author Bhavya Karia
 */

fun main() {

    // sample list of first names and last names of got characters
    val firstName = listOf("Arya", "Jamie", "Jorah")
    val lastName = listOf("Stark", "Lannister", "Mormont")
    val seasonsList = listOf(1, 2, 3, 4, 5, 6, 7, 8)

    // get last name from firstName
    println(firstName.last())

    // print list in reverse order
    println(firstName.asReversed())

    // get value if present or null from list
    println(seasonsList.getOrNull(6))
    println(seasonsList.getOrNull(10))

    // get max value
    println(seasonsList.max())

    // concatenate firstNames and lastNames
    println(firstName + lastName)

    // concatenate two list in pairs of (firstName, lastName)
    println(firstName.zip(lastName))

    // have a list containing two list
    println(listOf(firstName, lastName))

    // concatenate two list without any duplicates
    val surnames = listOf("Lannister", "Stark", "Martell", "Targaryen", "Tully")
    println(lastName.union(surnames))

    // remove duplicates from the list
    val listWithDuplicates = listOf("Lannister", "Stark", "Stark", "Tully", "Tully")
    println(listWithDuplicates.distinct())

    // convert immutable list to mutable list
    val mutableLastNames = lastName.toMutableList()
    mutableLastNames.add("Tully")
    println(mutableLastNames)


}