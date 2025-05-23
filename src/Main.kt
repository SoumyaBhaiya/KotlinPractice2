fun main() {
    val x = 150
    if(x > 90){
        println("x is greater than 90")
    }
    else if( x > 140){
        println("x is greater than 140")
    } else{
        print("NOpe")
    }
    // && is logical AND operator
    // || is logical OR operator.

    val isplaying = if(x==150) "Player is still playing" // you can even write else here. it doens't matter.
    else "Player is not playing"
    println(isplaying)

    val alarm = 8
    when{
        alarm == 12 || alarm == 24 -> {
            println("It's 12")
            println("Or it's 24")
        }
        alarm in 1.. 10 -> {
            println("Alarm is set between 1 to 10")
        }
        else -> {
            println("idk what time that is?")
        }

    // checking if a variable is not null:

    }

    var text: String? = "Name"
    if(text!=null){
        println(text.length)
    }else println("Text is null")

    //another way to check for null without using an if condition is
    text = null
    println(text?.length)
    // now let's say that you do wanna throw null pointer exception, so to throw that you can declare a string null and check
    // the length of that using !!, here's an example: println(text!!.length) <- this will throw the nullpointerexceptoin
    // !! this operator ask kotlin to throw exception if value is null otherwise just output the value
    val text2:String = text ?: "Some Text" //this is basically saying to assign text value to text2
    // if the variblae is not null, and if it is then we provided the value, in this case it was "Some Text
    println(text2)

    val maxi = getMax(20, 30)
    println(maxi)

}

//how to return a value to a function?

fun getMax(a:Int, b:Int): Int { //now see here, we have added another Int, it is saying that the return value will be int
    val max = if(a>b) a else b //if a is greater than b than assign a otherwise assign b
    return max //this will return the max, which is Int
}