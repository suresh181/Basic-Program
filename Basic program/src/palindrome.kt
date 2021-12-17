fun main(args: Array<String>) {

    var num = 121
    var reversedInteger = 0
    var remainder: Int
    var orginalInterger: Int

    orginalInterger = num

    while (num != 0) {
        remainder = num % 10
        reversedInteger = reversedInteger * 10 + remainder
        num /= 10
    }

    if (orginalInterger == reversedInteger) {
        println("$orginalInterger is palindrome")
    } else
        println("$orginalInterger is not palindrome")
}
