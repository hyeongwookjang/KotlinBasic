package com.jtk.basic.javaToKotlin.naming;


public class Person {

 private final String name;
 private final Integer age;

 public Person(String name, Integer age) {
 this.name = name;
 this.age = age;

 }

 public Integer getAge() {
  return age;
 }


 public String getName() {
 return name;
 }
 }

