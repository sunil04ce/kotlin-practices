package udemy

fun main() {
    for (userID in 1..3) {
        print("$userID : Enter your name : ")
        val name = readLine()!!.toString()
        print("$userID : Enter your living place : ")
        val livingPlace = readLine()!!.toString()

        print("Enter no of pets? :")
        val noOfPets = readLine()!!.toInt()
        var petName:String? = ""
        for(petID in 1..noOfPets) {
            print("Enter pet name for $petID : ")
            petName = petName + readLine()!!.toString() +", "
        }

        println("---------- User info ----------")
        println("Name : $name")
        println("Living Place : $livingPlace")
        println("Pet Names : $petName")

        println("---------- {($userID+1)} ----------")
    }
}