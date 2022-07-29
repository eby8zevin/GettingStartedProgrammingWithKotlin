package berkenalandenganCoroutines

fun main() {

    println("Starvation")
    println(
        "usually occurs after a deadlock. \n" +
                "other thing: system error. \n" +
                "error: scheduling algorithm, resource leak. \n" +
                "Solution: scheduling algorithm with (process priority), technic aging."
    )

    println()

    println("Race Conditions")
    println(
        "kondisi di mana terdapat banyak thread yang mengakses data yang dibagikan bersama dan mencoba mengubahnya secara bersamaan. \n" +
                "kode concurrent -> sekuensial = sebuah perintah akan selalu dijalankan dalam urutan tertentu. \n" +
                "it is better to avoid race conditions by being careful when planning a system. \n" +
                "A simple example of a race condition can be seen in an online shopping application."
    )
}