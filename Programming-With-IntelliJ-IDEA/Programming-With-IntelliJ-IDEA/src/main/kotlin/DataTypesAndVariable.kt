fun main() {

    /*
    var identifier: Type = initialization
    var = mutable(Read and Write) & val = immutable(Read only)

    val company: String = "Dicoding"
    company = "Dicoding Academy" //Val cannot be reassigned
    */

    var company: String = "Dicoding"
    println(company)
    company = "Dicoding Academy"
    println(company)

    val firstWord = "Dicoding "
    val lastWord = "Academy"
    print(firstWord + lastWord)

    println()

    val valueA: Int = 10
    val valueB = 20 // type inference
    print(valueA + valueB)
}