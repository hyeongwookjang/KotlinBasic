package com.jtk.basic.javaToKotlin.oop.objectt

fun main() {
    println(Singleton.a)
}

class Person private constructor(
    var name: String,
    var age: Int
) {

    //동반객체에 이름도 붙이고 Log 붙여서 인터페이스 구현
    companion object Factory : Log {
        // const 를 붙이면 컴파일시 할당된다.
        private const val MIN_AGE = 1

        @JvmStatic
        fun newBaby(name: String): Person {
            return Person(name, MIN_AGE)
        }

        override fun log() {
            TODO("Not yet implemented")
        }

    }
}

object Singleton {
    var a: Int = 0
}