package konsepObjectOrientedProgramming

class AnimalSC(name: String, weight: Double, age: Int) {
    val name: String
    val weight: Double
    val age: Int
    var isMammal: Boolean

    init {
        this.weight = if (weight < 0) 0.1 else weight
        this.age = if (age < 0) 0 else age
        this.name = name
        this.isMammal = false
    }

    constructor(name: String, weight: Double, age: Int, isMammal: Boolean) : this(name, weight, age) {
        this.isMammal = isMammal
    }
}

// Default Constructor
class AnimalDC {
    val name: String = "Dicoding Miaw"
    val weight: Double = 4.2
    val age: Int = 2
    val isMammal: Boolean = true
}

fun main() {

    val dicodingCat = AnimalSC("Dicoding Miaw", 2.5, 2, true)
    println("Nama: ${dicodingCat.name}, Berat: ${dicodingCat.weight}, Umur: ${dicodingCat.age}, mamalia: ${dicodingCat.isMammal}")

    val dicodingBird = AnimalSC("Dicoding tweet", 0.5, 1)
    println("Nama: ${dicodingBird.name}, Berat: ${dicodingBird.weight}, Umur: ${dicodingBird.age}, mamalia: ${dicodingBird.isMammal}")

    val dicodingCatDC = AnimalDC()
    println("Nama: ${dicodingCatDC.name}, Berat: ${dicodingCatDC.weight}, Umur: ${dicodingCatDC.age}, mamalia: ${dicodingCatDC.isMammal}")
}