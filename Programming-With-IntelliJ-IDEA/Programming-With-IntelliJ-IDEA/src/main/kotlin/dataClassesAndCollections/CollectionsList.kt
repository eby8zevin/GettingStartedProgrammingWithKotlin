package dataClassesAndCollections

fun main() {

    val numberList: List<Int> = listOf(1, 2, 3, 4, 5)
    println(numberList)

    val numberList1 = listOf(1, 2, 3, 4, 5)
    println(numberList1)
    val charList = listOf('a', 'b', 'c')
    println(charList)

    val anyList = listOf('a', "Kotlin", 3, true) // List<Any>
    println(anyList)

    val anyList1 = listOf('a', "Kotlin", 3, true, user("Hello, World!"))
    println(anyList1[3]) // indexing
    //println(anyList1[5]) // error

    val anyList2 = mutableListOf('a', "Kotlin", 3, true, user("X immutable"))
    anyList2.add('d') // add item at end of list
    anyList2.add(1, "love") // add item at index 1
    anyList2[3] = false // change item value at 3rd index
    anyList2.removeAt(1) // remove User() item based on index or value position in Array
    println(anyList2)
}

fun user(a: String): String {
    return a
}