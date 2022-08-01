package com.jtk.basic.javaToKotlin.oop.access;

public abstract class JavaStringUtils {
    private JavaStringUtils() {}

    public boolean isDirectoryPath(String path) {
        return path.endsWith("/");
    }
}
