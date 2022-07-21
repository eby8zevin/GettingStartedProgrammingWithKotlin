package kotlinFunctionalProgramming

fun main() {

    setWord("inner function")

    setWordSimple("simple inner function")

    println(sum(1, 2, 3))

    println(sumInner(4, 5, 6))

    println(sumExt(7, 8, 9))
}

// inner function
fun setWord(message: String) {
    fun printMessage(text: String) {
        println(text)
    }
    printMessage(message)
}

fun setWordSimple(message: String) {
    fun printMessage() {
        println(message)
    }
    printMessage()
}

fun sum(valueA: Int, valueB: Int, valueC: Int): Int {
    if (valueA == 0) {
        throw java.lang.IllegalArgumentException("valueA must be better than 0")
    }

    if (valueB == 0) {
        throw IllegalArgumentException("valueB must be better than 0")
    }

    if (valueC == 0) {
        throw java.lang.IllegalArgumentException("valueC must be better than 0")
    }

    return valueA + valueB + valueC
}

fun sumInner(valueA: Int, valueB: Int, valueC: Int): Int {
    fun validateNumber(value: Int) {
        if (value == 0) {
            throw java.lang.IllegalArgumentException("value must be better than 0")
        }
    }

    validateNumber(valueA)
    validateNumber(valueB)
    validateNumber(valueC)

    return valueA + valueB + valueC
}

// inner func as extensions func
fun sumExt(valueA: Int, valueB: Int, valueC: Int): Int {
    fun Int.validateNumber() {
        if (this == 0) {
            throw IllegalArgumentException("value must be better than 0")
        }
    }

    valueA.validateNumber()
    valueB.validateNumber()
    valueC.validateNumber()

    return valueA + valueB + valueC
}