class Dog(var name:String,var breed:String,var age:Int){
    fun move(movement:String){
        println("The dog is $movement")
    }
}

fun main() {
    var dog1 = Dog("Bob","Bulldog",2)
    var dog2 = Dog("Tracy","Chiwawa",4)

    println(dog1.breed)
    println(dog1.name)

    dog1.move("walking")
    dog2.move("running")
}