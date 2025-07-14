// Inheritance
fun main() {
    val car = Carr("BMW", "Blue", 2, 4)
    val plane = Plane("Boenig", "BLUE and White", 4, 4)
    car.move()
    plane.move()
    plane.stop()
    car.stop()


    val view = View()
    val button = Button("Login", "Center")
    val roundButton = RoundButton("Sign up", "Center", 10)
    roundButton.draw()
    
}


open class Vehicle(val name: String, val color: String){
    open fun move(){
        println("$name is moving")
    }
    open fun stop(){
        println("$name has stopped")
    }
}
// notice the two classes below, we had repetative val, naem and color so we removed them
// so we removed them and added them in the class vehicle

class Carr(name:String, color:String, val engines: Int, val doors:Int): Vehicle(name, color){
}

class Plane(name:String, color:String, val engines: Int, val doors:Int): Vehicle(name,color) {
    override fun move() {
        flying()
        super.move() // super means call something from our base class
    }

    fun flying(){
        println("The plane is flying")
    }

}


open class View() {
    open fun draw(){
        println("Drawing the view")
    }
}

open class Button(val text: String, val orientation: String): View(){
    override fun draw() {
        println("Drawing the Button")
        super.draw()
    }
}

class RoundButton(text: String, orientation: String, val corners: Int): Button(text, orientation){

    override fun draw() {
        println("Drawing the round button.")
        super.draw()
    }
}