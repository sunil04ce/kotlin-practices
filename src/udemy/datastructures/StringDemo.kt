package udemy.datastructures

fun main() {
    val name = "Sunil Hello bro"
    val surname = " Parmar"
    val fullName = "$surname $name"
    println(fullName[0])
    println(fullName.toLowerCase())
    println(fullName.toUpperCase())
    println(fullName.trim())
    println(fullName)

    println("------ Split full name ------ ")
    val tokens = fullName.trim().split(" ")
    for(token in tokens) {
        if(!token.contains("Hello") && !token.contains("bro"))
            println("Token : $token")
    }
}