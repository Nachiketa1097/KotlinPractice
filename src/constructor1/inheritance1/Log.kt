package constructor1.inheritance1

open class Log {
    constructor(age:Int):this(age, "Kamal singh chauhan"){

    }
    constructor(age:Int, name:String){
        println("IN LOG constructor $age AND $name")
    }
}
class AuthLog:Log{
    constructor(age: Int):this(age,"kamal"){
        println("Age = $age")
    }
    constructor(age:Int, name:String):super(age){
        println("Age = $age and Name = $name")

    }
}

fun main() {
    val a = AuthLog(44)

}