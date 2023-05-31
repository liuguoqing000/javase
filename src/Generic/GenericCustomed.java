package Generic;

/**
 * @author liuguoqing000
 * @date 2023/5/31 19:37
 * @desc 自定义泛型
 */
public class GenericCustomed {
    public static void main(String[] args) {
        new car().fly("aaa", 100);
        new Fish<String, Integer>().eat("aaa", 100);
        System.out.println(new car().getClass());
    }
}

class car {
    public <T, R> void fly(T t, R r) {

    }
}

class Fish<T, R> {
    public void eat(T t, R r) {

    }
}
