package constructor1.gettersetter

import java.util.Scanner

class Girl {
    var age:Int =0
        get() = field
        set(value) {
            field = when (value){
               in 1..18 -> value
               in 18..30 -> value-3
               else -> value+10
            }
        }
}

fun main() {
    val g = Girl()
    val scanner  = Scanner(System.`in`)
    println("Enter your age :")

    val age = scanner.nextInt()
    g.age=age
    println("Your age is ${g.age}")
}
