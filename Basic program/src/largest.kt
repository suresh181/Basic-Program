import java.util.*

fun main(args: Array<String>){

   val n1 = 10
    val n2 = 5
    val n3 = 38

    if (n1>= n2 && n1>=n3) {
        println("$n1 is largest number")
    }
    else if(n2>=n1 && n2>= n3){
        println("$n2 is largest number")
    }
    else
        println("$n3 is largest number")
    
}