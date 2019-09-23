package udemy.oops.car.maintin

class Outer {
    private var name:String? = null
    inner class Nested {
        fun showInfo(value:String) {
            name = value
            println("name : $name")
        }
    }
}

fun main(args: Array<String>) {
    val outer = Outer()
    val nested = outer.Nested();
    nested.showInfo("Test")
}