package stream_;

import org.junit.Test;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

/**
 * @author liuguoqing000
 * @date 2023/6/12 11:09
 * @desc stream中间操作
 */
public class StreamOperation {
    /*1.筛选和切片*/
    @Test
    public void m1() {
        List<Employee> employees = Employee.getEmployees();
        Stream<Employee> stream = employees.stream();

        // filter(Predicate<? super T> predicate)
        stream.filter(emp -> emp.getSal() > 2000).forEach(System.out::println);
        // limit(n):取前n个
        employees.stream().limit(2).forEach(System.out::println);
        // skip(n):跳过前n个元素
        employees.stream().skip(2).forEach(System.out::println);
        // distinct():去重
        /*根据equals和hashCode方法判断，因此需重写这俩方法*/
        employees.stream().distinct().forEach(System.out::println);
    }

    /*2.映射*/
    @Test
    public void m2() {
        // map(Function<? super T, ? extends R> mapper)
        // 练习：获取姓名长度大于3的员工的姓名
        List<Employee> employees = Employee.getEmployees();
        // 1.先filter再map
        employees.stream().filter(emp -> emp.getName().length() > 3)
                .map(Employee::getName)
                .forEach(System.out::println);
        // 2.先map再filter(better)
        employees.stream().map(Employee::getName)
                .filter(name -> name.length() > 3)
                .forEach(System.out::println);
        // 3.不用map
        employees.stream().filter(employee -> employee.getName().length() > 3)
                .forEach(employee -> System.out.println(employee.getName()));
    }

    /*3.排序*/
    @Test
    public void m3() {
        List<String> list = Arrays.asList("cc", "bb", "ee");
        List<Employee> employees = Employee.getEmployees();
        //sorted()自然排序
        list.stream().sorted().forEach(System.out::println);
        //sorted(Comparator<? super T> comparator)定制排序
        //按工资高低排序
        employees.stream().sorted(Comparator.comparing(Employee::getSal)).forEach(System.out::println);
        //按员工姓名排序
        employees.stream().sorted(Comparator.comparing(Employee::getName)).forEach(System.out::println);
    }
}
