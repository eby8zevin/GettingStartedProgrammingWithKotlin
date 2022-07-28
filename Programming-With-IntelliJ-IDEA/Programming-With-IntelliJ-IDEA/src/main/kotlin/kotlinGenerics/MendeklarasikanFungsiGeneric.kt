package kotlinGenerics

/*
fun <T> run(): T {
    /*...*/
}

public fun <T> List<T>.slice(indices: Iterable<Int>): List<T> {
    /*...*/
}
*/

fun main() {

    val numbers = (1..100).toList()
    println(numbers.slice<Int>(1..10)) // slice = receiver & return type

    val numbers1 = (1..100).toList()
    print(numbers1.slice(1..10))
}