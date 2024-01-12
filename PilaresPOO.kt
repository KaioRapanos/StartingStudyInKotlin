//Herança
open class Dog{
    open fun sayHello(){
        println("Wow wow!")
    }
}

class Yorkshire : Dog(){
    override fun sayHello() {
        println("Wif Wif!")
    }
}

open class Tiger(val origin: String){
    fun sayHello(){
        println("A tiger from $origin says: grrhhh!")
    }
}

class SiberianTiger : Tiger("Siberia")

open class Lion(val name: String, val origin: String){
    fun sayHello(){
        println("$name, the lion from $origin says: graoh!")
    }
}

class Asiatic(name: String) : Lion(name = name, origin = "India")

fun main(){
    val dog: Dog = Yorkshire()
    dog.sayHello()

    val tiger: Tiger = SiberianTiger()
    tiger.sayHello()

    val lion: Lion = Asiatic("Rufo")
    lion.sayHello()

    val user = User("Alex",1)
    println(user)

    val secondUser = User("Alex",1)
    val thirdUser = User("Max",2)

    println("user == secondUser: ${user == secondUser}")
    println("user == thirdUser: ${user == thirdUser}")

    //hashCode()
    println(user.hashCode())
    println(secondUser.hashCode())
    println(thirdUser.hashCode())

    //copy()
    println(user.copy())
    println(user === user.copy())
    println(user.copy("Max"))
    println(user.copy(id = 3))

    println("name = ${user.component1()}")


}

//Data Classes

data class User(val name: String, val id: Int){
    override fun equals(other: Any?) =
        other is User && other.id == this.id
}


//Enum Classes
//Sealed Classes