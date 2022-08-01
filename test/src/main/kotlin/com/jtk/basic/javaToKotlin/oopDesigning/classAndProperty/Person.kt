package com.jtk.basic.javaToKotlin.oopDesigning.classAndProperty

class Person constructor(name: String, age:Int){

//    여기서 String , Int 타입 생략가능
    val name: String = name
    var age: Int = age
}