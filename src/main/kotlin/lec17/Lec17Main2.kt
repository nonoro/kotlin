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

    val isApple: (Fruit) -> Boolean = fun(fruit: Fruit): Boolean {
        return fruit.name == "사과"
    }

    val isApple2: (Fruit) -> Boolean = { fruit: Fruit -> fruit.name == "사과"}

    // 방법
    //1
    filterFruits(fruits, isApple)
    //2
    filterFruits(fruits, { fruit: Fruit -> fruit.name == "사과"})
    //3: 이렇게 메서드의 인수의 마지막 인수가 함수이면 {} 로 따로 뺼 수 있다
    filterFruits(fruits) { fruit -> fruit.name == "사과" }
    //4: 이렇게(비추천)
    filterFruits(fruits) { it.name == "사과" }

    val filterFruits = filterFruits(fruits) { fruit ->
        println("사과만 받는다..!!!")
        fruit.name == "사과"
    }
}

private fun filterFruits(
    fruits: List<Fruit>, filter: (Fruit) -> Boolean
): List<Fruit> {
    val results = mutableListOf<Fruit>()
    for (fruit in fruits) {
        if (filter(fruit)) {
            results.add(fruit)
        }
    }
    return results
}

