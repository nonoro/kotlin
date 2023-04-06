package lec03;

import domain.Person;

public class Lec03Main {
    public static void main(String[] args) {

    }

    public static void printAgeIfPerson(Object obj) {
        if (obj instanceof Person) {
            Person person = (Person) obj;
            System.out.println(person.getName());
        }
    }

    public static void printAgeIfNotPerson(Object obj) {
        if (!(obj instanceof Person)) {
            Person person = (Person) obj;
            System.out.println(person.getName());
        }
    }
}

