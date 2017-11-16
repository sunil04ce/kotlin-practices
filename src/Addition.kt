fun main(args: Array<String>) {

    //var firtNumber:Int? = null

    println("Enter first number")

    var firtNumber = Integer.parseInt(readLine())
    println("Enter second number")
    var secondNumber = Integer.parseInt(readLine())

    var result:Int?

    result = firtNumber + secondNumber

    println("Result is $result")
    println("Result with different expression: ${firtNumber + secondNumber}")


}