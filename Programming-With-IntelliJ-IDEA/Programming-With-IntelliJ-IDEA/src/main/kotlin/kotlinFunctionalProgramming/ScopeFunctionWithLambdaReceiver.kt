package kotlinFunctionalProgramming

fun main() {

    // run
    val textRun = "Hello"
    val resultRun = textRun.run {
        val from = this
        val to = this.replace("Hello", "Kotlin")
        "replace text from $from to $to"
    }
    println("result : $resultRun")

    // with
    /*val message = "Hello Kotlin!"
    val result = with(message) {
        println("value is $this")
        println("with length ${this.length}")
    }*/

    val messageWith = "Hello Kotlin!"
    val resultWith = with(messageWith) {
        "First character is ${this[0]}" +
                " and last character is ${this[this.length - 1]}"
    }
    println(resultWith)

    // apply
    val builder = StringBuilder()
    builder.append("Hello ")
    builder.append("Kotlin!")
    println(builder.toString())

    val messageApply = StringBuilder().apply {
        append("Hello ")
        append("Kotlin!")
    }
    println(messageApply.toString())
}