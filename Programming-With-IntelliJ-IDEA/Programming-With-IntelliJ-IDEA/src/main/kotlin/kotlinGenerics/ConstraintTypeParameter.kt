package kotlinGenerics

fun main() {

    val numbers = ListNumber<Long>()
    val numbers2 = ListNumber<Int>()
    val numbers3 = ListNumber<String>() // error : Type argument is not within its bounds

    val numbers4 = listOf(1, 2, 3, 4, 5)
    numbers4.sumNumber()
    val names = listOf("dicoding", "academy")
    names.sumNumber() // error : inferred type String is not a subtype of Number
}

class ListNumber<T : Number> : List<T> {
    override fun get(index: Int): T {
        /* .. */
    }
}

// Another example
fun <T : Number> List<T>.sumNumber(): T {
    /* .. */
}