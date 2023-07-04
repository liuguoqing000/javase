package stream_;

import java.util.ArrayList;
import java.util.List;

/**
 * @author liuguoqing000
 * @date 2023/6/12 11:06
 * @desc 员工数据类
 */
public class Employee {
    private int id;
    private String name;
    private int sal;

    public Employee(int id, String name, int sal) {
        this.id = id;
        this.name = name;
        this.sal = sal;
    }

    public static List<Employee> getEmployees() {
        List<Employee> cats = new ArrayList<>();
        cats.add(new Employee(1, "tom", 1000));
        cats.add(new Employee(2, "amy", 5000));
        cats.add(new Employee(3, "lisa", 8000));
        cats.add(new Employee(4, "luna", 2000));
        cats.add(new Employee(5, "jack", 5000));
        cats.add(new Employee(6, "john", 6000));
        cats.add(new Employee(7, "sarah", 10000));
        cats.add(new Employee(8, "jack", 9000));
        cats.add(new Employee(8, "jack", 9000));
        return cats;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSal() {
        return sal;
    }

    public void setSal(int sal) {
        this.sal = sal;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", sal=" + sal +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Employee employee)) return false;

        if (getId() != employee.getId()) return false;
        if (getSal() != employee.getSal()) return false;
        return getName().equals(employee.getName());
    }

    @Override
    public int hashCode() {
        int result = getId();
        result = 31 * result + getName().hashCode();
        result = 31 * result + getSal();
        return result;
    }
}
