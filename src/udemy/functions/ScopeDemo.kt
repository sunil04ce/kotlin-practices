package udemy.functions

var userName: String? = null    // Global variable

fun showUserInfo() {
    userName = "Welcome $userName"
    println(userName)
}

fun main() {
    showInfo(145)   // calling global function of different class
    userName = "Sunil"
    showUserInfo()

//    for(i in 1..10) {
//        var age = 34    // local variables
//    }
//    println(age)    // can not access local variables, outside of for-loop

}