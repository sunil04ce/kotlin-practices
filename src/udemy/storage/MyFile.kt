package udemy.storage

import java.io.FileReader
import java.io.FileWriter

fun main(args: Array<String>) {
    println("Press\n1 -> Read \n2 -> Write\n")
    val operation = readLine()!!.toInt()
    when (operation) {
        1 -> {
            readFromFile()
        }
        2 -> {
            println("Enter text to write into file")
            var text = readLine()!!.toString()
            writeToFile(text)
        }
    }
}

fun writeToFile(str: String) {
    val fw = FileWriter("test.txt", true)
    fw.write(str + "\n")
    fw.close()
    println("Text saved.")
}

fun readFromFile() {
    try {
        val fr = FileReader("test.txt")
        var c: Int?
        do {
            c = fr.read()
            print(c.toChar())
        } while (c != -1)
    } catch (e: Exception) {
        println(e.message)
    }

}