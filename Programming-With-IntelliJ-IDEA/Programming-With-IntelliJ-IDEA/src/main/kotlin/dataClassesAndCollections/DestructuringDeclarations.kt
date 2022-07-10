package dataClassesAndCollections

fun main() {

    // componentN()
    val dataUser = DataUser("nrohman", 17)
    val name = dataUser.component1()
    val age = dataUser.component2()
    println("My name is $name, I am $age years old")

    val dataUser1 = DataUser("nrohman", 17)
    val (name1, age1) = dataUser1
    println("My name is $name1, I am $age1 years old")

    // behaviour (function)
    val dataUser2 = DataUser2("nrohmen", 23)
    dataUser2.intro()
}

data class DataUser2(val name: String, val age: Int) {
    fun intro() {
        println("My name is $name, I am $age years old")
    }
}