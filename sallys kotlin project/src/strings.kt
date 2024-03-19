fun main() {
    var greeting = "Hello world"
    var firstname = "Susan"
    var lastname = "Chomba"

    //String concatenation
    println(firstname +" "+lastname)
    println(firstname.plus(lastname))

    //Accessing an element in a string
    println(greeting[6])

    //Determine an index position
    println(greeting.indexOf("world"))
    println(greeting.indexOf('H'))

    //Modifying a string
    println(greeting.uppercase())

    //String interpolation
    println("Hello there, my name is $firstname $lastname")

    //Size of a string
    println(greeting.length)



}