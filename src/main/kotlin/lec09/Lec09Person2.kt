package lec09

import domain.Person

fun main() {
   Lec09Person2()

}

class Lec09Person2(
    val name: String,
    var age: Int
) {
    init {
        if (age <= 0) {
            throw IllegalArgumentException("나이는 ${age}일 수 없습니다")
        }
        println("초기화 블록")
    }

    constructor(name: String) : this(name, 1) {
        println("첫번째 부 생성자")
    }

    constructor() : this("권규정") {
        println("두번재 부 생성자")
    }
}
