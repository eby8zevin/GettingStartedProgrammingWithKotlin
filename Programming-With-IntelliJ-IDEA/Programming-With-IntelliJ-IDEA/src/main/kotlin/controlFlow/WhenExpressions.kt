package controlFlow

import kotlin.random.Random

fun main() {

    val value = 7
    when (value) {
        6 -> println("value is 6")
        7 -> println("value is 7")
        8 -> println("value is 8")
    }

    val value1 = 20
    when (value1) {
        6 -> println("value is 6")
        7 -> println("value is 7")
        8 -> println("value is 8")
        else -> println("value cannot be reached")
    }

    // when expression
    val value2 = 7
    val stringOfValue = when (value2) {
        6 -> "value is 6"
        7 -> "value is 7"
        8 -> "value is 8"
        else -> "value cannot be reached"
    }
    println(stringOfValue)

    val stringOfValue1 = when (value2) {
        6 -> {
            println("Six")
            "value is 6"
        }
        7 -> {
            println("Seven")
            "value is 7"
        }
        8 -> {
            println("Eight")
            "value is 8"
        }
        else -> {
            println("undefined")
            "value cannot be reached"
        }
    }
    println(stringOfValue1)

    val anyType: Any = 100L
    when (anyType) {
        is Long -> println("the value has a Long type")
        is String -> println("the value has a String type")
        else -> println("undefined")
    }

    // Range or Collection
    val value3 = 27
    val ranges = 10..50
    when (value3) {
        in ranges -> println("value is in the range")
        !in ranges -> println("value is outside the range")
        else -> println("value undefined")
    }

    // kotlin 1.3, catch the subject of when expression
    val registerNumber = when (val regis = getRegisterNumber()) {
        in 1..50 -> 50 * regis
        in 51..100 -> 100 * regis
        else -> regis
    }

    // if expression = no more than 2 and not too complicated
    val anyTypeIf: Any = 100L
    if (anyTypeIf is Long) {
        println("the value has a Long type")
    } else {
        println("the value is not Long type")
    }

    // when expression  = more than 2
    val anyTypeWhen: Any = 100L
    when (anyTypeWhen) {
        is Long -> println("the value has a Long type")
        is Int -> println("the value has a Int type")
        is Double -> println("the value has a Double type")
        else -> println("undefined")
    }
}

fun getRegisterNumber() = Random.nextInt(100)