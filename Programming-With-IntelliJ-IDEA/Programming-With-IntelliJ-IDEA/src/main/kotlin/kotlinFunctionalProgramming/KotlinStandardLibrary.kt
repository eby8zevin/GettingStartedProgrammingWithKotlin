package kotlinFunctionalProgramming

// Scope Function
fun main() {

    println(buildString)

    // lambda argument (it) = let, also
    val text = "Hello"
    text.let {
        val message = "$it Kotlin"
        println(message)
    }

    // can change (it)
    val textChange = "Hello"
    textChange.let { value ->
        val message = "$value Kotlin"
        println(message)
    }
}

// lambda receiver (this) = run, with, apply
val buildString = StringBuilder().apply {
    append("Hello ")
    append("Kotlin ")
}