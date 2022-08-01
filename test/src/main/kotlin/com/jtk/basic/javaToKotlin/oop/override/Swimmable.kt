package com.jtk.basic.javaToKotlin.oop.override

interface Swimmable {


    val swimAbility: Int

    fun act(){
        println(swimAbility)
        println("Swimming")
    }
}