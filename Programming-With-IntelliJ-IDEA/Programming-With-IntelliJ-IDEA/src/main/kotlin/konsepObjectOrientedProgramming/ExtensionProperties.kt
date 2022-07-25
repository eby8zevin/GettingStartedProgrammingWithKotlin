package konsepObjectOrientedProgramming

class AnimalExtension(var name: String, var weight: Double, var age: Int, var isMammal: Boolean)

val AnimalExtension.getAnimalInfo: String
    get() = "Nama: ${this.name}, Berat: ${this.weight}, Umur: ${this.age} Mamalia: ${this.isMammal}"

fun main() {

    val dicodingCat = AnimalExtension("Dicoding Miaw", 5.0, 2, true)
    println(dicodingCat.getAnimalInfo)
}