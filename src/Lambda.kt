fun main() {
    val x = { println("123123") }
    val y: () -> Unit = { println("") }
    x()

    val sum: (Int, Int) -> Int =
        { x, y -> x + y}

    val r = sum(5,6)
    val sum2 = { x: Int, y: Int ->
        val result = (x+y)*200
        result
    }

    val r2  = doSmth(1,2,{x,y -> x*y})
    val r3 = doSmth(1,2,fun(x,y) : Int = x*y )
}
fun doSmth(a: Int, b: Int, op: (Int, Int) -> Int): Int {
    return op(a,b)
}