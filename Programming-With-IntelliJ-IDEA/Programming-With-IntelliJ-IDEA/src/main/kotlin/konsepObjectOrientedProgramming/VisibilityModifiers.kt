package konsepObjectOrientedProgramming

class AnimalPublic(val name: String, val weight: Double, val age: Int, val isMammal: Boolean = true)

/*class AnimalPrivate(
    private val name: String,
    private val weight: Double,
    private val age: Int,
    private val isMammal: Boolean
)*/

class AnimalPrivate(
    private var name: String,
    private val weight: Double,
    private val age: Int,
    private val isMammal: Boolean = true
) {
    fun getName(): String {
        return name
    }

    fun setName(newName: String) {
        name = newName
    }
}

open class AnimalProtected(val name: String, protected val weight: Double)
class Cat(pName: String, pWeight: Double) : AnimalProtected(pName, pWeight)

internal class AnimalInternal(val name: String)

fun main() {

    val dicodingCatPublic = AnimalPublic("Dicoding Miaw", 2.5, 2)
    dicodingCatPublic.name
    dicodingCatPublic.weight
    dicodingCatPublic.age
    dicodingCatPublic.isMammal

    /*
    val dicodingCatPrivate = AnimalPrivate("Dicoding Miaw", 2.5, 2)
    println("Nama: ${dicodingCatPrivate.name}, Berat: ${dicodingCatPrivate.weight}, Umur: ${dicodingCatPrivate.age}, mamalia: ${dicodingCatPrivate.isMammal}")
    */

    val dicodingCatPrivate = AnimalPrivate("Dicoding Miaw", 2.5, 2)
    println(dicodingCatPrivate.getName())
    dicodingCatPrivate.setName("Gooose")
    println(dicodingCatPrivate.getName())

    val catProtected = Cat("Dicoding Miaw", 2.0)
    println("Nama Kucing: ${catProtected.name}")
    //println("Berat Kucing: ${cat.weight}") //Cannot access 'weight': it is protected in 'Cat'
}