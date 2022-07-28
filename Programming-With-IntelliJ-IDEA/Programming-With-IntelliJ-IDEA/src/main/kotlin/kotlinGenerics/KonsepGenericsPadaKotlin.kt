package kotlinGenerics

fun main() {

    val contributorList = listOf<String>("jasoet", "alfian", "nrohmen", "dimas", "widy")
    println(contributorList)

    val contributorSimple = listOf("alfian", "nrohmen", "dimas", "widy")
    println(contributorSimple)

    val contributor = listOf<String>()
    println(contributor)

    val points = mapOf<String, Int>("alfian" to 10, "dimas" to 20)
    println(points)
}