package udemy

fun main() {
    println("Increment")
    for (i in 1..20 step 2) {
        println("Number is  $i")
    }
    println("--------------\nDecrement")
    for(i in 20 downTo 0 step 2) {
        println("Number is $i")
    }
    println("--------------\nDecrement")
    for(i in 99 downTo 1 step 2) {
        println("Number is $i")
    }
    println("End App")
}