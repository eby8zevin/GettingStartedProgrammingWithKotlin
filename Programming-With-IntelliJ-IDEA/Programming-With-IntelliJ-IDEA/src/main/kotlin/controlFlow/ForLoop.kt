package controlFlow

fun main() {

    val ranges = 1..5
    for (i in ranges) {
        println("Value is $i!")
    }

    println()
    val ranges1 = 1.rangeTo(5)
    for (i in ranges1) {
        println("Value is $i!")
    }

    println()
    // range expression
    val ranges2 = 1.rangeTo(10) step 3
    for (i in ranges2) {
        println("Value is $i!")
    }

    println()
    for ((index, value) in ranges2.withIndex()) {
        println("value $value with index $index")
    }

    println()
    // forEach
    ranges2.forEach { value ->
        println("value is $value!")
    }

    println()
    // forEachIndexed
    ranges2.forEachIndexed { index, value ->
        println("value $value with index $index")
    }

    println()
    ranges2.forEachIndexed { index, _ ->
        println("index $index")
    }
}