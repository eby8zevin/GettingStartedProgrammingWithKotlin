package kotlinFunctionalProgramming

fun main() {

    val value: Int? = null
    println(value.slice)

    val value1: Int? = null
    println(value1.slice1)

    val value11: Int? = null
    val value22: Int? = null

    println(value11?.slice11)
    println(value22?.slice11)
}

val Int?.slice: Int get() = if (this == null) 0 else this.div(2)

val Int?.slice1: Int get() = this?.div(2) ?: 0

val Int.slice11: Int get() = this.div(2)