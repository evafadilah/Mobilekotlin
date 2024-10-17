package week2.Class

open class Employe (val name : String){
    fun sayHello(name: String){
        println("Hello $name myname is ${this.name}")
    }
}

class Manager (name: String) : Employe(name)

class Member (name: String) : Employe(name)
