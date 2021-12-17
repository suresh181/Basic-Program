fun main(args:Array<String>){

    var line = "This website is aw3s0m3"
    var vowels = 0
    var digits = 0
    var cons = 0
    var spaces = 0

    line = line.toLowerCase()

    for (i in 0..line.length-1) {
        val ch = line[i]
        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
            vowels++
        } else if (ch in 'a'..'z') {
            cons++
        } else if (ch in '0'..'9') {
            digits++
        } else if (ch in "") {
            spaces++
        }

    }
    println("vowels:$vowels")
    println("Digits:$digits")
    println("cons:$cons")
    println("spaces:$spaces")


}
