
class Login<T> (name: T, password: T) {
    init {
        println("name is "+name +"  password : "+password)
    }
}

class Person(username: String, password: String) {
    var username: String?= null
    var password: String?= null

    init {
        this.username = username
        this.password = password
    }
}

fun main(args: Array<String>) {
    var login1 = Login<String>("PC", "Words")
    var login2 = Login<Int>(11, 15)
    var login3 = Login<Boolean>(true, false)

    var person = Person("Sunil", "SP")
    var login4 = Login<Person>(person, person)

}