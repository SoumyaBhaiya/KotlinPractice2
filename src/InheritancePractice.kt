fun main(){
    val animal1 = Dog("Labrador")
    animal1.sound()
    println(animal1.type)
    println(animal1.legs)
    animal1.walk()
    animal1.stop()
}

open class Animal(var legs:Int, var type: String) {
    init {
        println("You chose this animal.")
    }

    open fun sound() {}

    open fun walk() {}

    open fun run() {}

    open fun stop() {
        println("$type stopped")
    }
}

class Dog(var breed:String): Animal(4, "Dog"){
    override fun sound() {
        println("The Dog says bark!")
        super.sound()
    }

    override fun walk() {
        println("Dog is walking")
        super.walk()
    }

    override fun run() {
        println("Dog is running")
        super.run()
    }

    override fun stop() {
        super.stop()
    }
}

class Cat(var breed:String): Animal(4, "Cat") {
    override fun sound() {
        println("The Cat says meow!")
        super.sound()
    }
    override fun walk() {
        println("Cat is walking")
        super.walk()
    }

    override fun run() {
        println("Cat is running")
        super.run()
    }

    override fun stop() {
        super.stop()
    }
}