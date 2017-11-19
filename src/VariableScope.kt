
var myName = "Elliot" //  Global variable
var mySurName: String? = null

fun main(args: Array<String>){
    //myName
    showName("Sunil")
}

fun showName(name: String) {
    mySurName = "Parmar"
    println("Name : $myName")
    println("Surname : $mySurName")
}