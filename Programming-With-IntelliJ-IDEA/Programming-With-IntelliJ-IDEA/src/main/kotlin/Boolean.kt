import java.time.LocalDateTime
import java.time.format.DateTimeFormatter

fun main() {

    /*Conjunction atau AND (&&)
    Disjunction atau OR (||)
    Negation atau NOT (!)*/

    val officeOpen = 7
    val officeClosed = 16
    val now = 20

    val isOpen = if (now >= officeOpen && now <= officeClosed) {
        true
    } else {
        false
    }
    print("Office is open : $isOpen")
    println()

    val isClose = now < officeOpen || now > officeClosed
    print("Office is closed : $isClose")
    println()

    val isOpenNot = now > officeOpen
    if (!isOpenNot) {
        print("Office is closed")
    } else {
        print("Office is open")
    }

    println("\n")

    val current = LocalDateTime.now()
    val formatter = DateTimeFormatter.ofPattern("H")
    val formatted = current.format(formatter)
    val convert = formatted.toString().toInt()

    val isOpen1 = convert >= officeOpen && convert <= officeClosed
    println(isOpen1)

    val isOpen2 = convert < officeOpen || convert > officeClosed
    println(isOpen2)

    val isOpen3 = convert > officeOpen
    if (!isOpen3) {
        print("Closed")
    } else {
        print("Open")
    }
}