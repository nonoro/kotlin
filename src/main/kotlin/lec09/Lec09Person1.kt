package lec09

import domain.Person

fun main() {
    val person = Lec09Person1("권규정", 100)
    println(person.name)
    person.age = 10
    println(person.age)

    val person2 = Person("권규정", 200)
    println(person2.name)
    person2.age = 100
    println(person2.age  )


}

class Lec09Person1(
    val name: String,
    var age: Int
)
