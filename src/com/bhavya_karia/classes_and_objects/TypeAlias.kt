package com.bhavya_karia.classes_and_objects

/**
 * @author Bhavya Karia
 */

/**
 * type alias - allows us to create a new type that is simply an alias of an existing type.
 *
 */

// if we are gonna use the below hash map many times in the code then we can use type alias to simplify our code
typealias team = HashMap<String, String>

fun main() {

    // now you can use 'team' wherever you have to write 'HashMap<String, String>'
    val userList: team = hashMapOf("Man City" to "EPL", "Real Madrid" to "La Liga", "Juventus" to "Serie A")

    processData(userList)
}

fun processData(userList: team) {
    // do whatever you want...
}
