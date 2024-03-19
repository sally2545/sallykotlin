class Person{
    //Attributes/properties
    var name = "John"
    var age = 27
    var gender = "Male"
    //Methods/functions
    fun walk(){
        println("Person is walking")

    }
}

fun main() {

    var accountant = Person()
    accountant.walk()

    println(accountant.gender)
}