// Understanding Lazy Initializaition

fun main(){
    val user1 = Userr("Alex", "lastName", 19)
    val user2 by lazy {
        Userr("Booh", "ty", 20)
    } // with the by lazy, it would only be initialized when we actually acess the username
    println("Accessing the username of user2 now....")
    println(user2.firstName) //if you comment this, then user2 won't be  created
}



class Userr(val firstName:String, val lastName:String, val age:Int){
    init {
        println("$firstName$lastName is the UserName now, and your age is $age")
    }
}