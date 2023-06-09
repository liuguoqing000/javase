package lambda;

import org.junit.Test;

import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Supplier;

/**
 * @author liuguoqing000
 * @date 2023/6/10 22:44
 * @desc 构造器引用和数组引用
 */
public class ConArrReference {
    public static void main(String[] args) {

    }

    // 格式1  无参构造器
    @Test
    public void m1() {
        // lambda
        Supplier<Employee> sup = () -> new Employee();
        System.out.println(sup.get());
        // 构造器引用
        Supplier<Employee> sup2 = Employee::new;
        System.out.println(sup2.get());
    }


    // 格式2  2参构造器
    @Test
    public void m2() {
        BiFunction<Integer, String, Employee> bif = Employee::new;
        System.out.println(bif.apply(22, "lgq"));
    }


    // 数组引用
    @Test
    public void m3() {
        // 1.常规写法
        Function<Integer, Employee[]> f1 = new Function<Integer, Employee[]>() {
            @Override
            public Employee[] apply(Integer i) {
                return new Employee[i];
            }
        };
        // 2.lambda
        Function<Integer, Employee[]> f2 = (i) -> new Employee[i];
        // 3.方法引用
        Function<Integer, Employee[]> f3 = Employee[]::new;

        Employee[] employees = f3.apply(3);
        for (Employee employee : employees) {
            employee = new Employee();
            System.out.println(employee);
        }
    }
}

class Employee {

    private int age = 0;
    private String name = "";

    public Employee() {

    }

    public Employee(int age, String name) {
        this.age = age;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}