package com.example.mindtestapp

//1. lamda
// 람다식은 마치 value처럼 다룰수 있는 익명 함수
// 1) method에 파라미터로 넘겨줄 수 있다 ex) fun maxBy(a: Int)
// 2) return 값으로 사용 가능

// 람다 기본 정의
// vla lamdaName : Type = { (a:Int같은 파라미터)argumentList -> codeBody}
val square : (Int) -> (Int)= {number -> number*number}
val nameAge = {name : String, age:Int ->
    "my name is ${name} I'm${age}"
}
fun main(){
    println(nameAge("hyunwoo",23))
    val a = "hyunwoo said "
    val b = "android said "
    println(a.pizzaIsGreat())
    println(b.pizzaIsGreat())
    println(extendString("hyunwoo",26))
    println(calculateGrade(971))

    val lamda = {number : Double ->
        number == 4.3213
    }
    println(invokeLamda(lamda))
    println(invokeLamda({it>3.22}))

    println(invokeLamda { it > 3.22 })
}

// 확장함수
val pizzaIsGreat : String.() -> String ={
    this + "pizza is the best!"
}
fun extendString(name : String, age:Int) : String{
    val introduceMySelf : String.(Int) -> String = {"i'm ${this} and ${it} years old"}
    return name.introduceMySelf(age)
}

// 람다의 리턴
val calculateGrade : (Int) -> String ={
    when(it){
        in 0..40 -> "fail"
        in 41..70 -> "pass"
        in 71..100 -> "perfect"
        else ->"error"
    }
}

// 람다를 표현하는 여러가지 방법
fun invokeLamda(lamda : (Double)-> Boolean) : Boolean{
    return lamda(5.2345)
}
