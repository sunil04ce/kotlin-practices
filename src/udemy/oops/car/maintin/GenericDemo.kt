package udemy.oops.car.maintin

class UserAdmins<T>(credit:T) {
    init {
        println(credit)
    }
}

fun <T> display(process : T) {
    println(process)
}

fun main() {
    var useradmin1 = UserAdmins<String>("Sunil")
    var useradmin2 = UserAdmins<Int>(123)

    display<String>("Parmar")
    display<Int>(456)
}