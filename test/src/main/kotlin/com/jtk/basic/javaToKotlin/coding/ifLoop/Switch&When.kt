package com.jtk.basic.javaToKotlin.coding.ifLoop

fun getGradeWithSwitch(score: Int): String {
    return when (score/10) {
        9 -> "A"
        8 -> "B"
        7 -> "C"
        else -> "D"
    }

}

fun getGradeWithIn(score: Int): String {
    return when (score) {
        in 90..99 -> "A"
        in 80..89 -> "B"
        in 70..79 -> "C"
        else -> "D"
    }

}