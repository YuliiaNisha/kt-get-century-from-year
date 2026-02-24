package mate.academy

const val DIVISOR = 100
const val ONE = 1
const val ZERO = 0

fun getCentury(year: Int) : Int {
    val result = year / DIVISOR
    return if (year % DIVISOR > ZERO) {
        result + ONE
    } else {
        result
    }
}
