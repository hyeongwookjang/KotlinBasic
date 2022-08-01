package com.jtk.basic.javaToKotlin.oop.override;

public interface JavaFlyable {

    default void act() {
        System.out.println("flying");
    }
}
