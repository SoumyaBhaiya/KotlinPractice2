fun main(){
    val success = Result.Success("Success")
    val error = Result.Error("Failed")

    getData(error)
}



fun getData(result: Result){
    when(result){
        is Result.Error -> result.showMessage()
        is Result.Success -> result.showMessage()
    }
}

sealed class Result(val message: String){
    fun showMessage(){
        println("Result: $message")
    }
    class Success(message: String):Result(message)
    class Error(message: String):Result(message)
}




abstract class Vehiclee{
    abstract fun move()

    abstract fun stop()
}

class Caar(var name: String, var color: String, val engines: Int, val doors: Int): Vehiclee(){
    override fun move() {
        println(".. sa")
    }

    override fun stop() {
        println(".. as")
    }
}


// FOR ABSTRACT CLASS, THE API IS GONNA DO THE  HARD WORK, BASED ON WHAT YOUR FUNCTION IS DOING AND WILL
// GENERATE STUFF FOR YOU. SEE MORE ON WEB.