package com.jtk.basic.javaToKotlin.coding.functionInKotlin;

public class JavaManyParameters {

    public static void printAll(String... strings) {
        for (String str : strings) {
            System.out.println(str);
        }
    }

    String[] array = new String[]{"A", "B", "C"};
//    printAll(array);
//    printAll("A", "B", "C");

}
