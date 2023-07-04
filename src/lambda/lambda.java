package lambda;

import org.junit.Test;

import java.util.Comparator;
import java.util.function.Consumer;

/**
 * @author liuguoqing000
 * @date 2023/6/10 10:49
 * @desc lambda
 */
public class lambda {

    public static void main(String[] args) {

    }

    @Test
    public void intro() {
        /* 常规写法 */
        Comparator<Integer> com1 = new Comparator<>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return Integer.compare(o1, o2);
            }
        };
        System.out.println(com1.compare(12, 21));

        /* lambda */
        Comparator<Integer> com2 = (Integer o1, Integer o2) -> Integer.compare(o1, o2);
        Comparator<Integer> com3 = (o1, o2) -> Integer.compare(o1, o2);
        System.out.println(com2.compare(12, 21));
        System.out.println(com3.compare(12, 21));

        /* 方法引用 */
        Comparator<Integer> com4 = Integer::compare;
        System.out.println(com4.compare(12, 21));
    }

    /* 格式1：无参，无返回值 */
    public void lambdaFormat1() {
        Runnable r = new Runnable() {
            @Override
            public void run() {
                System.out.println("哈哈哈");
            }
        };

        Runnable r1 = () -> {
            System.out.println("哈哈哈");
        };
    }

    /* 格式2：1参，无返回值 */
    public void lambdaFormat2() {
        Consumer<String> con = new Consumer<>() {
            @Override
            public void accept(String str) {
                System.out.println(str);
            }
        };
        Consumer<String> con1 = (String str) -> {
            System.out.println(str);
        };
        con1.accept("hhh");
    }

    /* 格式3：在格式2的基础上省略数据类型，因为编译器可进行类型推断 */
    public void lambdaFormat3() {

        Consumer<String> con1 = (str) -> {
            System.out.println(str);
        };
        con1.accept("hhh");
    }

    /* 格式4：在格式2的基础上，若只有一个参数，可省略参数的小括号 */
    // 无参和多参不可省括号
    public void lambdaFormat4() {
        Consumer<Integer> con = str -> {
            System.out.println(str);
        };
    }

    /* 格式5：多参，多条执行语句，有返回值 */
    public void lambdaFormat5() {
        Comparator<Integer> com = new Comparator<>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                System.out.println(o1);
                System.out.println(o2);
                return o1.compareTo(o2);
            }
        };

        Comparator<Integer> com1 = (o1, o2) -> {
            System.out.println(o1);
            System.out.println(o2);
            return o1.compareTo(o2);
        };
        System.out.println(com1.compare(12, 21));
    }

    /* 格式6：lambda体只有一条return语句时， 省略大括号和return语句*/
    public void lambdaFormat6() {
        Comparator<Integer> com = (o1, o2) -> o1.compareTo(o2);
        System.out.println(com.compare(12, 21));
    }
}


