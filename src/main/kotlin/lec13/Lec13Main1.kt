package lec13


fun main() {

}

class House1(
    private val address: String,
    private val livingRoom: LivingRoom,
) {
    class LivingRoom(
        private val area: Double
    )
}
