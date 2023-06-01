package iostream;

import java.io.Serializable;

/**
 * @author 刘国庆
 * @date 2023/5/26
 * @desc
 */

/**
 * 1.注意此处需实现Serializable接口才可序列化，否则报错
 * 2.默认序列化所有属性，static和transcient除外
 * 3.要求属性的类型也已实现Serializable接口
 * 4.序列化具有可继承性
 * 5.加入serialVersionUID序列化的版本号，可提高兼容性
 */
/*在反序列化期间使用该版本号来验证序列化对象的发送者和接收者
是否已加载了该对象的与序列化兼容的类*/
public class Dog implements Serializable {
    String name;
    int age;
    private static final long serialVersionUID = 1L;

    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
