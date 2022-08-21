package constructor1.primaryconstructor.VarValConstructr

//In the example below, the parameter must be a property (var or val) because it is used in a method:
class A(val number: Int) {
    fun foo() = number
}
//In this other example, the parameter is only used to initialize the class, so it does not need to be a property:

class B(val number: Int) {
    init {
        System.out.println("number: $number")
    }
}