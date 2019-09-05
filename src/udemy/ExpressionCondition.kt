package udemy

fun main() {
    val isMarried = true
    val GPA = 4.0

    val isQualified = if(isMarried && GPA >=3.8) 1 else 0
    println(isQualified)

    val isGood = when(GPA) {
        4.0 -> true
        else -> false
    }

    println(isGood)

    // Assignment Number is Odd or Even
    println("Enter number")
    val number = readLine()!!.toInt()
    println(if(number%2==0) "the number is even" else "the number is odd")

}