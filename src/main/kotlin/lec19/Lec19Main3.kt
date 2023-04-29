package lec19

fun main() {

    val numbers = listOf(1, 2, 3)

    numbers.map { number -> number + 1 }
        .forEach { number ->  println(number) }

    for (number in numbers) {
        if (number == 2) {
            break
        }
    }

    // 이런 forEach 문에서는 continue / break 를 사용할 수 없다
  /*  numbers.forEach { number ->
        if (number == 2) {
            break
        }
    }*/

    run {
        numbers.forEach { number ->
            if (number == 2) {
                return@run
            }
        }
    }

    numbers.forEach { number ->
        if (number == 2) {
            return@forEach
        }
    }

    abc@ for (i in 1..100) {
        for (j in 1..100) {
            if (j == 2) {
                break@abc
            }
            println("${i} ${j}")
        }
    }
}
