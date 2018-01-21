
enum class Suits {
    HEARTS,
    SPADES,
    DIAMONDS,
    CLUBS
}

fun main(args: Array<String>){

    var cardPlayer = Suits.CLUBS

    when(cardPlayer) {
        Suits.HEARTS -> println("This is heart player")
        Suits.SPADES -> println("This is spade player")
        Suits.DIAMONDS -> println("This is diamond player")
        Suits.CLUBS -> println("This is club player")
    }
}