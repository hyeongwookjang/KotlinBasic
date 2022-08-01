package com.jtk.basic.javaToKotlin.oop.override;

public interface JavaSwimmable {

    default void act() {
        System.out.println("swimming");
    }
}
