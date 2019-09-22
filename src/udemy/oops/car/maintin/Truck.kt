package udemy.oops.car.maintin

class Truck : CarOptions {
    var subType: String? = null

    constructor(type: String, model: Int, price: Double, milesDrive: Int, owner: String, subType: String) :
            super(type, model, price, milesDrive, owner) {
        this.subType = subType
    }

    constructor(type: String, model: Int, price: Double, milesDrive: Int, subType: String) :
            super(type, model, price, milesDrive) {
        this.subType = subType
    }

    override val getCarPrice = {
        getPrice() - milesDrive!!.toDouble() * 20
    }

    val getCarPriceFromParent = {
        super.getCarPrice()
    }
}

fun Truck.getTruckPrice(): Double { // Extension of class
    return this.getCarPrice();
}

fun main() {
    var truck1 = Truck("Tata", 2020, 4000000.0, 100, "Sunil", "LandMover")
    println(truck1.type)
    println(truck1.owner)
//    println(truck1.price)   // Can not access private variables
    println(truck1.getCarPrice())
    println(truck1.getCarPriceFromParent())
    println(truck1.getTruckPrice()) // Calling extended class's function

    var truck2 = Truck("Mahindra", 2022, 6000000.0, 150, "Collector")
    println(truck2.type)
    println(truck2.owner)
//    println(truck2.price)   // Can not access private variables
    println(truck2.getCarPrice())
    println(truck2.getTruckPrice()) // Calling extended class's function


}