package iostream;

import java.io.File;
import java.io.IOException;

/**
 * @author 刘国庆
 * @date 2023/5/20
 * @desc 创建文件，3个方式
 */

public class FileCreate {
    public static void main(String[] args) {
        Create.m1();
        Create.m2();
        Create.m3();
    }
}

class Create {
    // 1.绝对路径
    public static void m1() {
        String fileName = "D:\\test1.txt";
        File f = new File(fileName);
        try {
            f.createNewFile();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    // 2.目录 + 文件名
    public static void m2() {
        String filePath = "D://";
        String fileName = "test2.txt";
        File f = new File(filePath, fileName);
        try {
            f.createNewFile();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    // 3.父目录文件 + 子文件名
    public static void m3() {
        File parentFile = new File("D:\\");
        String fileName = "test3.txt";
        File f = new File(parentFile, fileName);
        try {
            f.createNewFile();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
