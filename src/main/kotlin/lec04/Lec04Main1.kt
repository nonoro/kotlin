package lec04

import domain.JavaMoney

fun main() {

    val money1 = JavaMoney(2_000L)
    val money2 = JavaMoney(1_000L)

    if (money1 > money2) {
        println("Money1 이 Money2 보다 금액이 큽니다")
    }

}
