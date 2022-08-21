 open class InheritanceClass {
     fun add(a:Int, b:Int) : Int{
        return a+b;
    }
}
private class Test : InheritanceClass(){
    final val x = 10
    fun multiply(a:Int, b:Int) : Int{
        return a*b;
    }
}

fun main() {
    val t = Test()
    val sum = t.add(4,5)
    val multiply = t.multiply(7,8)
    println(sum)
    println(multiply)
}