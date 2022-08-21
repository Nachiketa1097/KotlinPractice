package constructor1.seondaryconstructor

open class Parent {
    constructor(name:String, id:Int){
        println("First \n $name $id")
    }
    constructor(name: String):this(name,85){
        println("Second \n $name")
    }
}

class Child:Parent{
    constructor(school:String):super("Kamal singh"){
        println("Third Child class \n $school")
    }
    constructor(marks:Int):this("Primary School"){
        println("Forth Child class \n $marks")
    }
}

fun main() {
    val c = Child(700)
}