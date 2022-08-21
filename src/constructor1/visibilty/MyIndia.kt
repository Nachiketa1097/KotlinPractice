package constructor1.visibilty

import constructor1.visibilty.bbbb.Parent

internal class MyIndia {

    val myName:String = ""
    val age:Int=0
    fun multiply(a:Int, b:Int):Int{
        return a*b
    }
    fun shirt(){
        println("My shirt color is called BLUE")
        println("C =${Parent().c}")
    }
}

fun main() {
    val m = MyIndia()
    m.shirt()
}
