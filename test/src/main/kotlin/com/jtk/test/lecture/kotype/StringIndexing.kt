package com.jtk.test.lecture.kotype

fun main() {
    val name = "최태현"

        val str =
        """
            ABC
            EFG
            ${name}
        """.trimIndent()
        print(str)

    val str2 = "ABC"
    println(str[0])
    println(str[2])
}

