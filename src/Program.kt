data class Test(var mute: Int)

const val TEST = "Test"

class Car {
    val name: String = "Test"
    var color: String = "red"

    companion object {
        const val TALK: String = "123"
    }
}
fun main() {
    val car1 = Car()
    //car1.
}


fun main2() {
    const val TTT = "123123"
    val test = Test(1)
    println(test)
    test = Test(2)
    test.mute = 3
}

fun main4() {
    var test = Test(100)
    println(test)
    test.mute = 3000
    test = Test(200)
}




