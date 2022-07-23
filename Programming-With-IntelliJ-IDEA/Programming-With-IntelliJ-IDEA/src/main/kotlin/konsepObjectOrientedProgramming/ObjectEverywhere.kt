package konsepObjectOrientedProgramming

fun main() {

    val someString = "Dicoding"
    println(someString.reversed())
    println(someString.toUpperCase())
    println(someString.toLowerCase())

    val someString1 = "123"
    val someInt = someString1.toInt()
    val someOtherString = "12.34"
    val someDouble = someOtherString.toDouble()
    println(someInt is Int)
    println(someDouble is Double)
    // One of the uses of objects is to access various properties and functions of a class.
}