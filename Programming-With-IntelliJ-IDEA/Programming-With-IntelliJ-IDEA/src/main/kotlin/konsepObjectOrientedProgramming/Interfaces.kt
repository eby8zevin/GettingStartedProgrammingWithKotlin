package konsepObjectOrientedProgramming

interface IFly {
    fun fly()
    val numberOfWings: Int
}

class Bird(override val numberOfWings: Int) : IFly {
    override fun fly() {
        if (numberOfWings > 0) println("Flying with $numberOfWings wings")
        else println("I flying without wings")
    }
}

fun main() {

}