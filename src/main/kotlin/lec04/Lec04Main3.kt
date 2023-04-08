package lec04

fun main() {

    // Lazy 연산 : if 조건식 안에 fun1() 이 true 면 fun2() 는 호출하지 않고 그냥 바로 본문이 실행됨
    if (fun1() || fun2()) {
        println("본문")
    }
}

fun fun1(): Boolean {
    println("fun 1")
    return true
}

fun fun2(): Boolean {
    println("fun 2")
    return false
}
