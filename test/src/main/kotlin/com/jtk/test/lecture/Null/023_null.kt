package com.jtk.test.lecture


fun main() {
    val person = Person("공부하는 개발자", 3)
    startsWithA(person.name)
}

fun startsWithA(str: String): Boolean {
    return str.startsWith("A")
}