package constructor1.seondaryconstructor

import constructor1.visibilty.bbbb.Parent

open class Log {
    constructor():this("kamal singh"){
        println("Third")
    }

    constructor(data : String):this(data,5){
        println("Second")
        println(data)
    }
    constructor(data: String,number:Int){
        println("First")
        println("$data $number")
    }
}

fun main() {
    Log()
    println()
    Log("Pummy Singh")
}
