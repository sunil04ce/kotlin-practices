package udemy.oops.car.maintin

class CarOptions() {
    var type: String? = null
    var model: Int? = null
    var price: Double? = null
    var milesDrive: Int? = 0
    var owner: String? = null

    constructor(type: String, model: Int, price: Double, milesDrive: Int, owner: String) : this() {
        this.type = type
        this.model = model
        this.price = price
        this.milesDrive = milesDrive
        this.owner = owner
    }

    constructor(type: String, model: Int, price: Double, milesDrive: Int) : this() {
        this.type = type
        this.model = model
        this.price = price
        this.milesDrive = milesDrive
    }
}

fun main() {
    var car1 = CarOptions("Audi", 2020, 4000000.0, 100, "Sunil")
    car1.type = "Tesla"
    println(car1.type)
    println(car1.owner)

    var car2 = CarOptions("Jaguar", 2022, 6000000.0, 150)
    println(car2.type)
    println(car2.owner)


}