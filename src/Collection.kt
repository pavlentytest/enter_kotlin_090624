fun main() {

    // mutable
    // immutable

    var names : List<String> = listOf("Ivan","Petr")
    val names2 = listOf("Olga");
    //names = names2
   // names[0] = "Maria"
   // names.add("Alex")

    val cities : MutableList<String> = mutableListOf("Msk","spb")
    cities[0] = "Ekt"
    cities.add("Omsk")

    val cars = listOf("1","2","3")
    println(cars.joinToString(" "))

    val ivan = Person("Ivan")
    println(ivan.age) // 1
    ivan.age = 20
    println(ivan.age) // 20
    ivan.age = 5
    println(ivan.age) // 20
}
class Person(val name: String) {
    private var _age = 1
    var age: Int
        set(value) {
            if (age > 10) {
                _age = value
            }
        }
        get() = _age

}