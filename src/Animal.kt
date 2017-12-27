open class Animal(){

    var name: String? = null
    var color: String? = null
    var numLegs: Int? = null

    constructor(name: String, color: String, numLegs: Int): this(){
        this.name = name
        this.color = color
        this.numLegs = numLegs

//        println("Property name : ${this.name}")
//        println("Property color : ${this.color}")
//        println("Property numLegs : ${this.numLegs}")
    }

    constructor(name: String, numLegs: Int): this(){
        this.name = name
        this.numLegs = numLegs
    }

    fun showAnimalDetails(){
        println("Animal Name is : $name")
        println("Color is : $color")
        println("Legs are : $numLegs")
    }

    open fun makeNoise(){
        println("Make noise...")
    }
}

class Lion : Animal{
    /* Access modifiers
       ----------------
        public : this is default access modifier, accessible in all classes
        private : only accessible in this class
        protected : accessible in it's child class also
    */
    var isItVegiterian: Boolean? = false
    private  var willItRoar: Boolean? = false

    constructor(isItVegiterian: Boolean, willItRoar: Boolean): super(){
        this.isItVegiterian = isItVegiterian
        this.willItRoar = willItRoar
    }

    override fun makeNoise(){
      println("Roarrr......")
    }

    fun setRoarValue(willItRoar: Boolean){
        this.willItRoar = willItRoar
    }

    fun getRoarValue() = willItRoar

}

fun main(args: Array<String>){
    var animal = Animal("Dog", "White", 4)
    animal.showAnimalDetails()


    var penguin = Animal("Penguin", 2)
    println()
    penguin.showAnimalDetails()

    var lion = Lion(true, true)
    lion.color = "orange"
    lion.setRoarValue(true)
    lion.numLegs = 4

    println()
    println("Lion has color ${lion.color}")
    println("Lion has legs = ${lion.numLegs}")
    println("Will Lion Roar? = ${lion.getRoarValue()}")
    lion.makeNoise()
}