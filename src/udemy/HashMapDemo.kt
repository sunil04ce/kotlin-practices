package udemy

fun main() {
    var listOfUsers = HashMap<Int, String>()
    listOfUsers[1] = "Android"
    listOfUsers[2] = "Sunil"
    listOfUsers[3] = "Parmar"

    for(key in listOfUsers.keys) {
        println("User Id $key : ${listOfUsers[key]}")
    }
}