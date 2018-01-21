

fun main(args: Array<String>){

    var myArray = Array<Int>(5){2}
    myArray[0] = 5
    myArray[1] = 10
    myArray[2] = 15
    myArray[3] = 20
    myArray[4] = 25
    for (element in myArray) {
        println("Item has value $element")
    }

    for (index in 0..myArray.size-1) {
        println("Item at index $index has value ${myArray[index]}")
    }
}