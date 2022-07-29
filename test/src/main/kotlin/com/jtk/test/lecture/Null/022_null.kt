package com.jtk.test.lecture

fun main() {
    println(startsWith(null))
}


// 널이 절대 들어올 떄 변수!!
fun startsWith(str: String?): Boolean {
    return str!!.startsWith("A")
}