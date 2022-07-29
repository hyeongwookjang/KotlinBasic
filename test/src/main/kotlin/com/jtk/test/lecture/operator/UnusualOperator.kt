package com.jtk.test.lecture.operator

fun main() {

    if (fun1() && fun2()) {
        println("본문")
    }

    if (fun1() || fun2()) {
        println("본문")
    }
}

fun fun1(): Boolean {
    println("fun 1")
    return true
}

fun fun2(): Boolean {
    println("fun 2")
    return true
}