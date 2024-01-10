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

    //Ranges

    for(i in 0..3){
        println(i)
    }
    println(" ")//0123

    for (i in 0 until 3){
        println(i)
    }
    println(" ")//012

    for (i in 2 .. 8 step 2){
        println(i)
    }
    println(" ")//2468

    for (i in 3 downTo 0){
        println(i)
    }
    println(" ")//3210

    //Char ranges are also supported
    for (c in 'a'..'d'){
        println(c)
    }
    println(" ")

    val x = 2
    if (x in 1 .. 5){
        println("x is in range from 1 to 5")
    }
    println(" ")

    if (x !in 6 .. 10){
        println("x is not in range from 6 to 10")
    }

    //Equality Checks
    val authors = setOf("Shakespeare", "Hemingway", "Twain")
    val writers = setOf("Twain","Shakespeare","Hemingway")

    println(authors == writers)
    println(authors === writers)

    //Conditional Expression
    fun max(a: Int, b: Int) = if (a > b) a else b

    println(max(99, -42))

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