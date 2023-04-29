package lec20

import lec19.Person

fun main() {
    val person = Person("권규정", 100)

    val value1 = person.let { // value1 = age
//        it.age
        p -> person.age // 이렇게 표현도 가능
    }

    val value2 = person.run {// value2 = age
//        this.age
        age // 이렇게 this를 생략도 가능
    }

    val value3 = person.also {// value3 = Person
        it.age
    }

    val value4 = person.apply {// value4 = Person
        this.age
    }
}
