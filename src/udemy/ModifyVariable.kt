package udemy

import java.util.*

fun main() {
    var count = 1

    count += 1
    println("Count = $count")

    count +=2
    println("Count = $count")

    count += 3
    println("Count = $count")

    count -= 2
    println("Count = $count")

    var i =5
    println(i++)
    println(i--)

    println("Enter year of birth:")
    val yearOfBirth = readLine()!!.toInt()
    val yearInDevice = Calendar.getInstance().get(Calendar.YEAR)
    val age = yearInDevice - yearOfBirth

    println("You are $age years old")

}