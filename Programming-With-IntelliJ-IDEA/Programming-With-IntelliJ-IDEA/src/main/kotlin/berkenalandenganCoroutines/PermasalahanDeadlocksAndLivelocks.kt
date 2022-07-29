package berkenalandenganCoroutines

/*
deadlocks
livelocks
starvation
race conditions
*/

fun main() {

    println(
        "Deadlocks \n" +
                "sebuah kondisi di mana dua proses atau lebih saling menunggu proses yang lain untuk melepaskan resource yang sedang digunakan. \n" +
                "The illustration above depicts a queue of two cars that are both about to cross a bridge."
    )

    println(
        "Livelocks \n" +
                "selama livelocks terjadi, keadaan dari aplikasi tetap bisa berubah. Walaupun perubahan keadaan tersebut menyebabkan proses berjalan dengan tidak semestinya. \n"
    )

    println("Livelocks can occur when some processes can react when experiencing deadlocks. The process tries to get out of the deadlock situation, but the timing is not right, blocking it.")
}