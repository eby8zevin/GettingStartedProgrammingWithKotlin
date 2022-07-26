package konsepObjectOrientedProgramming

/*
Animal
+ name: String
+ weight: Double
+ age: Integer
+ isCarnivore: Boolean

- eat()
- sleep()

Cat | Fish | Snake
+ furColor: String | + scaleColor: String | + skinColor: String
+ numberOfFeet: Integer | + numberOfFin: Integer | + isToxic: Boolean

playWithHuman() | swim() | - bite()

class ChildClass : ParentClass {

}
*/

open class AnimalInheritance(val name: String, val weight: Double, val age: Int, val isCarnivore: Boolean) {

    open fun eat() {
        println("$name sedang makan!")
    }

    open fun sleep() {
        println("$name sedang tidur!")
    }
}

class CatInheritance(
    pName: String,
    pWeight: Double,
    pAge: Int,
    pIsCarnivore: Boolean,
    val furColor: String,
    val numberOfFeet: Int
) : AnimalInheritance(pName, pWeight, pAge, pIsCarnivore) {

    fun playWithHuman() {
        println("$name bermain bersama Manusia !")
    }

    override fun eat() {
        println("$name sedang memakan ikan !")
    }

    override fun sleep() {
        println("$name sedang tidur di bantal !")
    }
}

fun main() {

    val dicodingCat = CatInheritance("Dicoding Miaw", 3.2, 2, true, "Brown", 4)
    dicodingCat.playWithHuman()
    dicodingCat.eat()
    dicodingCat.sleep()
}