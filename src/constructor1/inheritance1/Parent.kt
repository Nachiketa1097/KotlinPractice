package constructor1.inheritance1

open class Person(age:Int, name:String){
    open val age:Int = 0
    init {
        println("Age = $age \n Name = $name")
    }
   open fun personDetails(){
        println("I am in the parent class")
    }
    open fun add(a:Int, b:Int):Int{
        return a+b
    }
}

 class MathTeacher(age: Int, name: String): Person(age,name){
     override val age: Int = 55


    fun teachMath(){
        println("The teacher is teaching Math: ")
    }
     fun a(){
         super.personDetails()
     }
     override fun personDetails() {
         super.personDetails()
         println("I am in the child class")
     }
}
class FootballPlayer(age: Int, name: String): Person(age,name){
    fun playFootball(){
        println("Messi is a great player of Football")
    }

    override fun add(a: Int, b: Int): Int {
      //  return super.add(a, b)
        return a+b+10
    }
}

fun main() {
    val m = MathTeacher(23, "Nachiketa")
    m.teachMath()
    m.personDetails()
    m.a()
    println("open var age is equal to = ${m.age}")
    println("\n\nLine change\n\n")
    val f = FootballPlayer(58, "Arun")
    f.playFootball()
    println( f.add(10,20))
}