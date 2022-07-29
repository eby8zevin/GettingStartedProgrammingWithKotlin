package berkenalandenganCoroutines

import kotlinx.coroutines.*

// Deferred adalah nilai tangguhan yang dihasilkan dari proses coroutines.
fun main() = runBlocking {
    val capital = async { getCapital() } // capital & income Value Deferred
    val income = async { getIncome() }
    println("Your profit is ${income.await() - capital.await()}")
    // exception if it has failed = getCompletionExceptionOrNull
}