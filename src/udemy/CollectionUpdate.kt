package udemy

fun main() {
    val listImmutable = listOf("Sunil", "Parmar")
//    listImmutable[0] = "test"
    for(name in listImmutable) {
        println(name)
    }

    println("--------------")
    var listMutable = mutableListOf("Sunil", "Parmar")
    listMutable[0] = "NewName"
    for(name in listMutable) {
        println(name)
    }

    val listOfUsersMapImmutable = hashMapOf(1 to "Sunil", 2 to "Parmar")
    val listOfUsersMapMutable = mutableMapOf(1 to "Sunil", 2 to "Parmar")

}