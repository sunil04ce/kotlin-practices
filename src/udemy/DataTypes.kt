package udemy
fun main() {
    val name = "Sunil"
    val age = 34
    val GPA = 8.2

    println(name)
    println(age)
    println(GPA)

    print("Enter number 1 : ")
    var number1:Int? = readLine()!!.toInt()
    print("Enter number 2 : ")
    var number2:Int? = readLine()!!.toInt()
    val temp = number1
    number1 = number2
    number2 = temp

    print("Swapped values for number1 = $number1 and number2 = $number2")

}