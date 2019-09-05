package udemy

fun main() {

    println("For loop")
    for(i in 1..10 step 2) {
        println("Counter $i")
    }

    println("While loop")
    var i = 1
    while(i <= 10) {
        println("Counter $i")
        i += 2;
    }

    println("Do While loop")
    i = 1
    do {
        println("Counter $i")
        i +=2
    }while (i<=10)
}