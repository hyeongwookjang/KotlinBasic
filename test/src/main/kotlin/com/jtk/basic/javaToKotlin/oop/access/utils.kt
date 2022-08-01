package com.jtk.basic.javaToKotlin.oop.access


// 접근제어
// default public
// protected 선언된 클래스와 하위에서만
// internal 같은 모듈끼리
// 같은 파일 내에서만 접근가능

private val a = 3

fun add(a: Int, b: Int): Int {
    return a + b
}

// 생성자에 접근제어자를 붙이려면 접근제어자 + constructor
class Cat private constructor()

