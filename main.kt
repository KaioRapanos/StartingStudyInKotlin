package kaio.helloworld.kotlin

fun hello(){
    println("Hello, World!")
}

fun printMessage(message: String): Unit{
    println(message)
}
fun printMessageWithPrefix(message: String, prefix: String = "Info"){
    println("[$prefix] $message")
}

fun sum(x: Int, y: Int): Int {
    return  x + y
}

fun multiply(x: Int, y: Int) = x * y

fun main(){

    hello()
    printMessage("Hello!")
    printMessageWithPrefix("Hello", "log")
    printMessageWithPrefix("Hello")
    printMessageWithPrefix(prefix =  "log", message = "Hello!")
    println(sum(1,2))
    println(multiply(2,4))

    fun printAll(vararg message: String){
        for(iten in message) println(iten)
    }

    printAll("Hello !", "Sou Kaio", "Muito Prazer")

    fun printAllWithPrefix(vararg message: String, prefix: String){
        for(iten in message) println(prefix + iten)
    }

    printAllWithPrefix(
        "Hello", "Mundo", "Thanks",
        prefix = "Greeting: "
    )

    fun log(vararg entries: String){
        printAll(*entries)
    }

    log("Hello !", "Sou Kaio", "Muito Prazer")

    var a: String = "initial"
    println(a)
    a = "final"
    println(a)
    val b: Int = 1 //val cannot be reassigned
    val c = 3      //val cannot be reassigned
    println(b)
    println(c)

    fun someCondition() = true

    val d: Int
    if (someCondition()) {
        d = 1
    } else {
        d = 2
    }
    println(d)


}