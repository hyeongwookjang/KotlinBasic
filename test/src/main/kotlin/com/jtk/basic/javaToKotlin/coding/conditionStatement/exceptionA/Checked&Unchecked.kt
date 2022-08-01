package com.jtk.basic.javaToKotlin.coding.conditionStatement.exceptionA

import java.io.BufferedReader
import java.io.File
import java.io.FileReader


/**
 public class JavaFilePrinter {

 public void readFile() throws IOExeption{
 File currentFile = new File(".");
 File file = new File(currentFile.getAbsolutePath() + "a.txt");
 BufferReader reader = new BufferedReader(new FileReader(file));
 System.out.println(reader.readLine());
 reader.close();
 */

// 코틀린에서는 Checked Exception과 Unchecked Exception을 구분하지 않습니다. 모두 Unchecked 입니다. 신경쓸게 없다.

class FilePrinter {

    fun readFile() {
        val currentFile = File(".")
        val file = File(currentFile.absolutePath + "a.txt")
        val reader = BufferedReader(FileReader(file))
        println(reader.readLine())
        reader.close()
    }

}