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
}

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