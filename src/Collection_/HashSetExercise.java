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
        HashSet set = new HashSet();
        set.add(new Person("tom", 18));


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
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Person)) return false;
        Person person = (Person) o;
        return age == person.age && name.equals(person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }
}
