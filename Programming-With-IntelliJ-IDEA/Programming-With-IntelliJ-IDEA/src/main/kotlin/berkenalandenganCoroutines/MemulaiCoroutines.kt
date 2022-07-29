package berkenalandenganCoroutines

import kotlinx.coroutines.*

fun main() = runBlocking {
    launch {
        delay(1000L)
        println("Coroutines!")
    }
    println("Hello,")
    delay(2000L)

    println("library repo = https://kotlin.github.io/kotlinx.coroutines/kotlinx-coroutines-core/kotlinx.coroutines/index.html")
    println("tutorial = https://kotlinlang.org/docs/reference/coroutines/coroutines-guide.html")
}