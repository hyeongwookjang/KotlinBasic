package com.jtk.basic.javaToKotlin.oop.objectt

import com.jtk.basic.javaToKotlin.oop.objectt.JavaHouse.LivingRoom


fun main() {

}
class House(
    private val address: String,
    private val livingRoom: LivingRoom
    ) {

    class LivingRoom(
        private val area: Double
    )

    }
