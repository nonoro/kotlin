package lec09

import domain.Person

fun main() {
    var person = Lec09Person3()
}

class Lec09Person3(
    name: String = "권규정",
    var age: Int = 1
) {

    // custom getter
    val uppercaseName: String
        get() = this.name.uppercase()

    var name = name
        set(value) {
            field = value.uppercase()
        }
    init {
        if (age <= 0) {
            throw IllegalArgumentException("나이는 ${age}일 수 없습니다")
        }
        println("초기화 블록")
    }

    // custom getter
    val isAdult: Boolean
        get() = this.age >= 20
}
