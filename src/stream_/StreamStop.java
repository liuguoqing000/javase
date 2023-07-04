package stream_;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author liuguoqing000
 * @date 2023/7/4 11:14
 * @desc
 */
public class StreamStop {
    /* 1.匹配与查找 */
    @Test
    public void m1() {
        List<Employee> employees = Employee.getEmployees();
        //boolean allMatch(Predicate<? super T> predicate)
        //是否全部匹配，返回布尔值
        System.out.println(employees.stream().allMatch(employee -> employee.getSal() > 500));

        //boolean anyMatch(Predicate<? super T> predicate)
        //是否至少匹配一个，返回布尔值
        System.out.println(employees.stream().anyMatch(employee -> employee.getSal() >= 10000));

        //Optional<T> findFirst()
        //返回第一个元素
        System.out.println(employees.stream().findFirst());

        //返回数量
        System.out.println(employees.stream().count());

        //Optional<T> max(Comparator<? super T> comparator)
        //返回最大值
        System.out.println(employees.stream().max((emp1, emp2) -> Double.compare(emp1.getSal(), emp2.getSal())));

        //Optional<T> min(Comparator<? super T> comparator)
        //返回最小值
        System.out.println(employees.stream().min((emp1, emp2) -> Double.compare(emp1.getSal(), emp2.getSal())));

        //void forEach(Consumer<? super T> action)
        //遍历
        employees.stream().forEach(System.out::println);

        //补充：遍历集合的另一方法
        employees.forEach(System.out::println);
    }

    /* 2.归约 */
    @Test
    public void m2() {

        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        //T reduce(T identity, BinaryOperator<T> accumulator)
        //identity为种子值，即初始值；accumulator为BiFunction子类
        System.out.println(list.stream().reduce(0, (x1, x2) -> x1 + x2));
        System.out.println(list.stream().reduce(0, (x1, x2) -> Integer.sum(x1, x2)));
        System.out.println(list.stream().reduce(0, Integer::sum));


    }

    /* 3.收集 */
    @Test
    public void m3() {
        List<Employee> employees = Employee.getEmployees();
        //将结果收集为list,map,set等等。下例为list
        List<Employee> list = employees.stream().filter(emp -> emp.getSal() > 2000).collect(Collectors.toList());
        list.forEach(System.out::println);
    }
}
