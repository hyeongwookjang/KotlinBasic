package com.jtk.basic.javaToKotlin.functionalProgramming.functions

fun main() {

    val str = "ABC"
    println(str.lastChar())
}

fun String.lastChar(): Char {
    return this[this.length -1]
}