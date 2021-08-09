package com.example.myapplication.Kotlin

// 두 번까지는 봐준다
// 두 번 이상이 넘어가면 리팩토링 해라

// 25. Inherit
// 부모로부터 설명서를 물려받는다


fun main(args: Array<String>){
    val superCar100: SuperCar100 = SuperCar100()
    superCar100.drive()
    superCar100.stop()

//    val bus100: Bus100 = Bus100()
//    bus100.drive()

}

// 부모 : Car100
// 자식 : SuperCar100, Bus100

open class Car100(){
    open fun drive(){
        println("달린다")
    }

    fun stop(){

    }
}

class SuperCar100(): Car100(){
    override fun drive() {
        println("빨리 달린다")
//        super.drive()
    }
}

class Bus100(): Car100(){

}