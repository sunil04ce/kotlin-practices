package udemy.oops.car.maintin

abstract class CreditCardAbsract() {
    fun getCreditId() : String {
        return "123456789"
    }
    abstract fun newCredit()
}

class UserInfo() : CreditCardAbsract() {
    override fun newCredit() {
        println("new credit created.")
    }

    fun getInfo() : String {
        return getCreditId()
    }
}

fun main(args: Array<String>) {
    var user = UserInfo()
    println(user.getInfo())
    user.newCredit()
}
