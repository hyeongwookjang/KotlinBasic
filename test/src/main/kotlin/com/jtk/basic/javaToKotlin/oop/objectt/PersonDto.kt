package com.jtk.basic.javaToKotlin.oop.objectt


fun main() {
    val dto1 = PersonDto("최태현", 100)
    val dto2 = PersonDto("최태현", 100)
    println(dto1)
}



data class PersonDto(
    val name: String,
    val age: Int
//    -> equals, hashcode, toString 을 다 만들어 준다.
) {

}