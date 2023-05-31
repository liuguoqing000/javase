package Collection_.exercise;

import java.util.Comparator;
import java.util.HashSet;
import java.util.Objects;
import java.util.TreeSet;

/**
 * @author liuguoqing000
 * @date 2023/5/29 19:54
 * @desc
 */
public class Exercise04 {
    public static void main(String[] args) {
        TreeSet treeSet = new TreeSet(new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                return 0;
            }
        });
        //分析源码
        //add 方法，因为 TreeSet() 构造器没有传入Comparator接口的匿名内部类
        //所以在底层 Comparable<? super K> k = (Comparable<? super K>) key;
        //即 把 Perosn转成 Comparable类型
        //解决方法：1.Person实现Comparable接口并重写compareTo方法；2.实例化TreeSet时使用匿名内部类重写方法
        treeSet.add(new Person());//ClassCastException.
        treeSet.add(new Person());//ClassCastException.
        treeSet.add(new Person());//ClassCastException.
        treeSet.add(new Person());//ClassCastException.
        treeSet.add(new Person());//ClassCastException.

        System.out.println(treeSet);

    }
}

class Person implements Comparable {
    @Override
    public int compareTo(Object o) {
        return 0;
    }
}
