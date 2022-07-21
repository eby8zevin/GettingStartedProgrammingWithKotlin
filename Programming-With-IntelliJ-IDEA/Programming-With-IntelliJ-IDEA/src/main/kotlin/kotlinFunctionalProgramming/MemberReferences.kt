package kotlinFunctionalProgramming

var message1 = "Kotlin"
val message2 = "Kotlin"

fun main() {

    val numbers = 1.rangeTo(10)
    val evenNumbers = numbers.filter(::isEvenNumber)
    println(evenNumbers)

    val evenNumber = numbers.filter(Int::isEvenNumberRef)
    println(evenNumber)


    // Property References
    println(::message1.name)
    println(::message1.get())
    ::message1.set("Kotlin Academy")
    println(::message1.get())
    // KMMutableProperty = https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.reflect/-k-mutable-property/index.html
    println()
    // immutable, KProperty = https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.reflect/-k-property/index.html
    println(::message2.name)
    println(::message2.get())
    //::message2.set("Kotlin Academy") // <- Error : Unresolved reference
    println(::message2.get())
}

/*lambda using function type
val sum: (Int, Int) -> Int = { valueA, valueB -> valueA + valueB }*/

/*separate lambda expression into func alone & refer instance from func type
val sum: (Int, Int) -> Int = ::count
fun count(valueA: Int, valueB: Int): Int {
    return valueA + valueB
}
mechanism Reflection*/

// Function References
fun isEvenNumber(number: Int) = number % 2 == 0

// refer extensions function
fun Int.isEvenNumberRef() = this % 2 == 0