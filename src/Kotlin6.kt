// Understanding Singleton

fun main(){

    val instance: Database? = Database.getInstance()
    println(instance)
}


class Database private constructor(){ //NO ONE CAN USE DATABASE() FROM OUTSIDE
    companion object {
        private var instance: Database? = null      //Declaring varible to hold instance

        fun getInstance(): Database?{   //creating function to get instance
            if(instance == null){ //if it doesn't exist, create it.
                instance = Database() //calling class inside since it can't be called outside
            }
            //returning the one and only instance
            return instance
        }
    }

}