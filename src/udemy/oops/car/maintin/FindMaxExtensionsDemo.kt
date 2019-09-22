package udemy.oops.car.maintin

fun ArrayList<Int>.findMax(): Int {
    var maxNumber = 0
    for (item in this) {
        if (item > maxNumber) {
            maxNumber = item
        }
    }
    return maxNumber
}

fun main() {
    val listOfElements = arrayListOf(12, 14, 1, 5, 4)
    println("Max : ${listOfElements.findMax()}")
}