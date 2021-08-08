package com.example.myapplication.Kotlin

// 23. 접근 제어자

fun main(array: Array<String>){

    val testAccess: TestAccess = TestAccess("아무개")

    // private 키워드 때문에 외부에서 더 이상 사용할 수 없다.
//    testAccess.test()
//    println(testAccess.name)
//    testAccess.name = "아무개2"
//    println(testAccess.name)

    val reward: Reward = Reward()
    reward.rewardAmount = 2000

    val runningCar: RunningCar = RunningCar()
    runningCar.runFast()
//    runningCar.run()
}

class Reward(){
    var rewardAmount: Int = 1000
}

class TestAccess{
    // 클래스 외부에서 사용하지 못하게
    private var name: String = "홍길동"

    constructor(name: String){
        this.name = name
    }

    fun changeName(newName: String){
        this.name = newName
    }

    private fun test(){
        println("테스트")
    }
}

class RunningCar(){

    fun runFast(){
        run()
    }
    // 외부에 공개하고 싶지 않은 기능
    private fun run(){

    }
}