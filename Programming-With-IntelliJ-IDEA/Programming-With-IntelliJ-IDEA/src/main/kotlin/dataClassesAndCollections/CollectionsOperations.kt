package dataClassesAndCollections

fun main() {

    val numberList = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    val evenList = numberList.filter { it % 2 == 0 }
    println(evenList)

    val notEvenList = numberList.filterNot { it % 2 == 0 }
    println(notEvenList)

    val multipliedBy5 = numberList.map { it * 5 }
    println(multipliedBy5)

    println(numberList.count())

    println(numberList.count { it % 3 == 0 })

    val firstOddNumber = numberList.find { it % 2 == 1 }
    val firstOrNullNumber = numberList.firstOrNull { it % 2 == 3 }
    println(firstOddNumber)
    println(firstOrNullNumber)

    val lastOrNullNumber = numberList.lastOrNull()
    println(lastOrNullNumber)

    val moreThan10 = numberList.first { it == 1 } // error it > 10
    println(moreThan10)

    val minusThan1 = numberList.last { it == 10 } // error it < 1
    println(minusThan1)

    val total = numberList.sum()
    println(total)

    val kotlinChar = listOf('k', 'o', 't', 'l', 'i', 'n')
    val ascendingSort = kotlinChar.sorted()
    println(ascendingSort)

    val descendingSort = kotlinChar.sortedDescending()
    println(descendingSort)
}