package kotlinGenerics

fun main() {

    val longArrayList = ArrayList<Long>()
    val firstLong = longArrayList.get(0)
}

interface List<T> { // angle brackets (<>)
    operator fun get(index: Int): T
}

interface ListP<P> {
    operator fun get(index: Int): P
}

class LongList : List<Long> {
    override fun get(index: Int): Long {
        return this[index]
    }
}

class ArrayList<T> : List<T> {
    override fun get(index: Int): T {
        return this[index]
    }
}