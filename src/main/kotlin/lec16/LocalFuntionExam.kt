package lec16

fun createPerson(firstName: String, lastName: String): Person {

    // 지역함수 적용 전
    if (firstName.isEmpty()) {
        throw IllegalArgumentException("fistName은 비어있을 수 없습니다! 현재 값 : ${firstName} ")
    }

    if (lastName.isEmpty()) {
        throw IllegalArgumentException("lastName은 비어있을 수 없습니다! 현재 값 : ${lastName} ")
    }

    // 지역함수 적용 후(중복 부분을 제거해서 지역함수로 만들어 준다.)
    fun validateName(name: String, fieldName: String) {
        if (name.isEmpty()) {
            throw IllegalArgumentException("${fieldName}은 비어있을 수 없습니다! 현재 값 : ${name} ")
        }
    }
    validateName(firstName, "firstName")
    validateName(lastName, "lastName")

    return Person(firstName, lastName, 1)
}

