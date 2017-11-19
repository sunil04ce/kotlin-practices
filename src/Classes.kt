
class House(type: String, price: Double, builtYear: Int, owner: String) {
    var type: String? = null
    var price: Double? = null
    var builtYear: Int? = null
    var owner: String? = null

    init { // initialize all above properties
        this.type = type
        this.price = price
        this.builtYear = builtYear
        this.owner = owner
    }

}

fun main(args: Array<String>) {
    var myHouse = House("3 BHK", 2500000.0, 2017, "Sunil")
    println("My House : ${myHouse.type}")
}