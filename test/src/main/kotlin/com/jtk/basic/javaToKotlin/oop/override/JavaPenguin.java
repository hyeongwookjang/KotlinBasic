package com.jtk.basic.javaToKotlin.oop.override;

public final class JavaPenguin extends JavaAnimal implements JavaSwimmable, JavaFlyable {
    private final int wingCount;

    public JavaPenguin(String species) {
        super(species, 2);
        this.wingCount = 2;
    }

    @Override
    public void move() {
        System.out.println("this penguin is moving");
    }

    public int getLegCount() {
        return super.legCount + this.wingCount;
    }

    @Override
    public void act() {
        JavaSwimmable.super.act();
        JavaFlyable.super.act();
    }
}
