package reflection;

/**
 * @author liuguoqing000
 * @date 2023/6/1 09:00
 * @desc 供re.properties和intro使用
 */
public class Cat {
    public int age = 99;

    public Cat() {
    }

    public Cat(Integer age) {
        this.age = age;
    }

    public void hi() {
        System.out.println("通过invoke调用hi方法");
    }
}
