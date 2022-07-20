package kotlinFunctionalProgramming

fun main() {

    val sumResult = sum.invoke(10, 10) // val sumResult = sum(10, 10)
    val multiplyResult = multiply.invoke(20, 20) // val multiplyResult = multiply(20, 20)
    println("$sumResult\n$multiplyResult")

    val sumNull = sumNull?.invoke(10, 20)
    println(sumNull)
}

// (Int, Int) -> String // return unit
typealias Arithmetic = (Int, Int) -> Int // function type a long

val sum: Arithmetic = { valueA, valueB -> valueA + valueB }

val multiply: Arithmetic = { valueA, valueB -> valueA * valueB }

// Nullable
typealias ArithmeticNull = ((Int, Int) -> Int)?

val sumNull: ArithmeticNull = { valueA, valueB -> valueA + valueB }