package com.example.myapplication.Kotlin

//fun main(array:Array<String>) {
//
//    val calculator: Calculator = Calculator()
//    calculator.plus(15.0, 30.0)
//}

class Calculator(){

    init{
        println("계산을 시작합니다")
    }

    fun plus(a: Double, b: Double){
        println("$a + $b = ${a+b}")
    }

    fun subtraction(a: Double, b: Double){
        println("$a - $b = ${a-b}")
    }

    fun multiply(a: Double, b: Double){
        println("$a * $b = ${a*b}")
    }

    fun divide(a: Double, b: Double){
        println("$a / $b = ${a/b}")
    }
}

// 강사 해설

fun main(array: Array<String>){
    val calculator1 = Calculator1()
    println(calculator1.plus(4, 5))

    val calculator2 = Calculator2()
    println(calculator2.plus(1, 2, 3, 4, 5))

    val calculator3 = Calculator3(3)
    calculator3.plus(5).minus(5)
    // --------/ Calculator3(3)
    // ----------------------/ Calculator3(8)
    // ---------------------------------------/ Calculator3(8).minus(5)
    // -> Chaining(체이닝)
}

// 가장 쉬운 방법
class Calculator1(){
    fun plus(a:Int, b: Int): Int{
        return a + b
    }

    fun minus(a:Int, b:Int): Int{
        // 먼저 들어온 수에서 뒤에 들어온 수를 뺀다
        return a - b
    }

    fun multiply(a:Int, b:Int):Int{
        return a * b
    }

    fun divide(a:Int, b:Int): Int{
        // 먼저 들어온 수에서 뒤에 들어온 수를 뺀다
        // 리턴은 몫만 한다
        return a / b
    }
}

class Calculator2(){
    fun plus(vararg numbers: Int): Int{
        var result: Int = 0
        numbers.forEach {it -> Int
        result += it
        }
        return result
    }

    fun minus(vararg numbers:Int): Int{
        // 10 - 1 - 2- 3
        // 0 - 10 - 1 - 2 - 3
        var result: Int = numbers[0]
        for (i in 0 until numbers.size){
            if (i != 0){
                result -= numbers[i]
            }
        }
        return result
    }

    fun multiply(vararg numbers:Int): Int{
        var result: Int = 1
        numbers.forEach {it -> Int
        if (it != 0){
            result *= it
        }
        }
        return result
    }

    fun divide(vararg numbers: Int): Int { // 10, 2, 3 -> 10/2/3
        var result: Int = numbers[0] // 10
        numbers.forEachIndexed {index, value ->
            //10 -> 10/10/2/3

            if (index != 0) {
                if (value != 0) {
                    result /= value
                }
            }
        }
        return result
    }
}

class Calculator3(val initialValue: Int){

    fun plus(number: Int): Calculator3{
        val result = this.initialValue + number
        return Calculator3(result)
    }

    fun minus(number: Int): Calculator3{
        val result = this.initialValue - number
        return Calculator3(result)
    }

    fun multiply(number: Int): Calculator3{
        val result = this.initialValue * number
        return Calculator3(result)
    }

    fun divide(number: Int): Calculator3{
        val result = this.initialValue / number
        return Calculator3(result)
    }

}

