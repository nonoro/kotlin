package lec02

import domain.Person

fun main() {
    val person = Person(null)
    // Person 인스턴스의 getName() 이라는 메서드에 @Nullable 애너테이션이 선언되어 있으면 컴파일 에러 발생
    // @NotNull 이 선언되어 있다면 컴파일 에러가 발생하지 않는다
    // getName() 메서드에 아무런 애너테이션이 선언되어있지 않으면 컴파일에러가 발생하지 않는다
    // 하지만 그렇게되면 getName()으로 가져오는 값이 null 인지 알 수 없어 런타임때 NPE 이 발생할 수 있다
    startsWithA8(person.name)
}

fun startsWithA8(str: String): Boolean {
    return str.startsWith("A")
}
