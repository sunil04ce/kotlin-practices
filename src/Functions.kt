
fun main(args: Array<String>) {
    println("Hello...")
    add(5, 7)
    println("Multiplication of 4 and 5 is ${doMultiplication(4,5)}")
    println("My name is ${getName("Sunil")}")
}

fun add(num1: Int, num2: Int){ // Function with no return type
    var sum = num1 + num2
    println("Sum is $sum")
}

fun doMultiplication(height: Int, width: Int): Int { //Function with return type
    return height * width
}

fun getName(name : String) : String {
    return name;
}