package udemy

fun main() {
    println("Enter food ID")
    val foodID = readLine()!!.toInt()

    when(foodID) {
        1-> {
            println("You got sandwich")
        }
        10 -> {
            println("You got burger")
        }
        else -> {
            println("You did not enter any food id")
        }
    }
}