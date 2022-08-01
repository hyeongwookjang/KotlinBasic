package com.jtk.basic.javaToKotlin.oop.override

class Cat(
    species: String
) : Animal(species, 4) {

    override fun move() {
        println("this cat is moving")
    }
}