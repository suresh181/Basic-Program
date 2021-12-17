fun main(args:Array<String>){
    var number = 60

    println("The of factor of $number :")

    for (i in 1..number){
        if (number % i ==0) {
            print("$i")
        }
    }
}