package Collection_;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

/**
 * @author liuguoqing000
 * @date 2023/5/27 21:32
 * @desc
 */
public class HashSetExercise {
    public static void main(String[] args) {
        Set set = new HashSet();
        set.add(new Person("tom", 18));
        set.add(new Person("tom", 20));
        set.add(new Person("hhh", 18));
        set.add(new Person("tom", 18));
        for (Object o : set) {
            System.out.println(o);
        }
    }
}

class Person {
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Person)) return false;
        Person person = (Person) o;
        return age == person.age && Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }
}
