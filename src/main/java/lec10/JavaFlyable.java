package lec10;

interface JavaFlyable {

    default void act() {
        System.out.println("파닥 파닥");
    }
}
