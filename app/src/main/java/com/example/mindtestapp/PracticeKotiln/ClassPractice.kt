package com.example.mindtestapp

/*상속을 위해서 kotlin은 class 에 open 을 사용*/
open class Human (val name: String = "Anonymous"/*<- 디폴트값*/ ) {

    constructor(name: String, age :Int): this(name)/*상속*/{
        println("my name is ${name}, ${age}years old")
    }

    init { //<- 주생성자 (제일 먼저 실행)
        println("New human has been born!!")
    }
    fun eatingCake(){
        println("this is so Yummmmyyyy")
    }
    open fun singAsong(){
        println("lalala")
    }
}
//상속
class Korean : Human(){
    override fun singAsong(){
        super.singAsong()
        println("랄랄라")
        println("my name is ${name}")
    }
}

fun main(){
   /* val human = Human("hyunwoo")
    val stranger = Human()
    human.eatingCake()*/

    val mom = Human("jungmi",54)
   // println("this human's name is ${stranger.name}")
    val korean =Korean()
    korean.singAsong()
}