fun main(args: Array<String>) {
    val year = 2000
    var leap = false
    if (year % 4 == 0) {
        if (year % 100 == 0) {
            leap = year % 400 == 0
        } else
            leap = true
    }else
        leap = false

    println(if (leap)"$year is a leap year" else "$year is a not a leap year" )
}