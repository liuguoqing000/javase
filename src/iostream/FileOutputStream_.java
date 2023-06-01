package iostream;

import java.io.FileOutputStream;

/**
 * @author 刘国庆
 * @date 2023/5/20
 * @desc 1.FileOutputStream输出流调用write写文件的3种方式
 * 2.覆盖和追加2种方式的FileOutputStream
 */

public class FileOutputStream_ {
    public static void main(String[] args) throws Exception {
        m1();
    }

    public static void m1() throws Exception {
        String str = "Hello,World";
        String filePath = "D:\\test1.txt";
        // 覆盖流:打开文件时清空原有内容再写
        FileOutputStream f1 = new FileOutputStream(filePath);
        // 追加流
        FileOutputStream f2 = new FileOutputStream(filePath, true);
        // 1.字符
        f1.write('a');
        // 2.字符串
        f1.write(str.getBytes());
        // 3.
        f1.write(str.getBytes(), 0, str.length());
        // 释放资源
        f1.close();
        f2.close();
    }
}
