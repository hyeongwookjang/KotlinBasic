package com.jtk.basic.javaToKotlin.coding.functionInKotlin

fun main() {

}

fun max(a:Int, b: Int): Int {
    return if (a > b) {
        a
    } else {
        b
    }
}

fun max2(a:Int, b: Int) =
     if (a > b)
        a
     else
        b
