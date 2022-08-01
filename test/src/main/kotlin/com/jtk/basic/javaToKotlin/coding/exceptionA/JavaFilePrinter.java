package com.jtk.basic.javaToKotlin.coding.exceptionA;

import java.io.IOException;

public class JavaFilePrinter {
    public static void main(String[] args) throws IOException {
        JavaFilePrinterImp printer = new JavaFilePrinterImp();
        printer.readFile();
    }
}
