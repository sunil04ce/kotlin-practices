package udemy

import java.util.*

fun main() {
    var listOfPets = LinkedList<String>()

    do {
        println("Enter pet name or exit to quit")
        val petName = readLine()!!.toString()
        if (petName != "exit") {
            listOfPets.add(petName)
        }
    } while (petName != "exit")

    for(pet in listOfPets){
        println("Pet : ${pet}")
    }

}