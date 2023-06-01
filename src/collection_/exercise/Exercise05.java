package collection_.exercise;

import java.util.HashSet;
import java.util.Objects;

/**
 * @author liuguoqing000
 * @date 2023/5/29 20:13
 * @desc
 */
public class Exercise05 {
    public static void main(String[] args) {
        HashSet set = new HashSet();//ok
        Person1 p1 = new Person1(1001, "AA");//ok
        Person1 p2 = new Person1(1002, "BB");//ok
        set.add(p1);//ok
        set.add(p2);//ok
        p1.name = "CC";
        set.remove(p1);
        System.out.println(set);//2
        set.add(new Person1(1001, "CC"));
        System.out.println(set);//3
        set.add(new Person1(1001, "AA"));
        System.out.println(set);//4

    }
}

class Person1 {
    public String name;
    public int id;

    public Person1(int id, String name) {
        this.name = name;
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person1 person = (Person1) o;
        return id == person.id &&
                Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, id);
    }

    @Override
    public String toString() {
        return "Person1{" +
                "name='" + name + '\'' +
                ", id=" + id +
                '}';
    }
}
