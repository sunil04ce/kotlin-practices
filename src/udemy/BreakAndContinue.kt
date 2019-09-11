package udemy

fun main() {
    println("Continue example")
    for(number in 1..10) {
        if(number == 5)
            continue
        println(number)
    }

    println("Break example")
    for(number in 1..10) {
        if(number == 6)
            break
        println(number)
    }

    println("Break Inner example")
    loop@ for(number in 1..10) {
        println("number : $number")
        for(inner in 1..7) {
            println("Inner loop : $inner")
            if (inner == 6)
                break@loop

        }
        println(number)
    }

    println("End App")
}