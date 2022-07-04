import java.time.LocalDateTime
import java.time.format.DateTimeFormatter

fun main() {

    val openHours = 7
    val now = 7
    val office: String
    office = if (now > 7) {
        "Office already open"
    } else if (now == openHours) {
        "Wait a minute, office will be open"
    } else {
        "Office is closed"
    }
    print(office)

    println()

    val current = LocalDateTime.now()
    val open = DateTimeFormatter.ofPattern("H")
    val openFormat = current.format(open)
    val convert = openFormat.toString().toInt()
    val office2: String = if (convert in 8..16) {
        "Open"
    } else if (convert == openHours) {
        "Wait"
    } else if (convert > 16) {
        "Close"
    } else {
        "Error"
    }
    println(office2)
}