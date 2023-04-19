package lec13;

public class JavaHouse1 {

    private String address;
    private LivingRoom livingRoom;

    public JavaHouse1(String address) {
        this.address = address;
        this.livingRoom = new LivingRoom(10);
    }

    public LivingRoom getLivingRoom() {
        return livingRoom;
    }

    public static class LivingRoom {
        private double area;

        public LivingRoom(double area) {
            this.area = area;
        }
    }

}
