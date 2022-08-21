package constructor1.primaryconstructor

import constructor1.visibilty.bbbb.Parent

class Person(val firstName : String = "kamal", var age : Int=18) {

}

fun main() {
    val person = Person("Nachiketa",23)
    val person1 = Person()
    println("First Name = ${person.firstName}")
    println("My Age = ${person.age}")
    println("First Name with default value = ${person1.firstName}")
    println("My Age with default value= ${person1.age}")
}