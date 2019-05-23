/**
 * @author  Bhavya Karia
 */

fun main() {
    println("Hello World")

    val numbers = intArrayOf(1, 2, 3)
    val names = sumNumbers(*numbers)
    println(names)
}

fun sumNumbers(vararg numbers: Int): Int {
    return numbers.sum()
}