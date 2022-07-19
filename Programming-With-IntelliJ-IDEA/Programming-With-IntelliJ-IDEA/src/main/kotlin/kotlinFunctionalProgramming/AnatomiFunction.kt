package kotlinFunctionalProgramming

fun main() {

    print("1 + 2 = ")
    println(sum(1, 2))
}

// private & public = visibility modifier
// fun sum = function Name
// (valueA: Int:, valueB: Int) = function Parameter (read-only)
// : Int = function return Type
private fun sum(valueA: Int, valueB: Int): Int { // function Header
    // another logic
    return valueA + valueB // function Body
}