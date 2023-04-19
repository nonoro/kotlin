package lec14;

import java.util.Objects;

public class JavaPersonDto {

    private final String name;
    private final int age;

    public JavaPersonDto(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        JavaPersonDto that = (JavaPersonDto) o;

        if (age != that.age) return false;
        return Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + age;
        return result;
    }

    @Override
    public String toString() {
        return "JavaPersonDto{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
