fun main() {

    val name = "Kotlin"
    println("My name is " + name)

    val name1 = "Kotlin"
    println("My name is $name1")

    val name2 = "Kotlin"
    val old = 3
    println("My name is $name2, im $old years old")

    val hour = 7
    println("Office ${if (hour > 7) "already close" else "is open"}")
}