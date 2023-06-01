package reflection;

import java.lang.reflect.Constructor;
import java.security.PublicKey;

/**
 * @author liuguoqing000
 * @date 2023/6/1 20:24
 * @desc 反射机制创建实例、构造器暴破、指定构造器、构造器传参数
 */
public class CreateInstance {
    public static void main(String[] args) throws Exception {
        Class<?> cls = Class.forName("reflection.User");
        //1.public无参构造器
        Constructor<?> constructor1 = cls.getConstructor();
        Object o1 = constructor1.newInstance();
        System.out.println(o1);
        //2.非public有参构造器
        Constructor<?> constructor2 = cls.getDeclaredConstructor(int.class, String.class);
        constructor2.setAccessible(true);//暴破：使用反射可以访问private构造器方法属性等
        Object o2 = constructor2.newInstance(20, "jack");
        System.out.println(o2);
    }
}

class User { //User类
    private int age = 10;
    private String name = "韩顺平教育";

    public User() {//无参 public
    }

    public User(String name) {//public的有参构造器
        this.name = name;
    }

    private User(int age, String name) {//private 有参构造器
        this.age = age;
        this.name = name;
    }

    public String toString() {
        return "User [age=" + age + ", name=" + name + "]";
    }
}
