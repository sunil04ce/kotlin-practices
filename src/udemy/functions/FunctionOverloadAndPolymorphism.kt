package udemy.functions

fun add(number1:Int, number2:Int) : Int {
    return number1 + number2
}

fun add(number1:Int, number2:Int, number3:Int) : Int {
    return number1 + number2 + number3
}

fun add(number1:Int, number2:Int, number3:Int, number4: Double) : Double {
    return number1 + number2 + number3 + number4
}

fun showInfo(userName : String) {
    println("Username : $userName")
}

fun showInfo(cardID : Int) {
    println("Card Id : $cardID")
}

fun main() {
    println(add(3,4))
    println(add(3,4, 6))
    println(add(3,4, 6, 4.5))

    showInfo(123)
    showInfo("MyName")
}