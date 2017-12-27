
abstract class GraphicAbstract {

    abstract fun draw()
    abstract fun resize()

    fun moveTo(X_Axis: Int, Y_Axis: Int) {
        println("Graphic move to new $X_Axis and $Y_Axis");
    }
}

class Circle: GraphicAbstract() {
    override fun draw() {
        println("Drawing circle.....");
    }

    override fun resize() {
        println("Resizing circle.....");
    }
}

class Triangle: GraphicAbstract() {
    override fun draw() {
        println("Drawing Triangle.....");
    }

    override fun resize() {
        println("Resizing Triangle.....");
    }
}

fun main(args: Array<String>) {

    var circle = Circle()
    circle.draw()
    circle.moveTo(12, 50)

    var triangle = Triangle()
    triangle.draw()
    triangle.resize()
}