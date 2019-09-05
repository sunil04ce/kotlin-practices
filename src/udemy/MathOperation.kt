package udemy

fun main() {
    print("Enter number 1 :")
    var number1 = readLine()!!.toDouble()
    print("Enter number 2 :")
    var number2 = readLine()!!.toDouble()

    var sum = number1 + number2
    println("Sum of two numbers = $sum")

    var sub = number1 - number2
    println("sub of two numbers = $sub")

    var mul = number1 * number2
    println("Mul of two numbers = $mul")

    var div = number1 / number2
    println("div of two numbers = $div")
}