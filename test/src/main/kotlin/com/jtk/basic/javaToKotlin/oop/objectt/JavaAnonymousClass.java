package com.jtk.basic.javaToKotlin.oop.objectt;




public class JavaAnonymousClass {
    public static void main(String[] args) {
        moveSomething(new Movable() {
            @Override
            public void move() {
                System.out.println("moving");
            }

            @Override
            public void fly() {
                System.out.println("flying");
            }
        });

    }

    private static void moveSomething(Movable movable) {
        movable.move();
        movable.fly();
    }
}