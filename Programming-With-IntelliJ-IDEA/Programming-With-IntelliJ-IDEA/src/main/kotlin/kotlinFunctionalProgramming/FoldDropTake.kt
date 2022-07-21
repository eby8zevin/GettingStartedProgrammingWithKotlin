package kotlinFunctionalProgramming

fun main() {

    val numbers = listOf(1, 2, 3)
    val fold = numbers.fold(10) { current, item ->
        println("current $current")
        println("item $item")
        println()
        current + item
    }
    println("Fold result: $fold")

    val foldR = numbers.foldRight(10) { item, current ->
        println("current $current")
        println("item $item")
        println()
        item + current
    }
    println("Fold result: $foldR")

    val numberDrop = listOf(1, 2, 3, 4, 5, 6)
    val drop = numberDrop.drop(3)
    println(drop)
    val dropL = numberDrop.dropLast(3)
    println(dropL)

    val total = listOf(1, 2, 3, 4, 5, 6)
    val take = total.take(3)
    println(take)
    val takeL = total.takeLast(3)
    println(takeL)
}