package lec12

fun main() {
    moveSomething(object : Movable { // Java에선 new 타입이름() {익명 클래스 구현}
        override fun move() {        // Kotlin에선 object : 타입이름 {익명 클래스 구선}
            println("무브 무브")
        }

        override fun fly() {
            println("날아 날아")
        }
    })
}

private fun moveSomething(movable: Movable) {
    movable.move()
    movable.fly()
}
