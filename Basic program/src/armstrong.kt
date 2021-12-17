fun main(args:Array<String>){
//    var number = 371
//    var originalNumber : Int
//    var remainder:Int
//    var result = 0
//
//    originalNumber = number
//
//    while (originalNumber !=0){
//
//        remainder= originalNumber%10
//        result += Math.pow(remainder.toDouble(),3.0).toInt()
//        originalNumber /=10
//
//
//    }
//    if (result == number)
//        println("$number is a Armstrong")
//    else
//        println("$number is a not Armstrong")


    var low = 999
    val high = 99999

    for (number in low+1..high-1){
        var digit = 0
        var result = 0
        var orginalNumber = number

        while (orginalNumber !=0){
            orginalNumber/= 10
            digit++
        }

        orginalNumber=number

        while (orginalNumber!=0){
            var remainder = orginalNumber % 10
            result += Math.pow(remainder.toDouble(),digit.toDouble()).toInt()
            orginalNumber /= 10
        }
        if (result==number)
            println("$number")
    }



}