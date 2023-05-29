package Collection_;

import CommonClass.ArraysMethod01;

import java.util.*;

/**
 * @author liuguoqing000
 * @date 2023/5/29 10:26
 * @desc Map接口重用方法和六大遍历方式
 */

@SuppressWarnings({"all"})
public class MapMethods {
    public static void main(String[] args) {
        new MapMethods().m2();
    }

    public void m1() {
        Map map = new HashMap();
        map.put("tom", new Book1("book", 1));
        map.put("jerry", "j");
        map.put("kim", "j");
        map.put("tom", "t");
        map.put(null, "n");

        //删除
        map.remove(null);
        //获得value
        Object o = map.get("tom");
        System.out.println(o);
        //大小
        System.out.println(map.size());
        //判空
        System.out.println(map.isEmpty());
        //判断键是否存在
        System.out.println(map.containsKey("kim"));
        //清空
        map.clear();
    }

    // 六大遍历方式
    public void m2() {
        Map map = new HashMap();
        map.put("tom", new Book1("book", 1));
        map.put("jerry", "j");
        map.put("kim", "j");
        map.put("tom", "t");
        map.put(null, "n");

        /* 第一组：通过key 遍历k-v */
        Set keyset = map.keySet();
        //1.增强for
        for (Object key : keyset) {
            System.out.print(key + "-" + map.get(key) + " ");
        }
        System.out.println("");
        //2.iterator迭代器
        Iterator iterator = keyset.iterator();
        while (iterator.hasNext()) {
            Object key = iterator.next();
            System.out.print(key + "-" + map.get(key) + " ");
        }
        System.out.println("");

        /* 第二组:通过value 遍历v */
        Collection values = map.values();
        //1.增强for
        for (Object val : values) {
            System.out.print(val + " ");
        }
        System.out.println("");
        //2.iterator迭代器
        Iterator iterator1 = values.iterator();
        while (iterator1.hasNext()) {
            Object val = iterator1.next();
            System.out.print(val + " ");
        }
        System.out.println("");

        /* 第三组:通过k-v 遍历k-v */
        Set entryset = map.entrySet();
        //1.增强for
        for (Object entry : entryset) {
            //将entry转为Map.Entry
            Map.Entry m = (Map.Entry) entry;
            System.out.print(m.getKey() + "-" + m.getValue() + " ");
        }
        System.out.println("");
        //2.iterator迭代器
        Iterator iterator2 = entryset.iterator();
        while (iterator2.hasNext()) {
            Object entry = iterator2.next();
            //将entry转为Map.Entry
            Map.Entry m = (Map.Entry) entry;
            System.out.print(m.getKey() + "-" + m.getValue() + " ");
        }
        System.out.println("");
    }
}

class Book1 {
    private String name;
    private int num;

    public Book1(String name, int num) {
        this.name = name;
        this.num = num;
    }

    @Override
    public String toString() {
        return "Book1{" +
                "name='" + name + '\'' +
                ", num=" + num +
                '}';
    }
}