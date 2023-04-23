package lec15

fun main() {

    val array = arrayOf(100, 200)

    for (i in array.indices) {
        println("${i} ${array[i]}")
    }

    val plus300 = array.plus(300)

    for ((idx, value) in plus300.withIndex()) {
        println("${idx} ${value}")
    }

}
