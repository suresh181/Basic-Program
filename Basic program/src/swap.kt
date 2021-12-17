import javax.print.DocFlavor

fun main(args: Array<String>){

    var first = 1.5f
    var second = 2.0f

    println("Before swap---")
    println("$first, $second")

    var temporary = first

    first = second

    second = temporary

    println("Afer swap---")

    println("$first,$second")

}