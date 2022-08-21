package constructor1.visibilty.bbbb

class Parent2 {
    fun show(){
        println("c = ${Parent().c}")
    }
}

fun main() {
    val p2 = Parent2()
    p2.show()
}