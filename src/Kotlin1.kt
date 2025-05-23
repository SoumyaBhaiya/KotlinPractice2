fun main() {
    var result = sum(4, 5, 4, 4, 4,193942349, 4, 4, 4,4 ,4)
    println(result)

    result = multiply(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    println(result)

    //reverse count
    for(i in 10 downTo 1){
        println(i)
    }
    // another example of count
    for( i in 1 until 10 step 2){
        print("$i ")
    }
}

//NOTE FOR A 'FOR' LOOP, YOU DON'T NEED TO USE .. EVERYTIME, YOU CAN ALSO USE 'until'. THIS WILL EXCLUDE THE LAST NUMBER
// trying vararg here.

fun sum(vararg numbers: Int): Int{ //if i don't define the int after the round bracket, then kotlin would give the
    //default type as Unit, not int and it will throw an error
    var result = 0
    for(number in numbers){
        result = result + number
    }
    return result
}

fun multiply(vararg numbers: Int):Int {
    var result = 1
    numbers.forEach {number ->
        result = result * number
    }
    return result
}

