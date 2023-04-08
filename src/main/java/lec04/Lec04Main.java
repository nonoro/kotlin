package lec04;

import domain.JavaMoney;

public class Lec04Main {

    public static void main(String[] args) {
        JavaMoney money1 = new JavaMoney(1_000L);
        JavaMoney money2 = money1;
        JavaMoney money3 = new JavaMoney(1_000L);

        System.out.println(String.format("주소값 비교 => money1 == money2 : %b", money1 == money2)); // true
        System.out.println(String.format("주소값 비교 => money1 == money3 : %b", money1 == money3)); // false

        System.out.println(String.format("값 비교 => money1.equals(money3) : %b", money1.equals(money3))); // true(equals 재정의 함)


        if (money1.compareTo(money2) > 0) {
            System.out.println("Money1 이 Money2 보다 금액이 큽니다");
        }

        System.out.println();

        System.out.println(money1.plus(money2));
    }
}
