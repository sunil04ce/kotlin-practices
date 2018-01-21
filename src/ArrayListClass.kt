
fun main(args: Array<String>){

    var myArrayList =  ArrayList<String>()
    myArrayList.add("Sunil")
    myArrayList.add("SP")
    myArrayList.add("John")
    myArrayList.add("Jack")
    myArrayList.set(1, "Sparrow")

    if(myArrayList.contains("John"))    println("John is an element in myArrayList and remove it.")
    myArrayList.remove("John")

    for(index in 0..myArrayList.size-1) {
        println("At index $index has value ${myArrayList[index]}")
    }
}