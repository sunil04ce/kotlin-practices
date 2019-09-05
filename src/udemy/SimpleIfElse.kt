package udemy

fun main() {
    println("Enter your age : ")
    val age = readLine()!!.toInt()

    if (age > 60) {
        println("Age is greater than 60")
    } else {
        println("Age is smaller than 60")
    }

    println("Enter grade ")
    val grade = readLine()!!.toInt()

    if (grade >= 90) {
        println("A")
    }

    when (grade) {
        100 -> println("Genius")
        in 70..79 -> println("C")
        in 80..89 -> println("B")
        else -> println("Failed")
    }

}