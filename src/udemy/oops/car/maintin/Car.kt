package udemy.oops.car.maintin

class Car(var type: String, val model: Int, val price: Double,
          val milesDrive: Int, val owner: String) {
    init {
        println("initialising class object")
    }

    val getCarPrice = { ->
        price - (milesDrive.toDouble() * 10)
    }

//    fun getCarPrice() : Double {
//        return price - (milesDrive.toDouble()*10)
//    }
}

fun main() {
    var car1 = Car("Audi", 2020, 4000000.0, 100, "Sunil")
    car1.type = "Tesla"
    println(car1.type)
    println(car1.owner)
    println(car1.getCarPrice())

    var car2 = Car("Jaguar", 2022, 6000000.0, 150, "Sunil")
    println(car2.type)
    println(car2.owner)
    println(car2.getCarPrice())

    println("----------------")
    val listOfCars = arrayListOf<Car>()
    listOfCars.add(car1)
    listOfCars.add(car2)

    listOfCars.forEach { car ->
        println(car.type)
        println(car.owner)
    }
}
