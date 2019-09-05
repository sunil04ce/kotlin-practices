package udemy

fun main() {
    println("Enter grade :")
    val grade = readLine()!!.toInt()

    if(grade >= 90) {
        if(grade > 93) {
            println("Genius+")
        } else {
            println("Genius")
        }
    } else if(grade in 80..89) {
        if(grade >= 85) {
            println("A+")
        } else {
            println("A")
        }
    } else if(grade in 70..79) {
        if(grade >= 75) {
            println("B+")
        } else {
            println("B")
        }
    } else {
        println("Failed")
    }
}