package lec01;

import domain.Person;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Lec01Main {

    public static void main(String[] args) {

        long number1 = 10L;
        final long number2 = 10L;

        Long number3 = 1_000L;
        Person person = new Person("권규정");

        /*
        * final을 붙이더라도 컬렉션에 원소 추가가 가능하다
        * */
        final List<Integer> numbers = new ArrayList<>();
        numbers.add(1);

    }

}
