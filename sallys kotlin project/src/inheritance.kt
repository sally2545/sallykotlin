//Parent class/Super class/Base class
open class Animal{
    var Age = 2
    var gender = "female"

    fun move(movement:String){
        println("Animal is $movement")
    }
}

//Child class/Derived class/Sub class
open class Duck:Animal(){
    var colour = "white"
    fun sound(){
        println("Duck is quacking")
    }
}

class fish:Duck(){
    var hasScales = true
    var hasFins = true
    fun eat(){
        println("Fish is eating")
    }

}

fun main() {
    var a = Animal()

    var d = Duck()
    println(d.gender)
    d.move("swimming")

    var nileperch =fish()
}