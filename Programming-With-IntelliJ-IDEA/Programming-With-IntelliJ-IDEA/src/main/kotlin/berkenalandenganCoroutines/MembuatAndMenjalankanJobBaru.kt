package berkenalandenganCoroutines

import kotlinx.coroutines.*

// menggunakan launch():
fun mainLaunch() = runBlocking {
    val job = launch {
        // Do background task here
    }
}

// menggunakan Job():
fun mainJob() = runBlocking {
    val job = Job()
}

// tanpa langsung menjalankannya
fun main() = runBlocking {
    val job = launch(start = CoroutineStart.LAZY) {
        delay(1000L)
        println("Start new job!")
    }

    job.start() // akan memulai job tanpa harus menunggu job tersebut selesai
    println("Other task")

    job.join() // akan menunda eksekusi sampai job selesai
    println("Other task")
    // state Active
}