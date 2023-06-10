package java8;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * @author liuguoqing000
 * @date 2023/6/10 23:24
 * @desc stream
 */
public class Stream_ {
    public static void main(String[] args) {

    }

    // 方式1  通过集合
    @Test
    public void m1() {
        List<Cat> cats = Cat.getCats();
        // 返回一个顺序流
        Stream<Cat> stream = cats.stream();
        // 返回一个并行流
        Stream<Cat> pStream = cats.parallelStream();
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

class Cat {
    private int age;
    private String name;

    public Cat(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public static List<Cat> getCats() {
        List<Cat> cats = new ArrayList<>();
        cats.add(new Cat(1, "tom"));
        cats.add(new Cat(2, "amy"));
        cats.add(new Cat(3, "lisa"));
        cats.add(new Cat(4, "luna"));
        cats.add(new Cat(5, "jack"));
        return cats;
    }
}
