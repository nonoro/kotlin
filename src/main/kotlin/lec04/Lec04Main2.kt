package lec04

import domain.JavaMoney

fun main() {
    val money1 = JavaMoney(1_000L)
    val money2 = money1
    val money3 = JavaMoney(1_000L)

    println("주소값 비교 : money1 === money2 = ${money1 === money2}")
    println("주소값 비교 : money1 === money3 = ${money1 === money3}")

    println("값 비교 : money1 == money3 = ${money1 == money3}")
}
