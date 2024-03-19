fun main() {
    //While loop
    var number = 200
    while (number <= 205){
        println("Number is $number")
        number++
    }

    //decrement
    var num = 100
    while (num >= 95){
        println("Num is $num")
        num--
    }

    //Do... while loop
    var numb = 20
    do {
        println(numb)
        numb++
    }while (numb <= 25)

    //For loop
    var furniture = arrayOf("Table","Chair","Desk")
    for (z in furniture){
        println(z)
    }
    var marks = arrayOf(95,80,100,20)
    for (x in marks){
        println("mark is $x")
    }
    //Range
    for (number in 30..35 ){
        println(number)
    }
    for (letters in 'a'..'e'){
        println(letters)
    }

}