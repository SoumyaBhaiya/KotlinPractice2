// Getting started with getters and setters. Now getters and setters are used to modify the variables.
// read and change variables
/*
    The most basic getter and setter (default is)

    get() = field
    set(value){
    field = value
    }


Getter: What to do when someone says "Show me the value."

Setter: What to do when someone says "Change the value."

 */

// Example

class Backpack {
    var toy: String = "Teddy Bear"
        get() = field
        set(value){
            if(field != "Cute"){
                println("Gotchaa Baby!")
            }
            field = value
        }

}

fun main(){
    val viewToy = Backpack()


    viewToy.toy = "Casdf"
    println(viewToy.toy)
}
