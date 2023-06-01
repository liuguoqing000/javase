package reflection;

/**
 * @author liuguoqing000
 * @date 2023/6/1 11:26
 * @desc 供CommonMethods使用
 */
public class Person {
    public String name = "aaa";
    private int age = 100;

    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
    }

    public void hi() {
        System.out.println("public hi~");
    }

    private void cry() {
        System.out.println("private cry~");
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                '}';
    }
}
