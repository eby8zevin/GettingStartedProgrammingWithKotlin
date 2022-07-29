package berkenalandenganCoroutines

import kotlinx.coroutines.*

/*
Dispatcher.Default
launch {
    // TODO: Implement suspending lambda here
}
launch(Dispatcher.Default){
    // TODO: Implement suspending lambda here
}

Dispatcher.IO
launch(Dispatcher.IO){
    // TODO: Implement algorithm here
}

Dispatcher.Unconfined

*/

fun mainUn() = runBlocking<Unit> {
    launch(Dispatchers.Unconfined) {
        println("Starting in ${Thread.currentThread().name}")
        delay(1000)
        println("Resuming in ${Thread.currentThread().name}")
    }.start()
}

// Single Thread Context
fun mainSTC() = runBlocking<Unit> {
    val dispatcher = newSingleThreadContext("myThread")
    launch(dispatcher) {
        println("Starting in ${Thread.currentThread().name}")
        delay(1000)
        println("Resuming in ${Thread.currentThread().name}")
    }.start()
}

// Thread Pool
fun main() = runBlocking<Unit> {
    val dispatcher = newFixedThreadPoolContext(3, "myPool")

    launch(dispatcher) {
        println("Starting in ${Thread.currentThread().name}")
        delay(1000)
        println("Resuming in ${Thread.currentThread().name}")
    }.start()
}