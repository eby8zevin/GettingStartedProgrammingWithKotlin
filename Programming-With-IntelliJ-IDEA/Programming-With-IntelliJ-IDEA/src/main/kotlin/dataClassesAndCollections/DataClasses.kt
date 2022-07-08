package dataClassesAndCollections

class User(val name: String, val age: Int) {

    override fun toString(): String {
        return "User(name=$name, age=$age)"
    }

    // manual
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as User

        if (name != other.name) return false
        if (age != other.age) return false

        return true
    }

    override fun hashCode(): Int {
        var result = name.hashCode()
        result = 31 * result + age
        return result
    }
}

data class DataUser(val name: String, val age: Int)

fun main() {

    // Penggunaan Data Class
    val user = User("nrohmen", 17)
    val dataUser = DataUser("nrohmen", 17)

    println(user)
    println(dataUser)

    // equals data class
    val dataUser1 = DataUser("nrohmen", 17) // object
    val dataUser2 = DataUser("nrohmen", 17)
    val dataUser3 = DataUser("dimas", 24)
    println(dataUser1.equals(dataUser2))
    println(dataUser1.equals(dataUser3))

    // equals NOT data class
    val user1 = User("nrohmen", 17) // object
    val user2 = User("nrohmen", 17)
    val user3 = User("dimas", 24)
    println(user1.equals(user2))
    println(user1.equals(user3))
}