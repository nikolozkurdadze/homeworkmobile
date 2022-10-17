import java.lang.Math.sqrt

fun main(args: Array<String>) {
    var point1: point=point(2.3, 4.2)
    var point2: point=point(1.3, 3.7)
    println(point1)
    println(point2)
    point1.flip()
    point2.flip()
    println(point1)
    println(point2)
    println(point1.equals(point2))
    println(point1.distance(point2))

}
class point(x: Double, y: Double){
    var X: Double=x
    var Y: Double=y
    override fun toString(): String {
        return X.toString()+" "+Y.toString()
    }
    fun equals(point2: point): Boolean {
        return point2.X == X && point2.Y == Y
    }
    fun flip(){
        X = -X
        Y = -Y
    }
    fun distance(point2: point): Double {
        return sqrt((X-point2.X)*(X-point2.X)+(Y-point2.Y)*(Y-point2.Y))
    }
}