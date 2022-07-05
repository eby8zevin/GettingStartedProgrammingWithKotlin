fun main() {

    val array = arrayOf(1, 3, 5, 7)
    val mixArray = arrayOf(1, 3, 5, 7, "Dicoding", true)

    /*intArrayOf() : IntArray
    booleanArrayOf() : BooleanArray
    charArrayOf() : CharArray
    longArrayOf() : LongArray
    shortArrayOf() : ShortArray
    byteArrayOf() : ByteArray*/

    val intArray = intArrayOf(1, 3, 5, 7)

    val intArray1 = intArrayOf(1, 3, 5, 7)
    println(intArray1[2])

    val intArray2 = intArrayOf(1, 3, 5, 7)
    intArray2[2] = 11
    println(intArray2[2])

    val intArray3 = Array(4, { i -> i * i }) // [0, 1, 4, 9]
}