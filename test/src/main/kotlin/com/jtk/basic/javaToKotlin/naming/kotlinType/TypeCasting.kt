package com.jtk.basic.javaToKotlin.naming.kotlinType

import com.jtk.basic.javaToKotlin.naming.Person

fun main() {

}
/**
public static void main(String[] args) {
}
public static void printAgeIfPerson(Object obj) {
if (obj instanceof Person) {
Person person = (Person) obj;
System.out.println(person.getAge());
 */

fun printAgeIfPerson(obj: Any) {
    if (obj is Person) {
//        !is, as?

//        val person = obj as Person
//        println(person.age)
//        아래처럼 단축가능. 스마트 캐스트 라고 한다.
        println(obj.age)
    }
}

