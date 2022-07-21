package kotlinFunctionalProgramming

fun main() {

    println("${factorial(10)}")

    println("Factorial 9999 is: ${factorial1(9999)}")

    println(factorial2(20))

    println(factorial3(30))
}

fun factorial(n: Int): Int {
    return if (n == 1) {
        n
    } else {
        var result = 1
        for (i in 1..n) {
            result *= i
        }
        result
    }
}

fun factorial1(n: Int): Int {
    return if (n == 1) {
        n
    } else {
        n * factorial1(n - 1)
    }
}

// tail recursion
fun factorial2(n: Int, result: Int = 1): Int {
    val newResult = n * result
    return if (n == 1) {
        newResult
    } else {
        factorial2(n - 1, newResult)
    }
}

tailrec fun factorial3(n: Int, result: Int = 1): Int { // can't be used block try-catch-finally
    val newResult = n * result
    return if (n == 1) {
        newResult
    } else {
        factorial3(n - 1, newResult)
    }
}