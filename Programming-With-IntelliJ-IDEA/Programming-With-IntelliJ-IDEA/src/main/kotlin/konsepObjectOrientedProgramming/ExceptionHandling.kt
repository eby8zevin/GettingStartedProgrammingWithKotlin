package konsepObjectOrientedProgramming

/*
Exception handling

- try-catch
- try-catch-finally
- multiple catch
*/

fun main() {

    /*try {
        // Block try, menyimpan kode yang membangkitkan exception
    } catch (e: SomeException) {
        // Block catch akan terpanggil ketika exception bangkit.
    }*/

    val someNullValue: String? = null
    lateinit var someMustNotNullValue: String
    try {
        someMustNotNullValue = someNullValue!!
        println(someMustNotNullValue)
    } catch (e: Exception) {
        someMustNotNullValue = "Nilai String Null"
        println(someMustNotNullValue)
    }

    val someNullValueFinally: String? = null
    lateinit var someMustNotNullValueFinally: String
    try {
        someMustNotNullValueFinally = someNullValueFinally!!
    } catch (e: Exception) {
        someMustNotNullValueFinally = "Nilai String Null"
    } finally {
        println(someMustNotNullValueFinally)
    }

    /*try{
        // Block try, menyimpan kode yang membangkitkan exception
    } catch (e: NullPointerException) {
        // Block catch akan terpanggil ketika terjadi NullPointerException.
    } catch (e: NumberFormatException) {
        // Block catch akan terpanggil ketika terjadi NumberFormatException.
    } catch (e: Exception) {
        // Block catch akan terpanggil ketika terjadi Exception selain keduanya.
    }
    finally {
        // Block finally akan terpanggil setelah keluar dari block try atau catch
    }*/

    val someStringValue: String? = null // "12.0" "12"
    var someIntValue: Int = 0
    try {
        someIntValue = someStringValue!!.toInt()
    } catch (e: NullPointerException) {
        someIntValue = 0
    } catch (e: NumberFormatException) {
        someIntValue = -1
    } finally {
        when (someIntValue) {
            0 -> println("Catch block NullPointerException terpanggil !")
            -1 -> println("Catch block NumberFormatException terpanggil !")
            else -> println(someIntValue)
        }
    }
}