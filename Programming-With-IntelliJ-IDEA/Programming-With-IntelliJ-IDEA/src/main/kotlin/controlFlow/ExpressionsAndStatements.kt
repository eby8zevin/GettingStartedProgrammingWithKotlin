package controlFlow

fun main() {

    // if statement
    val openOffice = 7
    val now = 8
    if (now > openOffice)
        print("Office already open")
    else
        print("Office close")

    println()

    // if expression
    val office = if (now > openOffice) "Office already open" else "Office close"
    print(office)

    println()

    // expression in expression
    sum(1, 1 * 4)

    // variable declaration is statement
    val valueA = 10
    val valueB = 10
    // function call is expression
    sum1(valueA, valueB)
}

fun sum(value1: Int, value2: Int) = value1 + value2

fun sum1(valueA: Int, valueB: Int) = valueA + valueB