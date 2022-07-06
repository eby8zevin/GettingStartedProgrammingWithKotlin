package controlFlow

fun main() {

    /*
    val colorRed = 0xFF0000
    val colorGreen = 0x00FF00
    val colorBlue = 0x0000FF
     */

    val colorRed = Color.RED
    val colorGreen = Color.GREEN
    val colorBlue = Color.BLUE

    val color1: Color1 = Color1.RED
    println(color1)

    val colors: Array<Color1> = Color1.values() // get list object
    colors.forEach { color ->
        println("$color ")
    }

    val color2: Color = Color.valueOf("RED") // get name from object
    println("Color is $color2")
    println("Color value is ${color2.value.toString(16)}")

    val colors1: Array<Color> = enumValues()
    colors1.forEach { color ->
        println(color)
    }

    val color3: Color = enumValueOf("RED")
    println("Color is $color3")

    val color4: Color = Color.GREEN
    println("Position GREEN is ${color4.ordinal}")
    when (color4) {
        Color.RED -> print("Color is Red")
        Color.GREEN -> print("Color is Green")
        Color.BLUE -> print("Color is Blue")
    }
}

enum class Color(val value: Int) {
    RED(0xFF0000),
    GREEN(0x00FF00),
    BLUE(0x0000FF)
}

enum class Color1 {
    RED, GREEN, BLUE
}

// anonymous class //synthetic method
enum class Color2(val value: Int) {
    RED(0xFF0000) {
        override fun printValue() {
            println("value of RED is $value")
        }
    },
    GREEN(0x00FF00) {
        override fun printValue() {
            println("value of GREEN is $value")
        }
    },
    BLUE(0x0000FF) {
        override fun printValue() {
            println("value of BLUE is $value")
        }
    };

    abstract fun printValue()
}