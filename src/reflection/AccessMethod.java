package reflection;

import java.lang.reflect.Method;

/**
 * @author liuguoqing000
 * @date 2023/6/1 20:49
 * @desc 方法暴破，调用，返回值，传参的使用
 */
public class AccessMethod {
    public static void main(String[] args) throws Exception {
        Class<?> cls = Class.forName("reflection.Boss");
        Object o = cls.getDeclaredConstructor().newInstance();
        //public方法hi
        Method hi = cls.getMethod("hi", String.class);//注意此方法的参数：方法名，该方法的参数类型
        hi.invoke(o, "invoke传入参数");//注意此方法的参数：对象名，该方法的参数
        //private方法say
        Method say = cls.getDeclaredMethod("say", int.class, String.class, char.class);
        say.setAccessible(true);//私有的别忘了暴破
        System.out.println(say.invoke(o, 100, "hhh", 'a'));
        System.out.println(say.invoke(null, 100, "hhh", 'a'));//由于是静态方法，因此也可写为null
        //返回值统统以Object类型接收；运行类型与方法定义的返回类型一致
        Object returnType = say.invoke(null, 100, "hhh", 'a');
        System.out.println("返回值运行类型" + returnType.getClass());
    }
}

class Boss {
    public int age;
    private static String name;

    public Boss() {
    }

    private static String say(int n, String s, char c) {//静态方法
        return n + " " + s + " " + c;
    }

    public void hi(String s) {//普通public方法
        System.out.println("hi " + s);
    }
}
