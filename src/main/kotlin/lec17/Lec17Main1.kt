package lec17

fun main() {
    val fruits = listOf(
        Fruit("사과", 1_000),
        Fruit("사과", 1_200),
        Fruit("사과", 1_200),
        Fruit("사과", 1_500),
        Fruit("바나나", 3_000),
        Fruit("바나나", 3_200),
        Fruit("바나나", 2_500),
        Fruit("수박", 10_000),
    )

    // fun 뒤에 이름이 안들어감 따라서 이름없는 함수 람다
    // 람다를 만드는 방법 1
    val isApple: (Fruit) -> Boolean = fun(fruit: Fruit): Boolean {
        return fruit.name == "사과"
    }

    // 람다를 만드는 방법 2 (얘를 더 많이 씀)
    val isApple2: (Fruit) -> Boolean = { fruit: Fruit -> fruit.name == "사과"}

    // 람다를 호출하는 방법 1
    isApple(fruits[0])

    // 람다를 호출하는 방법 2
    isApple.invoke(fruits[0])
}
