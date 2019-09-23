package udemy.oops.car.maintin

import java.util.*

class PersonClass(var name: String, var age: Int) : Comparable<PersonClass> {
    override fun compareTo(other: PersonClass): Int {
        return this.age - other.age
    }
}

fun main(args: Array<String>) {
    var listOfNames = arrayListOf<PersonClass>()
    listOfNames.add(PersonClass("Sunil", 34))
    listOfNames.add(PersonClass("Anil", 33))
    listOfNames.add(PersonClass("Parmar", 3))

    listOfNames.forEach { person ->
        println("${person.name}  of age: ${person.age}")
    }

    Collections.sort(listOfNames)

    println("-------------------------------")
    listOfNames.forEach { person ->
        println("${person.name}  of age: ${person.age}")
    }
}