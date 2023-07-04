package stream_;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * @author liuguoqing000
 * @date 2023/6/10 23:24
 * @desc 创建stream
 */
public class CreateStream {
    // 方式1  通过集合
    @Test
    public void m1() {
        List<Employee> employees = Employee.getEmployees();
        // 返回一个顺序流
        Stream<Employee> stream = employees.stream();
        // 返回一个并行流
        Stream<Employee> pStream = employees.parallelStream();
    }


    // 方式2  通过数组
    @Test
    public void m2() {
        int[] arr = {1, 2, 3, 4, 5};
        IntStream stream = Arrays.stream(arr);
    }


    // 方式3  通过of()
    @Test
    public void m3() {
        Stream<String> stream = Stream.of("dgdf", "gfd", "das");
    }
}