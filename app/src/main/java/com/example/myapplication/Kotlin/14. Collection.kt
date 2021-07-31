package com.example.myapplication.Kotlin

// 14. Collection
// -> list, set, map

// List

fun main(args:Array<String>){

    // Immutable Collections (변경 불가능)
    // List -> 중복을 허용한다
    val numberList = listOf<Int>(1, 2, 3, 3, 3)
    println(numberList.get(0))
    println(numberList[0])

    // Set -> 중복을 허용하지 않는다
    // -> 순서가 없어서 전체만 불러오기 가능
    val numberSet = setOf<Int>(1, 2, 3, 3, 3)
    println()
    numberSet.forEach{it ->
        println(it)
    }


    // Map -> key-value 방식으로 관리한다
    val numberMap = mapOf<String, Int>("one" to 1, "two" to 2)
    println()
    println(numberMap.get("one"))
    println(numberMap["one"])


    println()


    // Mutable Collections (변경 가능)
    val mnumberList = mutableListOf<Int>(1, 2, 3)
    mnumberList.add(3, 4)
    println(mnumberList)

    val mnumberSet = mutableSetOf<Int>(1, 2, 3, 4, 4, 4)
    mnumberSet.add(10)
    println(mnumberSet)

    val mnumberMap = mutableMapOf<String, Int>("one" to 1)
    mnumberMap.put("two", 2)
    println(mnumberMap)


}