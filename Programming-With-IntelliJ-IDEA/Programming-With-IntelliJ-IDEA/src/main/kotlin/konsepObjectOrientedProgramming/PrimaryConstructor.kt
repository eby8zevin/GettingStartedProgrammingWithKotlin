package konsepObjectOrientedProgramming

class AnimalPC(val name: String, val weight: Double, val age: Int, val isMammal: Boolean)

class AnimalPCDefault(var name: String, var weight: Double, var age: Int = 0, var isMammal: Boolean = true)

// Init block
class AnimalIB(pName: String, pWeight: Double, pAge: Int, pIsMammal: Boolean) {
    val name: String
    val weight: Double
    val age: Int
    val isMammal: Boolean

    init {
        weight = if (pWeight < 0) 0.1 else pWeight
        age = if (pAge < 0) 0 else pAge
        name = pName
        isMammal = pIsMammal
    }
}

// this
class AnimalT(name: String, weight: Double, age: Int, isMammal: Boolean) {
    val name: String
    val weight: Double
    val age: Int
    val isMammal: Boolean

    init {
        this.weight = if (weight < 0) 0.1 else weight
        this.age = if (age < 0) 0 else age
        this.name = name
        this.isMammal = isMammal
    }
}

fun main() {

    val dicodingCat = AnimalPC("Dicoding Miaw", 4.2, 2, true)
    println("Nama: ${dicodingCat.name}, Berat: ${dicodingCat.weight}, Umur: ${dicodingCat.age}, mamalia: ${dicodingCat.isMammal}")
    println()
    val dicodingCatDefault = AnimalPCDefault("Dicoding Miaw", 4.2)
    println("Nama: ${dicodingCatDefault.name}, Berat: ${dicodingCatDefault.weight}, Umur: ${dicodingCatDefault.age}, mamalia: ${dicodingCatDefault.isMammal}")
    println()
    val dicodingCatValue = AnimalPCDefault("Dicoding Miaw", 4.2, isMammal = true)
    println("Nama: ${dicodingCatValue.name}, Berat: ${dicodingCatValue.weight}, Umur: ${dicodingCatValue.age}, mamalia: ${dicodingCatValue.isMammal}")
    println()
    val dicodingCatIB = AnimalIB("Dicoding Miaw", 4.2, 2, true)
    println("Nama: ${dicodingCatIB.name}, Berat: ${dicodingCatIB.weight}, Umur: ${dicodingCatIB.age}, mamalia: ${dicodingCatIB.isMammal}")
    println()
    val dicodingCatT = AnimalT("Dicoding Miaw", 4.2, 2, true)
    println("Nama: ${dicodingCatT.name}, Berat: ${dicodingCatT.weight}, Umur: ${dicodingCatT.age}, mamalia: ${dicodingCatT.isMammal}")
}