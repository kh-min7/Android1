package com.example.myapplication.Kotlin

//fun main(array: Array<String>) {
//    first()
//    second(80)
//    third(52)
//    gugudan()
//}
//
//fun first(){
//    val first_list = mutableListOf<Int>()
//    val second_list = mutableListOf<Boolean>()
//
//    for (i in 0..9){
//        first_list.add(i)
//    }
//
//    for (i in 0..9){
//        if (first_list[i] % 2 == 0){
//            second_list.add(first_list[i] % 2 == 0)
//        }else{
//            second_list.add(first_list[i] % 2 == 0)
//        }
//    }
//
//    println(first_list)
//    println(second_list)
//}
//
//fun second(a: Int){
//    when(a){
//        in 80..90 -> println("A")
//        in 70..79 -> println("B")
//        in 60..69 -> println("C")
//        in 0..59 -> println("F")
//
//    }
//}
//
//fun third(a:Int){
//    val T = a/10
//    val t = a%10
//    println(T+t)
//}
//
//fun gugudan(){
//    for (i in 1..9){
//        for (j in 1..9){
//            val ans = i*j
//            println("$i * $j = $ans")
//        }
//    }
//}

// 강사 해설

fun main(array: Array<String>) {
    first()
    println(second(80))
    println(third(52))
    gugudan()
}

fun first(){
    val list1 = MutableList(9, {0})
    val list2 = MutableList(9, {true})

    for (i in 0..8){
        list1[i] = i + 1
    }

    println(list1)

    list1.forEachIndexed{index, value->
        if (value % 2 == 0){
            // 짝수
            list2[index] = true
        }else{
            // 홀수
            list2[index] = false
        }
    }
    println(list2)
}

fun second(score: Int): String{
    when(score){
        in 80..90 -> return "A"
        in 70..79 -> return "B"
        in 60..69 -> return "C"
        else -> return "F"
    }
}

fun third(number: Int): Int{
    val a: Int = number / 10
    val b: Int = number % 10

    return a + b
}

fun gugudan(){
    for (x in 1..9){
        for (y in 1..9){
            println("$x * $y = ${x*y}")
        }
    }
}