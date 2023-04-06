package lec03

import domain.Person

fun main() {
    printAgeIfNullPerson(null)
    printAgeIfNullPerson(Person(100))
}

fun printAgeIfPerson(obj: Any) {
    if (obj is Person) {
        val person = obj as Person
        println(person.age)
    }
}

fun printAgeIfNotPerson(obj: Any) {
    if (obj !is Person) {
    }
}

fun printAgeIfNullPerson(obj: Any?) {
    val person = obj as? Person
    println(person?.age)
}
