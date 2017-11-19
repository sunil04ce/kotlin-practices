
class House(type: String, price: Double, builtYear: Int, owner: String) { // Here is class name with it's constructor-parameters
    // Class properties
    var type: String? = null
    var price: Double? = null
    var builtYear: Int? = null
    var owner: String? = null

    init { // initialize all above properties with constructor-parameters
        this.type = type
        this.price = price
        this.builtYear = builtYear
        this.owner = owner
    }

    fun GetType(): String? {
        return this.type;
    }
}

fun main(args: Array<String>) {
    var myHouse = House("3 BHK", 2500000.0, 2017, "Sunil")
    println("My House type : ${myHouse.type}")
    println("My House owner : ${myHouse.owner}")
    myHouse.owner = "Ansh"
    println("My House updated owner : ${myHouse.owner}")
    println("My House type is ${myHouse.GetType()}")

}