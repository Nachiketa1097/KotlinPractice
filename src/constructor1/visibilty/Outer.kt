package constructor1.visibilty

internal class Outer {
   internal val myName:String = ""
    val age:Int=0
    fun add(a:Int, b:Int):Int{
        return a+b
    }
    fun display(){
        println("This is display method")
    }
}

class AaOuter{
    internal val o = Outer()

}