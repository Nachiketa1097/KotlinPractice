package constructor1.visibilty.bbbb

open class Parent {
    private val a =10
    protected val b =20
    internal val c =20
    val d=3444 //By default, public
    fun display(){
        println("A = $a")
    }
}

class Child : Parent(){
    fun show(){
        println("B = $b")
        println("C = $c")
        println("D = $d")
    }
}

fun main() {
    val c = Child()
    c.show()
    c.display()
}