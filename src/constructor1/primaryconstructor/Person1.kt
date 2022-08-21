package constructor1.primaryconstructor

class Person1(val firstName:String,val age:Int) {
    val _firstName:String
    val _age:Int

    init {
        _firstName = firstName
        _age = age
        println("First Name = $_firstName")
        println("My Age = $_age")
    }
}
fun main(){
    val person = Person1("Shivam",25)
    println(person.hashCode())
    println(person.age)
    println(person.firstName)
    println(person._age)
    println(person._firstName)
}