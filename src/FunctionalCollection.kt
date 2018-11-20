
val numbers : List<Int> = listOf(1,2,3,4)
fun main(args: Array<String>) {
    val numbersTwice: List<Int> = numbers.map { i -> i * 2 }
    for (i in numbersTwice) {
        println(" i : $i")
    }

    val sumFold = numbers.fold(0){ acc, i ->
        println("fold   acc = $acc ,  i = $i ")
        acc + i
    }

    println(sumFold)

    val sum = numbers.reduce { acc, i ->
        println("reduce  acc = $acc ,  i = $i ")
        acc + i
    }

    println(sum)
}