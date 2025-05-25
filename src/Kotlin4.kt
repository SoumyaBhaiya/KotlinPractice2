//creating a class

class Car(name:String, var model:String, var color:String, var doors:Int){

    var name = name.trim() //now this will trim any space.
    fun move(){
        println("The car $name is moving")
    }

    fun stop(){
        println("The car $name has stopped")
    }
}

class User(name:String, var lastName: String, var age:Int) {
    var name: String  //SEE VERY CAFEFULLY, IF YOU WANT TO REFER TO THIS NAME
    //U NEED NEED NEED TO USE this KEYWORD, otherwise it will refer to the
    // name in parameter


    init {
        if (name.lowercase().startsWith(prefix = "a")) {
            this.name = name
        } else {
            this.name = "User"
            println("Name doesn't start with letter 'a' or 'A' ")
        }
    }
}
class Person(var name: String, var lastName: String, var age: Int){
    constructor(name: String): this(name, "UserLastName", 0){
        println("2nd Constructor Is Used")
    }
    constructor(name:String, lastName: String): this("DefaultName", lastName, 19){
        println("Third Constructor is used")
    }

}
