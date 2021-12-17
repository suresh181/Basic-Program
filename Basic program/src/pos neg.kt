fun main(args: Array <String>){
    val num = -13

    when{
        num < 0.0 -> println("$num is negative number")
        num > 0.0 -> println("$num is positive number")

        else -> println("$num is 0")

    }
}