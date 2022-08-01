package com.jtk.basic.javaToKotlin.coding.conditionStatement.exceptionA

import java.io.BufferedReader
import java.io.FileReader



/**
 Public class JavaFilePrinter {

 public void readFile(String path) throws IOException {
 try (BufferedReader reader = new BufferedReader(new FileReader(path))
 System.out.println(reader.readLine());
 */


// try with resources가 사라지고 .use 인라인 확장함수를 사용한다.

class FilePrinter2 {
    fun readFile(path: String) {
        BufferedReader(FileReader(path)).use { reader ->
            println(reader.readLine())
        }
    }
}