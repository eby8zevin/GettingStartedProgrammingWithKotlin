package kotlinFunctionalProgramming

fun main() {

    // Lambda expression (anonymous function / function literal) - functional programming

    message()
    printMessage("Hello From Lambda")

    val length = messageLength("Hello From Lambda")
    println("Message length $length")
}

val message = { println("Hello From Lambda") }

// parameter -> body
val printMessage = { message: String -> println(message) } // add parameter
val messageLength = { message: String -> message.length } // return

// anonymous class
val comparator = object : Runnable {
    override fun run() {
        // TODO:
    }
}

// lambda
val comparator1 = Runnable {
    // TODO:
}