package constructor1.gettersetter

class Abb {
    var name:String = "kamal"
    //getter
    get() = field
    //setter
    set(value) {
        field=if (value.isNotEmpty())
            "Shivam"
              else
              value
    }
}

fun main(){
    val a = Abb()
    a.name = null.toString()
    println(a.name)
}