package udemy.multithreading

fun main(args: Array<String>) {
    var thread = UserThread("T1")
    thread.start()

    var thread2 = UserThread("T2")
    thread2.start()
    thread2.join()

    var thread3 = UserThread("T3")
    thread3.start()
    thread3.join()

    println("Thread is started..")
}

class UserThread() : Thread() {
    var threadName:String? = null
    constructor(threadName : String) : this() {
        this.threadName = threadName
        println("Started thread : ${this.threadName}")
    }
    override fun run() {
        var count = 0
        while(count < 10) {
            println("${threadName} Count : $count")
            count++

            try {
                Thread.sleep(1000)
            } catch (e: Exception) {
                println(e.message)
            }
        }
    }
}