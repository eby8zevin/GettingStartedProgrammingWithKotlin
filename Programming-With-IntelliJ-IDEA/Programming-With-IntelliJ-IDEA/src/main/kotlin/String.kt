fun main() {

    // val textString = "Kotlin"
    val text = "Kotlin"
    val firstChar = text[0]
    print("First character of $text is $firstChar")

    println()

    // indexing
    for (char in text) {
        print("$char ")
    }

    println()

    // Literal String: 1.Escaped String & 2.Raw String
    /*
    Escaped String
    val statement= "Kotlin is Awesome!"
    val statement = "Kotlin is "Awesome!""

    \t: menambah tab ke dalam teks.
    \n: membuat baris baru di dalam teks.
    \’: menambah karakter single quote kedalam teks.
    \”: menambah karakter double quote kedalam teks.
    \\: menambah karakter backslash kedalam teks.
    */
    val statement = "Kotlin is \"Awesome!\""
    println(statement)

    // Unicode
    val name = "Unicode test: \u00A9"
    print(name)

    println()

    // Raw String
    val lineEscaped = "Line 1 \n" + "Line 2 \n" + "Line 3 \n" + "Line 4 \n" // escaped
    println(lineEscaped)

    val lineRaw = """
        Line 1
        Line 2
        Line 3
        Line 4
    """.trimIndent()
    print(lineRaw)
}