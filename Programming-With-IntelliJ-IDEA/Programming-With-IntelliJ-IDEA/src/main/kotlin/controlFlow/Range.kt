package controlFlow

fun main() {

    val rangeInt = 1..10
    println(rangeInt.step)

    val rangeInt1 = 1..10 step 2
    rangeInt1.forEach {
        print("$it ")
    }
    println(rangeInt1.step)

    val rangeInt2 = 1.rangeTo(10)
    val downInt = 10.downTo(1)

    val tenToOne = 10.downTo(1)
    if (7 in tenToOne) {
        println("Value 7 available")
    }

    // expression if
    if (1 <= 7 && 7 <= 10) {
        println("Value 7 available")
    }

    if (11 !in tenToOne) {
        println("No value 11 in range")
    }

    // intRange, longRange, charRange
    val rangeChar = 'A'.rangeTo('F')
    println(rangeChar)
}