package com.jtk.basic.javaToKotlin.oop.classAndProperty


fun main() {
    Person()

}

//class Person constructor(name: String, age:Int){
//
////    여기서 String , Int 타입 생략가능
//    val name: String = name
//    var age: Int = age
//}

class Person(
    val name: String = "최태현",
    val age: Int = 1
) {
    val uppercaseName: String
        get() = this.name.uppercase()
//    생성자가 생성될 시점에 체크
    init {
        if (age <= 0) {
            throw IllegalArgumentException("나이는 ${age} 일 수 없습니다.")
        }
    println("초기화 블록")
    }
//  부생성자는 최종적으로 주 생성자를 호출한다.
//  본문은 역순으로 실행된다. 부생성자보다 default parameter 를 추천한다.
//  또는 정적 팩토리 메소드를 추천한다.

    constructor(name: String) : this(name, 1) {
        println("첫 번째 부생성자")
    }

    constructor() : this("홍길동") {
        println("두 번째 부생성자")
    }

    fun isAdult(): Boolean {
        return this.age >= 20
    }

//    커스텀 getter
    val isAdult2: Boolean
    get() { return this.age >= 20 }
//  하나의 경우 = == {return -- }

}
