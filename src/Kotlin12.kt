// see about Data Class

//this is about interfaces


fun main(){

}

interface Engine {
    fun startEngine()
}

class Ccar(val name: String, val color: String): Engine{
    override fun startEngine() {
        println("The car is starting the engine")
    }
}

class Truck(val name: String, val color: String): Engine{
    override fun startEngine() {
        println("The Truck is starting the engine")
    }
}

class Planne(val name: String, val color: String): Engine{
    override fun startEngine() {
        println("The plane is starting the engine")
    }
}