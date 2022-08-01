package com.jtk.basic.javaToKotlin.functionalProgramming



/* 가변 컬렉션 : 컬렉션에 element 를 추가, 삭제 할 수 있다.
* 불변 컬렉션 : 컬렉션에 element 를 추가, 삭제할 수 없다. */

fun main() {

    // 가변 리스트
    val numbers2 = mutableListOf(100, 200, 300)
    numbers2.add(400)

    //    빈리스트의 경우 타입을 지정해주어야 한다
    val emptyList = emptyList<Int>()
    //    emptyList에서 타입추론(메소드로 부터 추론)이 가능하면 <> 타입선언을 하지 않아도 된다.
    printNumbers(emptyList())

    val numbers = listOf(100, 200)



    println(numbers[0])

    for (number in numbers) {
        println(number)
    }

    for ((idx, value) in numbers.withIndex()) {
        println("${idx} ${value}")
    }
}


private fun printNumbers(numbers: List<Int>) {

}

