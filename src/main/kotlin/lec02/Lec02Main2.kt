package lec02

fun main() {

    val str: String? = null
    println("Safe Call = ${str?.length}")
    println("Safe Call + Elvis 연산자 = ${str?.length ?: 0}")


}

fun startsWithA4(str: String?): Boolean {
    /* Safe Call 로 변경
    if (str == null) {
        throw IllegalArgumentException("null이 들어왔습니다")
    }

    return str.startsWith("A")

    */

    /* Safe Call */
    return str?.startsWith("A") ?: throw IllegalArgumentException("null 이 들어왔습니다.")
}

fun startsWithA5(str: String?): Boolean? {
   /*
   if (str == null) {
        return null
    }

    return str.startsWith("A")
    */

    /* Safe Call */
    return str?.startsWith("A")
}

fun startsWithA6(str: String?): Boolean {
    /*
    if (str == null) {
        return false;
    }
    return str.startsWith("A")
    */

    /* Safe Call */
    return str?.startsWith("A") ?: false
}

