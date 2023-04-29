package lec19

data class Person(
    val name: String,
    val age: Int
)



fun main() {

    val person = Person("권규정", 100)
//    val (name, age) = person
    val name = person.component1()
    val age = person.component2()

    println("이름: ${name}. 나이: ${age}")

    // data class 함수가 아닌 경우 componentN 함수를 쓰고 싶을때
    val person2 = Person2("권규정", 100)
    val (name2, age2) = person2

    println("이름: ${name2}. 나이: ${age2}")


}

class Person2(
    val name2: String,
    val age2: Int
) {
    // componentN 함수는 연산자의 속성을 가지고 있기 때문에 오버라이딩 할때 앞에 operator를 붙여줘야 한다.
    operator fun component1(): String {
        return this.name2
    }

    operator fun component2(): Int {
        return this.age2
    }
}
