/*fun functionName(param1: Type1, param2: Type2, ...): ReturnType {
    return result
}*/

fun main() {

    val user = setUser("Alfian", 19) // 1
    println(user)

    printUser("Alfian") // 2

    val company = setCompany("Dicoding", 2015, 'g')
    println(company)
}

fun setUser(name: String, age: Int) = "Your name is $name, and you $age years old" // 1

fun printUser(name: String) { // 2
    println("Your name is $name")
}

fun setCompany(company: String, founded: Int, logo: Char): String {
    return "Best company $company, $founded, $logo"
}