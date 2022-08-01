package com.jtk.basic.javaToKotlin.naming.kotlinType

fun main() {
    val number1 =3
    val number2: Long = number1.toLong()

    val number3: Int? = 3
    val number4: Long = number3?.toLong() ?:0L
}

var a :Byte = 127 // +-128
var b :Short = 32767 // +- 32768
var c :Int = 1234567890 // 10자리
var d :Long = 1234567890123456789L // 19자리
var e :Float = 6.123123f
var f :Double = 73232.3232312321