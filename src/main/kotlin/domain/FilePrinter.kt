package domain

import java.io.BufferedReader
import java.io.File
import java.io.FileReader

class FilePrinter {

    fun readFileV1() {
        val currentFile = File(".")
        val file = File("${currentFile.absolutePath}/a.txt")
        val reader = BufferedReader(FileReader(file))
        println(reader.readLine())
        reader.close()
    }

    fun readFileV2(path: String) {
        BufferedReader(FileReader(path)).use {
            reader -> println(reader.readLine() )
        }
    }
}