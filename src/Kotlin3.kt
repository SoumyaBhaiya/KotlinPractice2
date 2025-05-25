fun main(){
    val car1 = Car("         Tesla", "S Plaid", "Red", 4)
    val car2 = Car("Boo", "Boo1", "Pink", 2)



    println("Name = ${car1.name}")
    println("Model = ${car1.model}")
    println("Color = ${car1.color}")
    println("Doors = ${car1.doors}")


    car1.move()
    car1.stop()

    car2.move()
    car2.stop()

    println("\n")
    val user = User("Alexaa", "Po", 20)
    val user2 = User("Booh", "Byee", 19)
    println("Name for user1: ${user.name}, Name for user2: ${user2.name}")


    val person = Person("hi")
    val person2 = Person("boo", "ty")

    println("${person.name}, ${person.lastName}, ${person.age}")
    println("${person2.name}, ${person2.lastName}, ${person2.age}")
}
//moving all the classes to Kotlin4