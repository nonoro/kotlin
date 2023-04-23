package lec15;

import java.util.HashMap;
import java.util.Map;

public class Lec15Main4 {

    public static void main(String[] args) {
        // JDK 8까지
        HashMap<Integer, String> oldMap = new HashMap<>();
        oldMap.put(1, "MONDAY");
        oldMap.put(2, "TUESDAY");

        // JDK 9부터
        Map.of(1, "MONDAT", 2, "TUESDAY");
    }
}
