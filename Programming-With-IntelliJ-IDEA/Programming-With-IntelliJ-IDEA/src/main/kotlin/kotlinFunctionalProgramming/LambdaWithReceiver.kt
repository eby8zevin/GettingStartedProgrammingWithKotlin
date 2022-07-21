package kotlinFunctionalProgramming

fun main() {

    println(buildString())

    val message = buildString1 {
        append("Hello ")
        append("from ")
        append("lambda")
    }
    println(message)
}

fun buildString(): String {
    val stringBuilder = StringBuilder()
    stringBuilder.append("Hello ")
    stringBuilder.append("from ")
    stringBuilder.append("lambda")
    return stringBuilder.toString()
}

fun buildString1(action: StringBuilder.() -> Unit): String {
    val stringBuilder = StringBuilder()
    stringBuilder.action()
    return stringBuilder.toString()
}

// Gradle KTS & Jetpack Compose