package stream;

import java.io.FileInputStream;

/**
 * @author 刘国庆
 * @date 2023/5/20
 * @desc FileInputStream读取文件
 */

public class FileInputStream_ {
    public static void main(String[] args) throws Exception {
        m1();
    }

    // read读取单字符
    public static void m1() throws Exception {
        String filePath = "D:\\test1.txt";
        FileInputStream fileInputStream = new FileInputStream(filePath);
        int read = 0;
        while ((read = fileInputStream.read()) != -1) {
            System.out.print((char) read);
        }
        fileInputStream.close();
    }

    // read读取多字符
    public static void m2() throws Exception {
        String filePath = "D:\\test1.txt";
        FileInputStream fileInputStream = new FileInputStream(filePath);
        int readLen = 0;
        byte[] buf = new byte[8];
        while ((readLen = fileInputStream.read()) != -1) {
            System.out.print(new String(buf, 0, readLen));
        }
        fileInputStream.close();
    }
}
