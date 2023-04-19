package lec14

fun main() {
    val dto1 = PersonDto("권규정", 100)
    val dto2 = PersonDto("권규정", 100)
    println(dto1 == dto2)
    println(dto1)
}

data class PersonDto(
    val name: String,
    val age: Int,
)
