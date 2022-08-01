package com.jtk.basic.javaToKotlin.oop.override

class Penguin(
    species: String
) : Animal(species, 2), Swimmable, Flyable {
    private val wingCount: Int = 2

    override fun move() {
        println("this penguin is moving")
    }

    override val legCount: Int
    get() = super.legCount + this.wingCount

    override fun act() {
        super<Swimmable>.act()
        super<Flyable>.act()
    }

    override val swimAbility: Int
    get() = 3
}