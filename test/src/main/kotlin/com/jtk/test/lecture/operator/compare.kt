package com.jtk.test.lecture.operator

fun main() {

    val money1 = 2_000L
    val money2 = 2_000L

    if (money1 > money2) {
        println("money1이 money2보다 금액이 큽니다.")
    }

    if (money1 == money2) {
        println("money1과 money가 동등한 값입니다..")
    }

    if (money1 === money2) {
        println("money1과 money2가 동일한 주소입니다")
    }
    // 동일성 ===
    // 동등성 ==
}