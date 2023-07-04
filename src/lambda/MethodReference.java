package lambda;

import org.junit.Test;

import java.util.Comparator;
import java.util.function.BiPredicate;
import java.util.function.Consumer;
import java.util.function.Supplier;

/**
 * @author liuguoqing000
 * @date 2023/6/10 17:03
 * @desc 方法引用
 */
public class MethodReference {


    public static void main(String[] args) {

    }


    // 格式1  对象 :: 实例方法
    @Test
    public void m1() {
        Consumer<String> con = s -> System.out.println(s);
        con.accept("hhh");

        Consumer<String> con1 = System.out::println;
        con1.accept("hhh");

        MethodReference m = new MethodReference();
        Supplier<String> sup = () -> m.getName();
        System.out.println(sup.get());

        Supplier<String> sup2 = m::getName;
        System.out.println(sup2.get());
    }

    // 格式2：类 :: 静态方法
    @Test
    public void m2() {
        Comparator<Integer> com = new Comparator<>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return Integer.compare(o1, o2);
            }
        };

        // lambda
        Comparator<Integer> com1 = (o1, o2) -> Integer.compare(o1, o2);

        // 方法引用
        Comparator<Integer> com2 = Integer::compare;
        System.out.println(com2.compare(1, 2));

    }


    // 格式3  类::实例方法
    @Test
    public void m3() {

        BiPredicate<String, String> bip = new BiPredicate<>() {
            @Override
            public boolean test(String o1, String o2) {
                return o1.equals(o2);
            }
        };

        // lambda
        BiPredicate<String, String> bip1 = (o1, o2) -> o1.equals(o2);

        // 方法引用
        BiPredicate<String, String> bip2 = String::equals;
        System.out.println(bip2.test("abc", "abc"));
    }


    public String getName() {
        return "lgq";
    }
}