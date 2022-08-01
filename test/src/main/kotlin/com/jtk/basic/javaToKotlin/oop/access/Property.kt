package com.jtk.basic.javaToKotlin.oop.access

class Car(
    internal val name: String,
    private var owner: String,
    _price: Int
) {
    var price = _price
    private set
}