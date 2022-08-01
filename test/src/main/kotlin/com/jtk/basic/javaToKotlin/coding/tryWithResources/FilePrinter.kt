package com.jtk.basic.javaToKotlin.coding.tryWithResources

import java.io.BufferedReader
import java.io.FileReader


// 코틀린에서는 try with resource 가 없다. use라는 inline 확장함수를 사용해야한다.
class FilePrinter {

    fun readFile(path: String) {
        BufferedReader(FileReader(path)).use { reader ->
            println(reader.readLine())
        }
    }
}