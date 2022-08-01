package com.jtk.basic.javaToKotlin.coding.conditionStatement.ifLoop

fun startsWithA(obj: Any): Boolean {
    return when (obj) {
        is String -> obj.startsWith("A")
        else -> false
    }
}