// When

fun main() {
    cases("Hello")
    cases(1)
    cases(0L)
    cases(MyClass())
    cases("hello")
    println(whenAssing("Hello"))
    println(whenAssing(3.4))
    println(whenAssing(1))
    println(whenAssing(MyClass()))

    //Loops
    val cakes = listOf("carrot", "chesse", "chocolate")

    for (cake in cakes){
        println("Yummy, it`s a $cake cake!")
    }

    var cakesEaten = 0
    var cakesBaked = 0

    while (cakesEaten < 5){
        eatACake()
        cakesEaten++
    }

    do{
        bakeACake()
        cakesBaked++
    }while (cakesBaked < cakesEaten)

    //Iterators

    val animals = listOf(Animal("Zebra"),Animal("Lion"))
    val zoo = Zoo(animals)

    for (animals in zoo){
        println("Watch out, it`s a ${animals.name}")
    }

}

class Animal(val name: String)

class Zoo(val animals: List<Animal>){

    operator fun iterator(): Iterator<Animal> {
        return animals.iterator()
    }
}

fun eatACake() = println("Eat a Cake!")
fun bakeACake() = println("Bake a Cake!")

fun cases(obj: Any){
    when(obj){
        1-> println("One")
        "Hello" -> println("Greeting")
        is Long -> println("Long")
        !is String -> println("Not a string")
        else -> println("Unknown")
    }
}

fun whenAssing(obj: Any): Any{
    val result = when(obj) {
        1-> "One"
        "Hello" -> 1
        is Long -> false
        else -> 42
    }
    return result
}

class MyClass

//Loops