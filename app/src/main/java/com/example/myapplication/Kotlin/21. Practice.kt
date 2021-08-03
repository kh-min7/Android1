package com.example.myapplication.Kotlin

fun main(array: Array<String>){
    val channels = listOf<String>("K","M","S")
    val tv = TV(channels)
    tv.switch()
    println(tv.onOrOff)

    tv.channelUp()
    println(tv.checkCurrentChannel())
    tv.channelDown()
    println(tv.checkCurrentChannel())
}

class TV(val channels: List<String>){

    var onOrOff: Boolean = false // True -> On, False -> Off
    fun switch(){
        onOrOff = !onOrOff
    }

    var currentChannelNumber = 0
        // 중요 *****************************
        // set:  currentChannelNumber에 어떤 값을 할당할 때 호출
        set(value) {
            // ** 무한 루프 피하는 키워드 **
            field = value
            if (field > 2){
                field = 0
            }
            if (field < 0){
                field = 2
            }
        }
        // get: 어떤 값이 호출될 때 호출
        get(){
            println("호출되었습니다")
            return field
        }
        // 중요 *****************************
    // 값의 할당
    // a = b


    fun channelUp(){
        currentChannelNumber += 1
        // 비효율적
//        channels.forEachIndexed{index, value->
//            if(currentChannelNumber == index){
//                currentChannelNumber += 1
//                return
//            }
//        }
    }

    fun checkCurrentChannel(): String{
        return channels[currentChannelNumber]

    }

    fun channelDown(){
        currentChannelNumber -= 1
        // 비효율적
//        channels.forEachIndexed{index, value->
//            if(currentChannelNumber == index){
//                currentChannelNumber -= 1
//                return
//            }
//        }
    }
}