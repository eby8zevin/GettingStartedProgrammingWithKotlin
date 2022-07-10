package dataClassesAndCollections

fun main() {

    val dataUser = DataUser("nrohmen", 17)
    val dataUser2 = DataUser("nrohmen", 17)
    val dataUser3 = DataUser("dimas", 17)
    val dataUser4 = dataUser.copy()
    println(dataUser4)

    val dataUser5 = dataUser.copy(age = 18)
    println(dataUser5)
}