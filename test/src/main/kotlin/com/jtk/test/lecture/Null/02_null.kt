package com.jtk.test.lecture

/**
1. Kotlin 에서의 null 체크
2. Safe Call과 Elvis 연산자
3. Null 아님 단언!!
4. 플랫폼 타입
 **/

fun main() {
    val str: String? = "abc"
    println(str?.length)
//    엘비스 연산자, ?: 0-> null일떄 : 0
//    println(str?.length ?: 0)
}


/**
자바코드
public boolean startWithA1(String str) {
if (str == null) {
throw new IllegalArgumentException("null이 들어왔습니다");
}
return str.startsWith("A");
 */

fun startWithA1(str: String?): Boolean {
    if (str == null) {
        throw IllegalArgumentException("null이 들어왔습니다.")
        }
    return str.startsWith("A")
}

fun startWithAA1(str: String?): Boolean {
    return str?.startsWith("A")
        ?: throw java.lang.IllegalArgumentException("null이 들어왔습니다.")
}



fun startsWithA2(str: String?): Boolean? {
    if (str == null) {
        return null
    }
    return str.startsWith("A")
}

fun startsWithAA2(str: String?): Boolean? {
    return str?.startsWith("A")
}



fun startsWithA3(str: String?): Boolean {
    if (str == null) {
        return false
    }
    return str.startsWith("A")
}

fun startsWithAA3(str: String?): Boolean {
    return str?.startsWith("A") ?: false
}

