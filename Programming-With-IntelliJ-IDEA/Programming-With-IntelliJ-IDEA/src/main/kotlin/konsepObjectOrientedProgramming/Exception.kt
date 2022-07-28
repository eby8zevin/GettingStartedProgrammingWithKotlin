package konsepObjectOrientedProgramming

/*
Unchecked Exception

- ArithmeticException
- NumberFormatException
- NullPointerException
*/

fun main() {

    val someValue = 6
    //println(someValue / 0)
    // Exception in thread "main" java.lang.ArithmeticException: / by zero

    val someStringValue = "18.0"
    //println(someStringValue.toInt())
    // Exception in thread "main" java.lang.NumberFormatException: For input string: "18.0"

    val someNullValue: String? = null
    val someMstNotNullValue: String = someNullValue!!
    println(someMstNotNullValue)
    // Exception in thread "main" kotlin.NullPointerException at MainKt.main(Main.kt:22)
}