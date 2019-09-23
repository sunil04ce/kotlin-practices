package udemy.storage

fun main(args: Array<String>) {
    try {
        println("Enter number : ")
        val number = readLine()!!.toInt()
        var div = 100/number;
        println("div : $div")
    } catch (e: Exception) {
        println(e.message)
    }
    println("App end...")
}