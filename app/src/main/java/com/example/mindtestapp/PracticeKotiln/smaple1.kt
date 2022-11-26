package com.example.mindtestapp

import java.util.*

fun main(){
    /*
    example()
    println(add(4,6))
    */
    nullcheck()
    ignoreNulls("hyunwoo")

}

//1. 함수 작성
fun example() : Unit { // <- return 값이 없는 경우 : Unit 줄 필요 없음
     println("hello World!")
}

fun add(a : Int, b : Int) : Int{ //<- return 하는 경우 리턴 값 형 줘야함
    return a+b
}

//2. val, var
// val = value  = from flutter is const (고정값, 상수)
// var (유동적인 값, 변수)
fun ValVar(){
    val a : Int = 10
    var b : Int = 9 // = var b = 9
    // a = 100 정의시 에러
    // b = 100 정의시 재정의 가능
    var name : String = "hyunwoo" // var name = "hyunwoo"
}
//3. String Template
fun StringTemplate (){
    val name = "hyunwoo"
    val lastname = "Lim"
    println("my name is ${name + lastname} I'm 25")
    println("Is this true? ${1==0}")
    println("I have 2\$and 4$")
}

//4. 조건식 (if)
fun IF(a: Int, b : Int): Int{
    if (a>b){
        return a
    }
    else return b
}
//Kotlin 은 3항연산자가 없음 대신 이렇게
fun IF2(a: Int, b:Int) : Int = if(a>b) a else b

fun checkNum(score : Int){
    when(score){
        0 -> println("this is 0")
        1 -> println("this is 1")
        2,3 -> println("this is 2or 3")
        else -> println("i don't know")
    }
    var b:Int = when(score){
        1 -> 1
        2 -> 2
        else -> 3
    }
    println("b : ${b}")

    when(score){
        in 90..100 -> println("Excellent")
        in 10..80 -> println("good")
        else -> println("okay")
    }
}
// Expression vs Statement

//5. Array & List [List(수정불가) MutableList(수정가능)]
fun array(){
    val array:Array<Int> = arrayOf(1,2,3)
    val list:List<Int> = listOf(1,2,3)

    val array2:Array<Any> = arrayOf(1,"d",3.4f)
    val list2:List<Any> = listOf(1,"d",11L)

    array[0] = 3
    //list[0] = 2 <-주소값을 가져오고 읽기만 가능 변경시 오류류
    var result =list.get(0)
    var arrayList = arrayListOf<Int>()
    arrayList.add(10)
    arrayList.add(20)
}

//6. for while

fun forAndWhile(){
    val student = arrayListOf("hyunwoo","gajin","heungmin","Uijo")

    for (name in student){
        println("${name}")
    }
    for((index , name) in student.withIndex()){
        println("${index+1}번째 학생 : ${name}")
    }

    var sum :Int =0
    for (i in 1..10){
        sum += i
    }
    /*for (i in 1..10 step 2){
        sum += i
    }
    for (i in 10 downTo 1){
        sum += i
    }
    for (i in 1 until 100){ // 1~99
        sum += i
    }*/
    println(sum)

    var index = 0
    while (index <10){
        println("current Index ${index}")
        index++
    }
}
//7. Nullable , NonNull

fun nullcheck() {
    //NPE : Null pointer Exception
    var name = "hyunwoo" //nonnull 타입 생략 가능
    var nullName: String? = null //nullable 타입 생략 X

    var nameInUpperCase = name.uppercase(Locale.getDefault())
    var nullNameInUpperCase = nullName?.uppercase(Locale.getDefault())

    println(nameInUpperCase)
    println(nullNameInUpperCase)

    // ?: 엘비스  연산자
    val lastName : String? = null
    val fullName = name+ " "+ (lastName?: "'No lastName'")
    println(fullName)



}
// !! 연산자 null 아니라고 알려줌
fun ignoreNulls(str : String?){
    val mNotNull : String = str!!
    val upper = mNotNull.uppercase(Locale.getDefault())
    println(upper)

    //let 함수 자신의 리시버 객체를 람다식 내부로 옮겨서 실행
    val email : String? = "imhw1997@naver.com"
    email?.let {
        println("my email is ${email}")
    }
}