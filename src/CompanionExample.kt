
class ToBeCalled {
    companion object Test {
        fun callMe() = println("Calling me...")
    }
}

fun main(args: Array<String>) {
    ToBeCalled.callMe()
}