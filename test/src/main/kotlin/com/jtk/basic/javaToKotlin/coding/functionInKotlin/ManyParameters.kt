package com.jtk.basic.javaToKotlin.coding.functionInKotlin

fun main() {
    printAll("A", "B", "C")

    val array = arrayOf("A", "B", "C")
    printAll(*array)
}

fun printAll(vararg strings: String) {
    for (str in strings) {
        println(str)
    }
}