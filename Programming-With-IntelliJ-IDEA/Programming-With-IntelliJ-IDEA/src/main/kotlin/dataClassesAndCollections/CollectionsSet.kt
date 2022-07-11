package dataClassesAndCollections

fun main() {

    val integerSet = setOf(1, 2, 4, 2, 1, 5)
    println(integerSet)

    val setA = setOf(1, 2, 4, 2, 1, 5)
    val setB = setOf(1, 2, 4, 5)
    println(setA == setB)

    println(5 in setA)

    val setC = setOf(1, 5, 7)
    val union = setA.union(setC) // merger
    val intersect = setA.intersect(setC) // same value
    println(union)
    println(intersect)

    val mutableSet = mutableSetOf(1, 2, 4, 2, 1, 5)
    //mutableSet[2] = 6 // Can't Change
    mutableSet.add(6) // add items at the end of the set
    mutableSet.remove(1) // remove items that have a value of 1
    println(mutableSet)
}