package iostream;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/**
 * @author 刘国庆
 * @date 2023/5/26
 * @desc ObjectOutputStream使用实例
 */
public class ObjectOutputStream_ {
    public static void main(String[] args) throws IOException {
        String filename = "C:\\Users\\DELL\\Desktop\\a.dat";
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(filename));
        oos.writeInt(100);
        oos.writeBoolean(true);
        // 写字符串
        oos.writeUTF("刘国庆");
        // 写对象
        oos.writeObject(new Dog("大黄", 3));
        oos.close();
    }
}