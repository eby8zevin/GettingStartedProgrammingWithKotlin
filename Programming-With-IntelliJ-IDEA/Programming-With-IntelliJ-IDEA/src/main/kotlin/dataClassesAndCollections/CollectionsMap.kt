package dataClassesAndCollections

fun main() {

    // key-value
    val capital = mapOf(
        "Jakarta" to "Indonesia",
        "London" to "England",
        "New Delhi" to "India"
    )
    println(capital["Jakarta"])
    println(capital.getValue("Jakarta"))

    println(capital["Amsterdam"])
    //println(capital.getValue("Amsterdam")) // error

    val mapKeys = capital.keys
    println(mapKeys)

    val mapValues = capital.values
    println(mapValues)

    // add key-value | change to Mutable
    val mutableCapital = capital.toMutableMap()
    mutableCapital.put("Amsterdam", "Netherlands")
    mutableCapital.put("Berlin", "Germany")
    println(mutableCapital)
    // mutable collection NOT Recommended
}