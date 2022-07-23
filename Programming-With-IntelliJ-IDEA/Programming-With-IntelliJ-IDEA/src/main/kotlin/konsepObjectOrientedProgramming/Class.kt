package konsepObjectOrientedProgramming

fun main() {

    println("|       Animal       |")
    println("|____________________|")
    println(
        """
        |+ name: String      |
        |+ weight: Double    |
        |+ age: Int          |
        |+ isMammal: Boolean |
    """.trimIndent()
    )
    println("|____________________|")
    println(
        """
        |- eat()             |
        |- sleep()           |
    """.trimIndent()
    )
    println("|____________________|")
    println(
        """
        + properties (attributes)
        - functions (behaviour)
    """.trimIndent()
    )
    /*
    Class: Merupakan sebuah blueprint yang terdapat properti dan fungsi di dalamnya
    Properties: Karakteristik dari sebuah kelas, memiliki tipe data.
    Functions: Kemampuan atau aksi dari sebuah kelas.
     */
}