package udemy

import java.util.*
import kotlin.collections.HashMap

fun main() {
    var listOfUsers = HashMap<String, LinkedList<String>>()
    while(true) {
        print("Enter your name : ")
        val name = readLine()!!.toString()
        if(name == "exit") {
            break;
        }
        print("Enter your living place : ")
        val livingPlace = readLine()!!.toString()

        var listOfPets = LinkedList<String>()
        do {
            print("Enter pet name or type exit to quit : ")
            var petName = readLine()!!.toString()
            if(petName!= "exit") {
                listOfPets.add(petName)
            }
        } while(petName!= "exit")

        listOfUsers["$name:$livingPlace"] = listOfPets
    }

    for(key in listOfUsers.keys) {
        var listOfPets = listOfUsers[key]
        println("--------------")
        println(key)
        for(petName in listOfPets!!) {
            println("pet name  :  $petName")
        }

    }
}