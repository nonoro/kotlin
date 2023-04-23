package lec15

fun main() {

    // 불변 리스트
    val numbers = listOf(100, 200)
    val emptyList = emptyList<Int>()

    // 가변 리스트
    val mutableNumbers = mutableListOf(100, 200)
    mutableNumbers.add(300)


    // 만약 매개변수 자체에서 타입이 정해져있어 타입추론이 가능하다면 emptyList에 따로 타입을 정해주지 않아도된다.
    printNumbers(emptyList())

    println(numbers[0])

    for (number in numbers) {
        println(number)
    }

    for ((idx, value) in numbers.withIndex()) {
        println("${idx} ${value}")
    }

}

private fun printNumbers(number: List<Int>) {

}
