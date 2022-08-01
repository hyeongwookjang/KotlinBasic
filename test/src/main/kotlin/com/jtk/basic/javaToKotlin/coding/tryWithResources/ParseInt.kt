package com.jtk.basic.javaToKotlin.coding.tryWithResources
fun parseIntOrThrow(str: String): Int {
    try {
        return str.toInt()
    } catch (e: NumberFormatException) {
        throw java.lang.IllegalArgumentException("주어진 ${str}는 숫자가 아닙니다.")
    }
}

fun parseIntOrThrowV2(str: String): Int? {
    try {
        return str.toInt()
    } catch (e: NumberFormatException) {
        return null
    }
}

// TRF 구문을 Expression 으로 간주하기에 return 한번에 묶을 수 있다.

fun parseIntOrThrowV3(str: String): Int? {
    return try {
        str.toInt()
    } catch (e: NumberFormatException) {
        null
    }
}





