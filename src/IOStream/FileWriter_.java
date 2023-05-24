package IOStream;

import java.io.FileWriter;
import java.io.IOException;

/**
 * @author 刘国庆
 * @date 2023/5/20
 * @desc FileWriter的用法，字符串或char数组各自的
 */

public class FileWriter_ {
    public static void main(String[] args) throws IOException {
        m1();
    }

    public static void m1() throws IOException {
        String str = "HelloWorld";
        String fileName = "D:\\a.txt";
        FileWriter f = new FileWriter(fileName);
        f.write('a');
        f.write('\n');
        f.write(str.toCharArray());
        f.write('\n');
        f.write(str);
        f.write(str.toCharArray(), 0, str.toCharArray().length);
        f.write(str, 0, str.length());

        f.close();

    }

    public static void m2() {

    }
}
