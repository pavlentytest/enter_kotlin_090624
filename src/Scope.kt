// scope функции
class Plane {
    var id = 0
    var name = "Test"
    var seats = 120
}
fun main() {
    val plane = Plane()
    // apply
    var boeing = Plane().apply {
        id = 1
        name="b737"
        seats = 200
    }
    // let
    listOf(1,2,3,null,4,6,null).forEach {
        it?.let {
            if(it>2) println(it)
        } ?: println("null detected!")
    }
    var str : String? = "Test"
    str = null
    val l = if(str!=null) str.length else -1
    val l2= str?.length ?: -1 // elvis expr

    val str2 : String? = null
    println(str2!!.length)

    // also
    listOf(1,2,3,null,4,6,null).forEach {
       it?.also{
           println(it)
       }?.also {
           //savetofile()
       } ?: println("null detected!")
    }
    // run
    printMessage(serverMessage(checkServerResponse(200)))
    200.run(::checkServerResponse)
        .run(::serverMessage)
        .run(::printMessage)
    //with
    val startwith = with("London is the cap of GB"){
        if(startsWith(" ")) {

        } else {

        }
    }
}

fun checkServerResponse(code: Int) = code == 200
fun serverMessage(valid: Boolean) =
    if(valid) "YES" else "NO"
fun printMessage(message: String) = println(message)
