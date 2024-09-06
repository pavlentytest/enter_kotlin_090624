class MyClass {
    lateinit var name: String

    fun initil() {
        name = "Kotlin"
    }

    fun printName() {
        if(this::name.isInitialized) {
            println(this.name)
        } else
            println("Not!")
    }

}
fun main() {
    val obj = MyClass()
    obj.printName()
    obj.initil()
    obj.printName()
}