package berkenalandenganCoroutines

import kotlinx.coroutines.*
import kotlin.system.measureTimeMillis

suspend fun getCapital(): Int {
    delay(1000L)
    return 50000
}

suspend fun getIncome(): Int {
    delay(1000L)
    return 75000
}

fun main() = runBlocking {
    // sequential
    val capital = getCapital()
    val income = getIncome()
    println("Your profit is ${income - capital}")
    println()

    val capitalA = async { getCapital() }
    val incomeA = async { getIncome() }
    println("Your profit is ${incomeA.await() - capitalA.await()}")
    println()

    val timeOne = measureTimeMillis {
        val capitalTest = getCapital()
        val incomeTest = getIncome()
        println("Your profit is ${incomeTest - capitalTest}")
    }

    val timeTwo = measureTimeMillis {
        val capitalAwait = async { getCapital() }
        val incomeAwait = async { getIncome() }
        println("Your profit is ${incomeAwait.await() - capitalAwait.await()}")
    }

    println("Completed in $timeOne ms vs $timeTwo ms")
}