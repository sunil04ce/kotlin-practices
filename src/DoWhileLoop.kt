
fun main(args:Array<String>){
    var counter = 2
    do {
        if(counter%2==0) println("$counter is even") else println("$counter is odd")
        counter++
    } while(counter < 5)

    println("Out of whlie loop")
}