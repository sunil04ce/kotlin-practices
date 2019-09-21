package udemy.functions

/*fun sum(number1: Int, number2: Int) : Int {
    return number1 + number2
}*/

val sum = { number1: Int, number2: Int ->
    number1 + number2
}

fun main() {
    val sumOfNumbers = sum(3, 4)
    println("added numbers  = $sumOfNumbers")

    println("List of numbers")
    val listOfNumbers = listOf(10,20,30,40,50)
//    for(number in listOfNumbers) {
//        println(number)
//    }

    listOfNumbers.forEach { number ->
        println("using Lamda ---> $number")
    }

}