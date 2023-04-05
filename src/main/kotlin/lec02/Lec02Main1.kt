package lec02


fun main() {

}

/**
 * Lec02Main.java 코드와 비교한 kotlin 코드
*/

/**
 * * Java 의 startsWithA1 함수의 매개변수 String 에는 null 이 들어올 수 있기 때문에
 * 이 함수에도 null 이 들어올 수 있게하기위해 String 뒤에 ? 를 붙인다
 *
 * * return 값은 boolean 즉 primitive 타입이므로
 * null 을 리턴 할 수 없어 코틀린의 리턴타입인 Boolean 에 ?를 붙이지 않는다
 **/
fun startsWithA1(str: String?): Boolean {
    if (str == null) {
        throw IllegalArgumentException("null이 들어왔습니다")
    }

    return str.startsWith("A")
}

/**
* * Java 의 startsWithA2 함수의 매개변수 String 에는 null 이 들어올 수 있기 때문에
 * 이 함수에도 null이 들어올 수 있게 하기위해 String 뒤에 ? 를 붙인다
 *
 * * null 을 리턴할 수 있어 Boolean 에 ? 를 붙인다
* */
fun startsWithA2(str: String?): Boolean? {
    if (str == null) {
        return null
    }

    return str.startsWith("A")
}

/**
 * * Java 의 startsWithA3 함수 매개변수에 null 가능 따라서 String?
 * * Java 의 startsWithA3 함수 리턴타입이 null 불가능 따라서 그냥 Boolean
 *
 * * TIP : 여기서 바로 if 문으로 널 체크를 하지 않고 str.startsWith() 을 호출하면 에러가 발생
 * * 이유 : str 이라는 변수는 String? 물음표가 붙어 null 일 수도 있는 String 과는 완전 다른 타입이 되어 버렸고
 * 코틀린에서는 null 이 들어갈 수 있는것에 대해서는 바로 함수 호출을 못하게 끔 되어있다
 **/
fun startsWithA3(str: String?): Boolean {
    if (str == null) {
        return false;
    }
    // 여기 아래 str 이 초록색인 이유는
    // 코틀린은 문맥상 위에서 null 을 한번 체크해줬다면
    // 아래서 null이 아니겠거니하고 컴파일러가 자동으 추측을 해주기 때문에
    // 이미 null 체크를 해줬다는 의미로 초록색으로 표시된다
    return str.startsWith("A")
}

