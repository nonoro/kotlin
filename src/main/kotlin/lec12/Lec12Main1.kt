package lec12

fun main() {

    println(Singleton.a)
    Singleton.a += 10
    println(Singleton.a)

}

class Person private constructor (
    var name: String,
    var age: Int,
) {

    // 이 companion object를 java의 static 변수와 함수 처럼 사용
    // companion object, 즉 동반객체도 하나의 객체로 간주된다. 때문에 이름을 붙일 수도 있고, interface를 구현할 수도 있다.
    companion object Factory : Log {
        private const val MIN_AGE = 1

        @JvmStatic
        fun newBaby(name: String): Person {
            return Person(name, MIN_AGE)
        }

        override fun log() {
            println("나는 Person 클래스의 동행객체 Factory에요")
        }
    }
}

object Singleton {
    var a: Int = 0
}
