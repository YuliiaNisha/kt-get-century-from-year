package mate.academy

fun getCentury(year: Int) : Int {
    val result = year / 100
    return if (year % 100 > 0) {
        result + 1
    } else {
        result
    }
}
