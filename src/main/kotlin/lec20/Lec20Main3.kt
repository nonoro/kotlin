package lec20

fun main() {
    val strings = listOf("APPLE", "CAR", "PHONE", "COMPUTER", "CHAIR")
    strings.map { it.length }
        .filter { it > 3 }
        .let { lengths -> println(lengths) }

    val str = "apple"

    val length = str?.let {
        println(it.uppercase())
        it.length
    }

    val numbers = listOf("one", "two", "three", "four")
    val modifiedFirstItem = numbers.first()
        .let { firstItem ->
            if (firstItem.length >= 5) {
                firstItem
            } else {
                "!${firstItem}!"
            }
        }.uppercase()
    println(modifiedFirstItem)

    mutableListOf("one", "two", "three")
        .also { println("The list elements before adding new one: ${it}") }
        .add("four")

    val numbers2 = mutableListOf("one", "two", "three")
    println("The list elements before adding new one: ${numbers2}")
    numbers2.add("four")

}
