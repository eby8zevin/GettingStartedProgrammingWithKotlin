package kotlinFunctionalProgramming

fun main() {

    val total = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    val slice = total.slice(3..6)
    println(slice)

    val sliceS = total.slice(3..6 step 2)
    println(sliceS)

    val index = listOf(2, 3, 5, 8)
    val sliceSS = total.slice(index)
    println(sliceSS)
    // alert ArrayIndexOutOfBoundsException

    val tot = listOf(1, 2, 1, 3, 4, 5, 2, 3, 4, 5)
    val distinct = tot.distinct()
    println(distinct)

    val distinctItems = items.distinctBy { it.key }
    distinctItems.forEach {
        println("${it.key} with value ${it.value}")
    }

    val text = listOf("A", "B", "CC", "DD", "EEE", "F", "GGGG")
    val distinctT = text.distinctBy {
        it.length
    }
    println(distinctT)
    // distinct() can't be used object Map Collection

    val word = "QWERTY"
    val chunked = word.chunked(3)
    println(chunked)

    val chunkedTransform = word.chunked(3) {
        it.toString().toLowerCase()
    }
    println(chunkedTransform)
}

data class Item(val key: String, val value: Any)

val items = listOf(
    Item("1", "Kotlin"),
    Item("2", "is"),
    Item("3", "Awesome"),
    Item("3", "as"),
    Item("3", "Programming"),
    Item("3", "Language")
)