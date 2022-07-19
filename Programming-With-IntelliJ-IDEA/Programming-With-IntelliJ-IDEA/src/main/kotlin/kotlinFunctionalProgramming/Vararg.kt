package kotlinFunctionalProgramming

fun main() {

    val number = sumNumbers(10, 20, 30, 40)
    println(number)

    val numberSize = getNumberSize(10, 20, 30, 40, 50)
    println(numberSize)

    // rule Variable Arguments
    println(sets("Kotlin", 10, 10))

    println(sets1(10, 10, name = "Kotlin")) // call using named argument

    // vararg vs array<T>
    val numberArray = arrayOf(10, 20, 30, 40)
    setsArray(numberArray)

    val numberVararg = intArrayOf(10, 20, 30, 40)
    println(setsVararg(10, 20, 20, *numberVararg, 10)) // spread operator
}

fun sumNumbers(vararg number: Int): Int {
    return number.sum()
}

fun getNumberSize(vararg number: Int): Int {
    return number.size
}

// fun a(vararg b: Int, vararg c:Int) = X

fun sets(name: String, vararg number: Int): Int {
    return number.random()
}

fun sets1(vararg number: Int, name: String): Int {
    return number.sum()
}

// Generic
fun <T> asList(vararg input: T): List<T> {
    val result = ArrayList<T>()
    for (item in input)
        result.add(item)
    return result
}

fun setsArray(number: Array<Int>) {

}

fun setsVararg(vararg number: Int): Int {
    return number.size
}