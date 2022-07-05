fun main() {

    /*
    val text: String = null // compile time error
    val text: String? = null // ready to go
    */

    val text: String? = null
    //val textLength = text.length // compile time error
    if (text != null) {
        val textLength = text.length
    }
    print(text)
}