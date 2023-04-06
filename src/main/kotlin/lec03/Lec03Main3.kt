package lec03

import domain.Person

fun main() {
    val person = Person("권규정", 100)
    println("이름: ${person.name}")

    val str = """
        안녕하세요
        반갑습니다
        안녕히가세요
    """.trimIndent()
    println(str)

    val str2 = "ABC"
    println(str2[1])

}
