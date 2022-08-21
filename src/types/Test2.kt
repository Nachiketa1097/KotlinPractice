package types

import InheritanceClass

class Test2 : InheritanceClass() {
}

fun main() {
    val t2 = Test2()
   val sum =  t2.add(4,5)
    println(sum)
}