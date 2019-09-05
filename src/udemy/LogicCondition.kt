package udemy

fun main() {
    var condition = (3>2)
    println(condition)
    condition = (1>2)
    println("1>2 $condition")
    condition = (1>=2)
    println(condition)
    condition = (1<=2)
    println(condition)
    condition = (1!=2)
    println(condition)
    condition = (2==2)
    println(condition)

    val age = 20
    println("result = "+(age>=60 || age<=18))
    println("age!=22 = ${age!=22}")
    println(age in 18..30)
}