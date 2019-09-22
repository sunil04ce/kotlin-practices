package udemy.oops.car.maintin

interface CreditCard {
    val cardNumber: String
    fun score(age: Int)
}

class MasterCard(override val cardNumber: String) : CreditCard {
    override fun score(age: Int) {
        if (age > 50) {
            println("Negative")
        } else {
            println("Positive")
        }
    }
}

class VisaCard(override val cardNumber: String) : CreditCard {
    override fun score(age: Int) {
        if (age > 60) {
            println("Negative")
        } else {
            println("Positive")
        }
    }
}

class PayPal(client: CreditCard) : CreditCard by client {   // Delegation example
    fun print() {
        println("${this.cardNumber}")
    }
}

fun main() {
    val masterCard = MasterCard("13254467899")
    masterCard.score(60)

    val visaCard = VisaCard("54467879898")
    visaCard.score(60)

    val payPal = PayPal(masterCard) // Delegation example
    println("Card number Paypal : ${payPal.cardNumber}")
    payPal.print()
}