package com.jtk.basic.javaToKotlin.oop.override;

public class JavaCat extends JavaAnimal {
    public JavaCat(String species) {
        super(species, 4);
    }

    @Override
    public void move() {
        System.out.println("this cat is moving");
    }
}
