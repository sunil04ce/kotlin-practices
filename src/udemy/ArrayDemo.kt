package udemy

fun main() {
    println("Enter no of Pets")
    val numberOfPets = readLine()!!.toInt()

    var listOfPets : Array<String> = Array(numberOfPets){""}

    for(i in 0 until numberOfPets) {
        print("Enter pet name $i : ")
        listOfPets[i] = readLine()!!.toString()
    }

    for(i in 0 until numberOfPets) {
        println("Pet name[$i] : ${listOfPets[i]}")
    }
}