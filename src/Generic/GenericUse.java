package Generic;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * @author liuguoqing000
 * @date 2023/5/31 14:45
 * @desc 泛型使用实例
 */
public class GenericUse {
    public static void main(String[] args) {
        Set<Student> hashSet = new HashSet<>();
        hashSet.add(new Student("jack", 18));
        hashSet.add(new Student("ja", 1));
        hashSet.add(new Student("ck", 22));
        for (Student student : hashSet) {
            System.out.println(student);
        }

        HashMap<String, Student> hashMap = new HashMap<>();
        hashMap.put("no1", new Student("jack", 18));
        hashMap.put("no2", new Student("ck", 81));
        hashMap.put("no3", new Student("jk", 108));
        Set<Map.Entry<String, Student>> entries = hashMap.entrySet();
        for (Map.Entry<String, Student> entry : entries) {
            System.out.println(entry.getKey() + "=" + entry.getValue());
        }
    }
}

// E可以理解为数据类型
// E是在定义Person对象的时候指定
// E可以是参数类型、返回类型等
class Student {
    private String name;
    private int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public java.lang.String toString() {
        return "Person{" +
                "name=" + name +
                ", age=" + age +
                '}';
    }
}