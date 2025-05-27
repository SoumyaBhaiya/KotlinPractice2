//Working with enums

fun main(){
   for(direction in Direction.values()){
       println(direction)
   }
    println(Direction.NORTH.distance)
    println(Direction.NORTH.direction)
    println(Direction.NORTH.name)
    println(Direction.NORTH.ordinal)

    Direction.WEST.printData()

    val direction = Direction.NORTH
    val dirrection = Direction.valueOf("WEST")

    when(direction){
        Direction.NORTH -> println("It's north")
        Direction.WEST -> println("It's west")
        Direction.EAST -> println("It's east")
        Direction.SOUTH -> println("It's south")
    }
    println("-------------------------\n ${dirrection.distance}")
}

enum class Direction (var direction: String, var distance:Int){
    NORTH("north", 10),
    SOUTH("north", 10),
    EAST("north", 10),
    WEST("north", 10);

    fun printData() {
        println("Direction = $direction and Distance = $distance")
    }
}