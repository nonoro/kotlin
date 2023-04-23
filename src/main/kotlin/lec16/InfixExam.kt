package lec16

fun Int.add(other: Int): Int {
    return this + other
}

infix fun Int.add2(other: Int): Int {
    return this + other
}

fun main() {
    // 기존 확장함수
    3.add(4)

    // infix 함수
    3.add2(4)
    // 이렇게도 DSL처럼 표현 가능
    3 add2 4
}
