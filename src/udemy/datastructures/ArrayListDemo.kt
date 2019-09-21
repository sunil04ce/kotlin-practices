package udemy.datastructures

fun main() {
    var listOfPets = ArrayList<String>()
    do {
        println("Enter pet name or exit to quit :")
        val petName =  readLine()!!.toString()
        if(petName != "exit") {
            listOfPets.add(petName)
        }
    } while(petName != "exit")

    for(pet in listOfPets) {
        println("Pet : ${pet}")
    }

    if(listOfPets.contains("cat")) {
        println("Your cat is qualified for special care")
    }
}