
fun main(args: Array<String>) {
    helloThere()
    printSimpleName("Sunil")
}

fun helloThere() {
    println("Hello There!")
}

fun printSimpleName(name : String): Unit { // Here Unit return type is optional
    println("Name is $name")
}
