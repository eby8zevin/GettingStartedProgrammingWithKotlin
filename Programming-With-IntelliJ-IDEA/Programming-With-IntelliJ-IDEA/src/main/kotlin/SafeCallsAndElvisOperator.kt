fun main() {

    // safe calls (?.)
    val text: String? = null
    text?.length

    // elvis (?:)
    val text1: String? = null
    val textLength = text?.length ?: 7
    val textLength1 = if (text1 != null) text1.length else 7

    val text2: String? = null
    val textLength2 = text!!.length // ready to go ???
}