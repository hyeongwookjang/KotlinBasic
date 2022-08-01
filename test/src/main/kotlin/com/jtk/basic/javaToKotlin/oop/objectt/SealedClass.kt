package com.jtk.basic.javaToKotlin.oop.objectt


fun main() {
    handleCar(Avante())
}

private fun handleCar(car: HyundaiCar) {
    when (car) {
        is Avante -> println(3)
        is Grandeur -> TODO()
        is Sonata -> TODO()
    }
}