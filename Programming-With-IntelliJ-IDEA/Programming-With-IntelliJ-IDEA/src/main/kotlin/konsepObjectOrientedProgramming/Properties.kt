package konsepObjectOrientedProgramming

class AnimalP {
    var name: String = "Dicoding Miaw"
}

class AnimalOverride {
    var name: String = "Dicoding Miaw"
        get() {
            println("Fungsi Getter terpanggil")
            return field
        }
        set(value) {
            println("Fungsi Setter terpanggil")
            field = value
        }
}

fun main() {

    /*
    Property Accessor
    var = mutable -> getter & setter
    val = immutable -> (read-only) getter
    */

    val dicodingCat = AnimalP()
    println("Nama: ${dicodingCat.name}")
    dicodingCat.name = "Goose"
    println("Nama: ${dicodingCat.name}")

    println()

    val dicodingCatOverride = AnimalOverride()
    println("Nama: ${dicodingCatOverride.name}")
    dicodingCatOverride.name = "Goose"
    println("Name: ${dicodingCatOverride.name}")
}