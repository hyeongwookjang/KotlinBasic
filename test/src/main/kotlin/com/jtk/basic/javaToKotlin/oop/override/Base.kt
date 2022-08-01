package com.jtk.basic.javaToKotlin.oop.override

fun main() {
    Derived(300)
}


open class Base(open val number: Int = 100) {
    init {
        println("Base Class")
        println(number)
        // 여기 number 가 0 이된다. 따라서 생성자가 있는 쪽에는 open으로 하면 안된다.
    }
}


class Derived(
    override val number: Int
) : Base(number) {
    init{
        println("Derived Class")
    }
}