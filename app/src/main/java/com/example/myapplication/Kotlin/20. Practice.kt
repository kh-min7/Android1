package com.example.myapplication.Kotlin

//fun main(array: Array<String>){
//    val account = Account("민경호", "000705", 100)
//    println(account.checkBalance())
//    account.withdraw(110)
//    account.withdraw(90)
//    account.deposit(100)
//}
//
//class Account(val name: String, val birth: String, var balance: Int){
//
//    fun checkBalance(): Int{
//        return balance
//    }
//
//    fun withdraw(amount: Int){
//        if (amount > balance){
//            println("잔액이 부족합니다.")
//        }else{
//            println("${balance-amount}")
//            balance -= amount
//
//        }
//    }
//
//    fun deposit(amount: Int){
//        println(balance + amount)
//    }
//}

// 강사 해설

fun main(array: Array<String>){
    val account: Account = Account("홍길동", "1990/3/1", 1000)
    println(account.checkBalance())
    println(account.save(1000))
    println(account.withdraw(2000))
    println(account.checkBalance())

    println()
    val account2 = Account("홍길동", "1990/3/1", -2000)
    println(account2.checkBalance())


    val account3 = Account2("홍길동", "1990/3/1")
    println(account3.checkBalance())

}

class Account{

    val name: String
    val birth: String
    var balance: Int

    constructor(name: String, birth: String, balance: Int) {
        this.name = name
        this.birth = birth
        if (balance >= 0){
            this.balance = balance
        }else{
            this.balance = 0
        }
    }


    fun checkBalance(): Int{
        return balance
    }

    fun withdraw(amount: Int): Boolean{
        if (balance >= amount){
            balance -= amount
            return true
        }else{
            return false
        }
    }

    fun save(amount: Int) {
        balance += amount
    }
}

class Account2(val name: String, val birth: String, var balance: Int = 1000){
    fun checkBalance(): Int{
        return balance
    }

    fun withdraw(amount: Int): Boolean{
        if (balance >= amount){
            balance -= amount
            return true
        }else{
            return false
        }
    }

    fun save(amount: Int) {
        balance += amount
    }
}

class Account3(initialBalance: Int){

    val balance: Int = if(initialBalance >= 0) initialBalance else 0


    fun checkBalance(): Int{
        return balance
    }
}