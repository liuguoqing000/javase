package Collection_;

import CommonClass.ArraysMethod01;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author liuguoqing000
 * @date 2023/5/27 17:39
 * @desc
 */
public class CollectionMethods {
    public static void main(String[] args) {
        CollectionMethods test = new CollectionMethods();
        test.m1();
    }

    public void m1() {
        List list = new ArrayList();
        List list2 = new ArrayList();
        list2.add(true);
        list2.add(1.5f);
        list2.add('x');
        /* 查看指定元素 */
        System.out.println(list.get(2));
        /* 添加 */
        // 1.单个元素添加
        list.add("孔明先生");
        list.add(100);
        // 2.多个元素添加
        list.addAll(list2);
        System.out.println("list=" + list);
        /* 删除 */
        // 1.通过索引删除
        list.remove(0);
        // 2.通过指定元素删除
        Integer a = 100;
        list.remove(a);
        System.out.println("list=" + list);
        // 3.删除多个元素
        list.removeAll(list2);
        /* 查找指定对象是否存在 */
        // 1.查看单个
        System.out.println(list.contains("孔明先生"));
        // 2.查看多个
        System.out.println(list.contains(list2));
        /* 集合大小 */
        System.out.println(list.size());
        /* 判空 */
        System.out.println(list.isEmpty());
        /* 清空 */
        list.clear();
        System.out.println(list);
    }

    public void m2() {
        List list = new ArrayList();
        list.add(new Book("wa", "b", 5));
        list.add("dsa");
        list.add(45);
        //iterator遍历
        Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            Object next = iterator.next();
            System.out.println(next);
        }
        //增强for遍历
        for (Object book : list) {
            System.out.println(book);
        }
        // 普通for遍历
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}

class Book {
    private String name;
    private String author;
    private int price;

    public Book(String name, String author, int price) {
        this.name = name;
        this.author = author;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", price=" + price +
                '}';
    }
}