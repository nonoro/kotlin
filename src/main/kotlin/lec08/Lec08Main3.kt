package lec08

fun main() {
    repeat2("Hello World", useNewLine = false)
    printNameAndGender(name = "권규정", gender = "MAIL")

}

fun repeat2(
    str: String,
    num: Int = 3,
    useNewLine: Boolean = true
) {

    for (i in 1..num) {
        if (useNewLine) {
            println(str)
        } else {
            print(str)
        }
    }
}

fun printNameAndGender(name: String, gender: String) {
    println(name)
    println(gender)
}
