package controlFlow

fun main() {

    // while = Entry Controlled Loop
    var counter = 1
    while (counter <= 7) {
        println("Hello, World!")
        counter++
    }

    var counter1 = 8
    while (counter1 <= 7) {
        println("Hello, World!")
        counter1++
    }

    println()
    // do while = Exit Controlled Loop
    var counter2 = 1
    do {
        println("Hello, World!")
        counter2++
    } while (counter2 <= 7)

    // infinite loop = condition always true
    var value = 'A'
    do {
        print(value)
    } while (value <= 'Z')

    // while & do while NOT Loop Number
}