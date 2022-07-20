package kotlinFunctionalProgramming

fun main() {

    printResult(10, sumPlus)

    printResult1(10) { value ->
        value + value
    }
}

fun printResult(value: Int, sum: (Int) -> Int) {
    val result = sum(value)
    println(result)
}

var sumPlus: (Int) -> Int = { value -> value + value }

fun printResult1(value: Int, sum: (Int) -> Int) {
    val result = sum(value)
    println(result)
}