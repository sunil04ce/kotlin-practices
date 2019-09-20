package udemy

import java.util.*
import kotlin.collections.HashMap

fun main() {
    var listOfUsers = HashMap<String, LinkedList<String>>()
    for (userID in 1..2) {
        print("$userID : Enter your name : ")
        val name = readLine()!!.toString()
        print("$userID : Enter your living place : ")
        val livingPlace = readLine()!!.toString()

        var listOfPets = LinkedList<String>()
        do {
            print("Enter pet name or  type exit to quit")
            var petName = readLine()!!.toString()
            if(petName!= "exit") {
                listOfPets.add(petName)
            }
        } while(petName!= "exit")

        listOfUsers["$name:$livingPlace"] = listOfPets
    }

    for(key in listOfUsers.keys) {
        println(key +"  :  " +listOfUsers[key])
    }
}