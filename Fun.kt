// let run with apply also
//infix Operator higher-order lambda extension suspend

//let
fun customPrint(s: String){
    print(s.uppercase())
}

fun main(){

    val empty = "Teste".let {
        customPrint(it)
        it.isEmpty()
    }
    println(" is empty: $empty")

    fun printNonNull(str: String?){
        println("Printing \"$str\":")

        str?.let { print("\t")
            customPrint(it)
            println()
        }
    }


    fun printIfBothNonNull(strOne: String?, strTwo: String?){
        strOne?.let { firstString ->
            strTwo?.let { secondString ->
                customPrint("$firstString : $secondString")
                println()
            }
        }
    }

    fun getNullabelLength(ns: String?){
        println("for \"$ns\":")
        ns?.run {
            println("\tis empty? " + isEmpty())
            println("\tlength = $length")
            length
        }
    }

    printNonNull(null)
    printNonNull("my string")
    printIfBothNonNull("First","Second")

    getNullabelLength(null)
    getNullabelLength("")
    getNullabelLength("some string with Kotlin")

    val configuration = Configuration(host= "127.0.01", port =  9000)
    with(configuration){
        println("$host:$port")
    }
    configuration.run {
        println("$host:$port")
    }
    println("${configuration.host}:${configuration.port}")

    val jake = Person()
    val stringDescripiton = jake.apply {
        name = "Jake"
        age = 30
        about = "Android developer"
    }.toString()

    println(stringDescripiton)

    val jake1 = Person("Jake", 30, "Android developer")
        .also {
            writeCreationlog(it)
    }

}
class Configuration(val host:String, val port:Int)

data class Person(var name: String, var age: Int, var about: String){
    constructor() : this ("", 0 ,"")
}

fun writeCreationlog(p: Person){
    println("A new person ${p.name} was created.")
}

