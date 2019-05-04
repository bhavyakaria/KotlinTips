package access_modifiers

/**
 * Four access modifiers:
 * 1. public
 * 2. private
 * 3. protected
 * 4. internal
 *
 * By default the classes are public unlike Java where they are package private
 *
 */

fun main() {
    val emp = Employee()
    println(emp.str)
}

// Unlike Java, classes can be private in Kotlin and only items in that file can access them
private class Employee {
    val str = "Its in employee class"
}

// In Kotlin, classes can't see private members in inner classes
// The jvm converts internal to public on compile time