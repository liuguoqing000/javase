package inner_class;

import java.lang.invoke.VarHandle;

/**
 * @author 刘国庆
 * @date 2023/5/24
 * @desc 基于接口的匿名内部类写法、基于类的匿名内部类写法、基于抽象类的匿名内部类写法（略写）、匿名内部类作为参数的使用
 */

public class AnonymousInnerClass {
    public static void main(String[] args) {
        OuterClass outerClass = new OuterClass();
        // 1.基于接口的匿名内部类
        outerClass.m1();
        // 2.基于类的匿名内部类
        outerClass.m2();
        // 3.作为参数传递的匿名内部类
        m3(new Animal() {
            @Override
            public void cry() {
                System.out.println("狗叫！");
            }
        });
    }

    public static void m3(Animal animal) {
        animal.cry();
    }
}

class OuterClass {
    public void m1() {
        Animal dog = new Animal() {
            @Override
            public void cry() {
                System.out.println("狗叫");
            }
        };
        dog.cry();
        // 匿名内部类仅使用一次便被销毁，但匿名内部类的实例仍保存直至函数结束
        /**
         * 相当于
         * class OuterClass$1 implements Animal{
         *     @Override
         *     public void cry() {
         *         System.out.println("狗叫");
         *     }
         * }
         */
    }

    public void m2() {
        new Person() {
            @Override
            public void work() {
                System.out.println("student在学习");
            }
        }.work();
        /**
         * 相当于
         * class OuterClass$2 extends Person{
         *     @Override
         *     public void work() {
         *         System.out.println("student在学习");
         *     }
         * }
         */
    }
}

interface Animal {
    void cry();
}

class Person {
    public void work() {
        System.out.println("Person在工作");
    }
}