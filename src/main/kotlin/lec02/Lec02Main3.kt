package lec02

fun main() {
    println(startsWith7(null))
}

fun startsWith7(str: String?): Boolean {
    return str!!.startsWith("A")
}
