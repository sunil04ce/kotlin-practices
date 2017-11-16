
fun main(args: Array<String>) {
    var age: Int = 32
    age = 20
    when(age) {
        17 -> println("17")
        18 -> println("18")
        32 -> println("32")
        else -> {
            println("None of above age.");
        }
    }

    println("Enter number between 1-10")
    var enteredNumber = readLine()!!.toInt()

    when(enteredNumber) {
        1 -> println("1")
        2 -> println("2")
        3 -> println("3")
        4 -> println("4")
        5 -> println("5")
        else -> {
            println("You are out of range")
        }
    }

    println("Enter your boolean Choice")
    var yourChoice = readLine()!!.toBoolean()
    println("your boolean Choice is :  $yourChoice")
}