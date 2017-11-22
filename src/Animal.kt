open class Animal() {

    var name: String? = null
    var color: String? = null
    var numLegs: Int? = null

    constructor(name: String, color: String, numLegs: Int): this() {
        this.name = name
        this.color = color
        this.numLegs = numLegs

        println("Property name : ${this.name}")
        println("Property color : ${this.color}")
        println("Property numLegs : ${this.numLegs}")
    }
}

class Lion : Animal() {
    var isItVegiterian: Boolean? = false
    var willItRoar: Boolean? = false

}

fun main(args: Array<String>) {
    var animal = Animal("Dog", "White", 4)

    var lion = Lion()
    lion.color = "orange"
    lion.willItRoar = true

    println()
    println("Lion has color ${lion.color}")
    println("Will Lion Roar? = ${lion.willItRoar}")
    println("Lion has legs = ${lion.numLegs}")
}