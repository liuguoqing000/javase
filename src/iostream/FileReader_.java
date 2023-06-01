package iostream;

import java.io.FileReader;

/**
 * @author 刘国庆
 * @date 2023/5/20
 * @desc FileInputStream读取文件
 */

public class FileReader_ {
    public static void main(String[] args) throws Exception {
        m2();
    }

    // 读取单字符
    public static void m1() throws Exception {
        String filePath = "D:\\test1.txt";
        FileReader f = new FileReader(filePath);
        int read = 0;
        while ((read = f.read()) != -1) {
            System.out.print((char) read);
        }
        // 释放资源
        f.close();
    }

    // 读取多字符
    public static void m2() throws Exception {
        String filePath = "D:\\test1.txt";
        FileReader f = new FileReader(filePath);
        int readLen = 0;
        char[] buf = new char[8];
        while ((readLen = f.read(buf)) != -1) {
            System.out.print(new String(buf, 0, readLen));
        }
        // 释放资源
        f.close();
    }
}
