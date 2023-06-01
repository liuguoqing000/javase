package generic.exercise;

import java.util.ArrayList;
import java.util.Comparator;

/**
 * @author liuguoqing000
 * @date 2023/5/31 15:24
 * @desc
 */

/**
 * 定义Employee类
 * 1) 该类包含：private成员变量name,sal,birthday，其中 birthday 为 MyDate 类的对象；
 * 2) 为每一个属性定义 getter, setter 方法；
 * 3) 重写 toString 方法输出 name, sal, birthday
 * 4) MyDate类包含: private成员变量month,day,year；并为每一个属性定义 getter, setter 方法；
 * 5) 创建该类的 3 个对象，并把这些对象放入 ArrayList 集合中（ArrayList 需使用泛型来定义），对集合中的元素进行排序，并遍历输出：
 * <p>
 * 排序方式： 调用ArrayList 的 sort 方法 ,
 * 传入 Comparator对象[使用泛型]，先按照name排序，如果name相同，则按生日日期的先后排序。【即：定制排序】
 * 有一定难度 15min , 比较经典 泛型使用案例 GenericExercise02.java
 */
public class Exercise01 {
    public static void main(String[] args) {
        ArrayList<Employee> employees = new ArrayList<>();
        employees.add(new Employee("jack", 1000, new MyDate(15, 3, 2023)));
        employees.add(new Employee("jack", 3000, new MyDate(3, 5, 2022)));
        employees.add(new Employee("amy", 2000, new MyDate(2, 5, 2023)));

        employees.sort(new Comparator<>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                if (!(o1 instanceof Employee && o2 instanceof Employee)) {
                    System.out.println("类型不匹配！");
                    return 0;
                }
                boolean flag = o1.getName().equals(o2.getName());
                if (!flag) {
                    return o1.getName().compareTo(o2.getName());
                }
                return o1.getBirthday().compareTo(o2.getBirthday());
            }
        });


        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }
}

class MyDate implements Comparable<MyDate> {
    private final int day;
    private final int month;
    private final int year;

    public MyDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    @Override
    public int compareTo(MyDate o) {
        int y = year - o.getYear();
        if (y != 0) {
            return y;
        }

        int m = month - o.getMonth();
        if (m != 0) {
            return m;
        }

        return day - o.getDay();
    }

    @Override
    public String toString() {
        return "MyDate{" +
                "day=" + day +
                ", month=" + month +
                ", year=" + year +
                '}';
    }

    public int getDay() {
        return day;
    }

    public int getMonth() {
        return month;
    }

    public int getYear() {
        return year;
    }

}

class Employee {
    private String name;
    private final int sal;
    MyDate birthday;

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", sal=" + sal +
                ", birthday=" + birthday +
                '}';
    }

    public Employee(String name, int sal, MyDate birthday) {
        this.name = name;
        this.sal = sal;
        this.birthday = birthday;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public MyDate getBirthday() {
        return birthday;
    }

}
