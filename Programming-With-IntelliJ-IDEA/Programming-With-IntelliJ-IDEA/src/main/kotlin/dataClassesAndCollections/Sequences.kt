package dataClassesAndCollections

fun main() {

    val list = (1..1000000).toList()
    list.filter { it % 5 == 0 }.map { it * 2 }.forEach { println(it) } // eager evaluation

    list.asSequence().filter { it % 5 == 0 }.map { it * 2 }.forEach { println(it) } // lazy evaluation

    // object Sequence
    val sequenceNumber = generateSequence(1) { it + 1 }
    sequenceNumber.take(5).forEach { print("$it ") }
}