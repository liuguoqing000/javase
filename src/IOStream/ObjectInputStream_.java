package IOStream;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

/**
 * @author 刘国庆
 * @date 2023/5/26
 * @desc ObjectInputStream使用实例
 */
public class ObjectInputStream_ {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        String filename = "C:\\Users\\DELL\\Desktop\\a.dat";
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(filename));
        // 注意：读取必须与写入的顺序保持一致
        System.out.println(ois.readInt());
        System.out.println(ois.readBoolean());
        System.out.println(ois.readUTF());
        Object dog = ois.readObject();
        // 向下转型
        Dog dog2 = (Dog) dog;
        System.out.println(dog2);
        ois.close();
    }
}
