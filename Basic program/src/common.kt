fun main(args:Array<String>){

    var num = 361
    var orginalNumber:Int
    var remainder:Int
    var reversedInteger = 0

    orginalNumber = num

    while (num != 0){
        remainder = num % 10
        reversedInteger = reversedInteger*10+remainder
        num /= 10
    }

    if (orginalNumber==reversedInteger){
        println("$num is a palindrome")
    }else
        println("$num is a not palindrome")

}