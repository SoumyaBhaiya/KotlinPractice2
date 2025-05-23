fun main(){
    var number = 0

    outerr@ while (number < 5){
        number++
        println(number)

        var i = 0

        while (i < 5){
            if (i==0) break@outerr //see here we gave a name
            //as to which of the loop we wanna break
            i++
            println("this is $i")
        }
    }

    var initial_number = 0
    var range = 40
    var total_count = 0

    while(initial_number <= range){
        initial_number++
        if(!is_even(initial_number)){
            continue
        }
        total_count++
        println(initial_number)

    }
    println("$total_count is total count")
}


fun is_even(number: Int): Boolean{
    if((number % 2) ==0){
        return true
    }else
        return false
}
