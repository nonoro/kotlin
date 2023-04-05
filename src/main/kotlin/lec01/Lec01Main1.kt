package lec01

fun main() {

    /**
     * 코틀린에선 타입을 명시하지 않아도 컴파일러가 자동으로 타입을 추론해준다
     * * 하지만 따로 명시할 수 도 있다.
     * */

    var number1 = 10L // 바꿀 수 있음 Variable 의 약자 - (발)
    var number1_Type: Long = 10L  // 타입 명시
    number1 = 5L

/*
    val number2 = 10L // 바꿀 수 없음 Value 의 약자 - (밸)
    number2 = 5L // val에는 다시 한번 값이 할당(assign)될 수 없다는 컴파일 에러 발생
*/


    /**
    * 초기값을 지정해주지 않는 경우
     * * 무조건 타입을 명시해줘야한다 (안그럼 컴파일에러 발생)
     * * 타입을 명시하더라도 사용하려할땐 무조건 초기값을 지정해줘야한다 (안그럼 컴파일에러 발생)
     */

    var number3: Long = 5
    println(number3)

    val number4: Long = 10L
    println(number4)





}



