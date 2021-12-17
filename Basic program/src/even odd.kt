import java.util.*

fun main(args:Array<String>){

    val reader = Scanner(System.`in`)

    println("Enter the Number:")

    val int = reader.nextInt()

    if ( int % 2 == 0){
        println("$int is even")
    }else
        println("$int is odd")
}