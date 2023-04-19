package lec12;

public class Lec12Main1 {
    public static void main(String[] args) {

        // 이렇게 companion object의 메서드 이름을 명시하여 부를 수 있고
        // 만약 이름이 따로 없다면 Person.Companion.newBaby("ABC") 이렇게 호출 가능
        Person.Factory.newBaby("ABC");

        // 만약 @JvmStatic 이라는 어노테이션을 companion object 메서드에 선언하면
        // 이렇게 바로 사용 가능
        Person.newBaby("ABC");
    }
}

