package constructor1.abstract1

abstract class Person(name: String) {

    abstract val myName:String

    init {
        println("My name is $name.")
    }

    open fun display(a: Int) {
        println("Display method in class $a.")
    }

    abstract fun displayJob(description: String)
}

class Teacher(name: String): Person(name) {

    override fun displayJob(description: String) {
        println(description)
    }

    override val myName: String ="Sourabh singh chauhan"

    override fun display(a: Int) {
        println("Display method in Subclass $a \n")
        super.display(a)
        println(myName)
    }
}

fun main() {
    val t = Teacher("Kamal Singh")
    t.displayJob("I'm a mathematics teacher.")
    t.display(149)
}