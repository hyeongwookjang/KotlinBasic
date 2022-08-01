package com.jtk.basic.javaToKotlin.naming.kotlinType

import com.jtk.basic.javaToKotlin.naming.Person


/**
 Person person = new Person("최태현", 100);
 String log = String.format("사람의 이름은 %s이고 나이는 %s세 입니다.", person.getName(), person.getAge());

 아니면
 StringBuilder, builder.append("사람의 이름은");
 builder.append(person.getName());
 */
fun main() {
 println(long)
}
val person = Person("최태현", 100)
val long = "사람의 이름은 ${person.name}이고 나이는 ${person.age}세 입니다."
