import java.util.*

fun main() {

    var input = Scanner(System.`in`)

    print("Enter marks :")
    var marks = input.nextInt()

    var result = when (marks) {
        in 80..100 -> "A"
        in 60..79 -> "B+"
        in 40..59 -> "B-"
        in 30..39 -> "C+"
        in 20..Int.MIN_VALUE -> "C"
        else -> "Invalid Mark"
    }
    println("The grade is $result")



}