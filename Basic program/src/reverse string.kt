fun main(args:Array<String>) {

    var sentence = "Go Work"
    var reverse = reverse(sentence)
    println("The reverse sentence is :$reverse")
}

fun reverse(sentence:String):String {
    if (sentence.isEmpty())
        return sentence

    return reverse(sentence.substring(1))+sentence[0]
}