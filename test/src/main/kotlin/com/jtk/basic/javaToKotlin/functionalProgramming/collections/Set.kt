package com.jtk.basic.javaToKotlin.functionalProgramming.collections


fun main()  {

    val numbers = setOf(100, 200)

    for (number in numbers) {
        println(number)
    }

    for ((index, number) in numbers.withIndex()) {
        println("$index $number")
    }
}
