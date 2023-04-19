package lec13


fun main() {

}

class House2(
    private val address: String,
    private val livingRoom: LivingRoom,
) {
    inner class LivingRoom(
        private val area: Double
    ) {
        val address: String
            get() = this@House2.address
    }
}
