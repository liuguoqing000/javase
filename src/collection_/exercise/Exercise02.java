package collection_.exercise;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * @author liuguoqing000
 * @date 2023/5/29 19:23
 * @desc
 */
public class Exercise02 {
    public static void main(String[] args) {
        ArrayList arrayList = new ArrayList();
        Car car1 = new Car("宝马", 100);
        Car car2 = new Car("奔驰", 200);
        Car car3 = new Car("宾利", 300);
        Car car4 = new Car("法拉利", 400);
        Car car5 = new Car("保时捷", 500);

        arrayList.add(car1);
        arrayList.add(car2);
        arrayList.add(car3);
        arrayList.add(car4);
        arrayList.add(car5);
        System.out.println("1." + arrayList);

        arrayList.remove(2);
        arrayList.remove(car5);
        System.out.println("2." + arrayList);
        System.out.println("3." + arrayList.contains(car5));

        System.out.println("4." + arrayList.size());
        System.out.println("5." + arrayList.isEmpty());
        arrayList.clear();
        System.out.println("6." + arrayList);

        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(car5);
        arrayList2.add(car3);
        arrayList.addAll(arrayList2);
        System.out.println("7." + arrayList);

        System.out.println("8." + arrayList2.containsAll(arrayList2));

        arrayList.removeAll(arrayList2);
        System.out.println("9." + arrayList);

        System.out.print("10.");
        for (Object o : arrayList2) {
            Car car = (Car) o;
            System.out.print(car + " ");
        }

        System.out.print("\n11.");
        Iterator iterator = arrayList2.iterator();
        while (iterator.hasNext()) {
            Car next = (Car) iterator.next();
            System.out.print(next + " ");
        }
    }
}

/**
 * 使用ArrayList 完成对 对象 Car {name, price} 的各种操作
 * 1.add:添加单个元素
 * 2.remove:删除指定元素
 * 3.contains:查找元素是否存在
 * 4.size:获取元素个数
 * 5.isEmpty:判断是否为空
 * 6.clear:清空
 * 7.addAll:添加多个元素
 * 8.containsAll:查找多个元素是否都存在
 * 9.removeAll：删除多个元素
 * 使用增强for和 迭代器来遍历所有的car , 需要重写 Car 的toString方法
 */

class Car {
    String name;
    int price;

    public Car(String name, int price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}