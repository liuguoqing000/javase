package IOStream;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/**
 * @author 刘国庆
 * @date 2023/5/26
 * @desc
 */
public class BufferedWriter_ {
    public static void main(String[] args) throws IOException {
        String filename = "C:\\Users\\DELL\\Desktop\\a.txt";
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(filename, true));
        bufferedWriter.write("test3");
        bufferedWriter.newLine();//插入一个与系统匹配的换行符
        bufferedWriter.write("test2");
        bufferedWriter.close();

    }
}
