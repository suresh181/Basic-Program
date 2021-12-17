import java.util.*

//fun main(args: Array<String>) {
//
//
//    val firstNumber = 20
//    val secondNumber = 30
//    val sum = firstNumber + secondNumber
//    val sub = firstNumber - secondNumber
//    val multi = firstNumber * secondNumber
//    val divi = firstNumber / secondNumber.toFloat()
//
//    println("$sum")
//    println("$sub")
//    println("$multi")
//    println("$divi ")
//
//
//    val f = 1.5f
//    val e = 2.0f
//
//    val multiply = f * e
//
//    println("$multiply")
//
//    val char = 'b'
//    val ascii = char.toInt()
//
//    println("The ASCII value of $char is: $ascii")
//
//
//    val dividend = 25
//    val divisor = 4
//
//    val q = dividend / divisor
//
//    val r = dividend % divisor
//
//    println("q = $q, r = $r")
//
//
//}



fun main(args: Array<String>){

    val reader = Scanner(System.`in`)
    print("Enter the number:")

    val first = reader.nextInt()
    val second = reader.nextInt()

    println("Enter an operator(+,_,*,/):")
    val operator = reader.next()[0]

    val result: Int

    when(operator){
        '+' -> result = first + second
        '-' -> result = first - second
        '*' -> result = first * second
        '/' -> result = first / second
        else -> {
        System.out.printf("Error! Opertor is not correct")
            return
    }
    }

    System.out.printf("$result",first,operator,second,result)
}