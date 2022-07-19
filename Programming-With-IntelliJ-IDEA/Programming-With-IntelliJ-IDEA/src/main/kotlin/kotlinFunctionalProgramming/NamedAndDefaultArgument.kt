package kotlinFunctionalProgramming

fun main() {

    // Named Argument
    val fullName = getFullName(first = "Kotlin", middle = " is ", last = "Awesome")
    println(fullName)

    val fullName1 = getFullName(middle = " is ", first = "Kotlin", last = "Awesome")
    println(fullName1)

    // Default Argument
    val fullName2 = getFullName1()
    println(fullName2)

    val fullName3 = getFullName1(first = "Dicoding")
    println(fullName3)
}

fun getFullName(first: String, middle: String, last: String): String {
    return "$first $middle $last"
}

fun getFullName1(
    first: String = "Kotlin",
    middle: String = " is ",
    last: String = "Awesome"
): String {
    return "$first $middle $last"
}