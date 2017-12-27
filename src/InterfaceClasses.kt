
interface ClickHandler {
    fun onClicked()
    fun doubleClicked()
    fun longPressed()
}

class Button: ClickHandler {
    override fun onClicked() {
        println("Button is clicked.....")
    }

    override fun doubleClicked() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun longPressed() {
        println("Button is Long Pressed.....")
    }
}

class Phone: ClickHandler {
    override fun onClicked() {
        println("Phone is clicked.....")
    }

    override fun doubleClicked() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun longPressed() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}

fun main(args: Array<String>) {
    var button = Button()
    button.onClicked()
    button.longPressed()

    var phone = Phone()
    phone.onClicked()
}