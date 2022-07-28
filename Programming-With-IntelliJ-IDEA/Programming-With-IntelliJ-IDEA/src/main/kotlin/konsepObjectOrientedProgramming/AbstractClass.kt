package konsepObjectOrientedProgramming

// abstract = General from class
abstract class AnimalAC(var name: String, var weight: Double, var age: Int, var isCarnivore: Boolean) {

    fun eat() {
        println("$name sedang makan !")
    }

    fun sleep() {
        println("$name sedang tidur !")
    }
}

fun main() {

    //val animal = AnimalAC("dicoding animal", 2.6, 1, true)
    // Cannot create an instance of an abstract class
}