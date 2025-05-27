fun main(){
    val somuAccount = Account("Alex")
    somuAccount.deposit(1000)
    somuAccount.withdraw(500)
    somuAccount.deposit(10000)
    somuAccount.withdraw(3343)

    val balance = somuAccount.calculateBalance()
    println("Balance is $balance")

    // somuAccount.balance = 1000 //uncomment this and see the error. 
}




class Account(val accountName: String){
    private var balance = 0
    private var transactions = mutableListOf<Int>()

    fun deposit(amount: Int){
        if(amount>0){
            transactions.add(amount)
            balance += amount
            println("$amount deposited. Balance is now ${this.balance}")

        }else{
            println("Cannot deposit negative sums")
        }
    }

    fun withdraw(withdrawal:Int){
        if(-withdrawal<0){
            transactions.add(-withdrawal)
            this.balance += -withdrawal
            println("$withdrawal deposited. Balance is now ${this.balance}")
        }else{
            println("Cannot withdraw negative sums")
        }
    }

    fun calculateBalance():Int {
        this.balance = 0
        for(transaction in transactions){
            this.balance += transaction
        }
        return this.balance
    }
}