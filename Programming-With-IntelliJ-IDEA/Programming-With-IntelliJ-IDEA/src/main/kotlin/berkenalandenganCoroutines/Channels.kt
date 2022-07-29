package berkenalandenganCoroutines

import kotlinx.coroutines.*
import kotlinx.coroutines.channels.Channel

// Channels adalah nilai deferred yang menyediakan cara mudah untuk mentransfer nilai tunggal antara coroutine.
fun main() = runBlocking(CoroutineName("main")) {
    val channel = Channel<Int>()
    launch(CoroutineName("v1coroutine")) {
        println("Sending from ${Thread.currentThread().name}")
        for (x in 1..5) channel.send(x * x)
    }

    repeat(5) { println(channel.receive()) }
    println("received in ${Thread.currentThread().name}")
    // channels memungkinkan komunikasi yang aman antar kode concurrent.
    // Learn more = https://kotlinlang.org/docs/reference/coroutines/channels.html
}