fun main() {

    /*
    val intNumber = 100
    val longNumber: Long = 100 suffix L val longNumber = 100L
    val shortNumber: Short = 10
    val byteNumber = 0b11010010
    val doubleNumber: Double = 1.3 max 15-16
    val floatNumber: Float = 0.123456789f max 6-7
    */

    val maxInt = Int.MAX_VALUE
    val minInt = Int.MIN_VALUE

    println(maxInt)
    println(minInt)

    val numberOne = 1
    val numberTwo = 2
    println(numberOne + numberTwo)

    val number1: Int = 27
    val number2: Int = 10
    println(number1 / number2)

    println(5 + 4 * 4)

    println((5 + 4) * 4)

    val byteNumber: Byte = 10
    val intNumber: Int = byteNumber.toInt()
    println(intNumber)

    val stringNumber: String = "23"
    val intNumber1: Int = 3
    println(intNumber1 + stringNumber.toInt())

    val readableNumber = 1_000_000 // readable
    print(readableNumber)

    /*toByte(): Byte
    toShort(): Short
    toInt(): Int
    toLong(): Long
    toFloat(): Float
    toDouble(): Double
    toChar(): Char*/
}