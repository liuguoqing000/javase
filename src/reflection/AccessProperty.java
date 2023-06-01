package reflection;

import com.sun.tools.javac.Main;

import java.lang.reflect.Field;

/**
 * @author liuguoqing000
 * @date 2023/6/1 20:40
 * @desc 暴破访问属性，修改值
 */
public class AccessProperty {
    public static void main(String[] args) throws Exception {
        Class<?> cls = Class.forName("reflection.Student");
        Object o = cls.getConstructor().newInstance();
        System.out.println(o.getClass());

        //public属性
        Field age = cls.getField("age");
        age.set(o, 1000);
        System.out.println(o);
        System.out.println(age.get(o));

        //暴破访问private属性
        Field name = cls.getDeclaredField("name");
        name.setAccessible(true);//暴破
        name.set(null, "jack");//因为name是静态属性，故可写null
        System.out.println(o);
        System.out.println(name.get(o));
        System.out.println(name.get(null));//由于属性name为静态，也可写为null
    }
}

class Student {
    public int age = 1;
    private static String name = "???";

    public Student() {
    }

    public String toString() {
        return "Student [age=" + age + ", name=" + name + "]";
    }
}