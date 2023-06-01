package reflection;

import java.lang.reflect.Constructor;

/**
 * @author liuguoqing000
 * @date 2023/6/1 17:05
 * @desc
 */
public class GetClass {
    public static void main(String[] args) throws Exception {
        //1.forName
        Class<?> cls1 = Class.forName("reflection.Person");
        System.out.println(cls1);
        //2.Person.class
        Class<Person> cls2 = Person.class;
        System.out.println(cls2);
        //3.getClass
        Person person = new Person();
        Class cls3 = person.getClass();
        System.out.println(cls3);
    }
}
