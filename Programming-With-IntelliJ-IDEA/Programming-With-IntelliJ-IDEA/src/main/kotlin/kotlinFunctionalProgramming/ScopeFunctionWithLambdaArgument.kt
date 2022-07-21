package kotlinFunctionalProgramming

fun main() {

    // let arg it (object non-null)
    val message: String? = null
    message?.let {
        val length = it.length * 2
        val text = "text length $length"
        println(text)
    }

    // -safe call
    val message1: String? = null
    val length = message1?.length ?: 0 * 2
    val text1 = "text length $length"
    println(text1)

    // object value null using run & elvis operator
    val messageNull: String? = null
    messageNull?.let {
        val length = it.length * 2
        val text = "text length $length"
        println(text)
    } ?: run {
        val text = "message is null"
        println(text)
    }

    // also
    val textAlso = "Hello Kotlin"
    val result = textAlso.also {
        println("value length -> ${it.length}")
    }
    println("text -> $result")
    //https://github.com/JetBrains/kotlin/blob/master/libraries/stdlib/src/kotlin/util/Standard.kt
}