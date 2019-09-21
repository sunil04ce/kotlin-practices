package udemy.functions

fun addNumers(x: Double = 0.0, y: Double = 0.0): Double {
    var temp = x + y
    return temp
}

fun displayInfo(vararg names: String) {
    for (name in names) {
        println(name)
    }
}

fun main() {
    println(addNumers(3.0, 5.0))
    println(addNumers(11.0, 2.0))
    println(addNumers(14.0, 6.0))
    println(addNumers(19.0, 10.0))
    println(addNumers(10.0))
    println(addNumers(y = 13.5))
    displayInfo(names = *arrayOf("Sunil", "Parmar"))
}