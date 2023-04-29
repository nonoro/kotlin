package lec20

import lec19.Person

fun main() {

}

fun printPerson(person: Person?) {

    // 이 코드를
    if (person != null) {
        println(person.name)
        println(person.age)
    }

    // scope function을 이용해서 이렇게 바꿀 수 있다
    person?.let{
        println(it.name)
        println(it.age)
    }
}
