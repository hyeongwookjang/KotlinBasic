package com.jtk.basic.javaToKotlin.coding.functionInKotlin

fun main() {
    repeat("fdfs")
//    repeat("fdfs, useNewLine = false)
//    useNewLine 을 지정해서 사용가능하다. builder를 쓰는 거같은 장점 가능
}


// default 를 = 으로 간단히 할 수 있다.
fun repeat(str: String, num: Int = 3, useNewLine: Boolean = true) {
    for (i in 1..num) {
        if (useNewLine) {
            println(str)
        } else {
            print(str)
        }
    }
}
