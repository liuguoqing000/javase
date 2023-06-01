package iostream;

import java.io.*;

/**
 * @author 刘国庆
 * @date 2023/5/27
 * @desc InputStreamReader使用实例
 */
public class InputStreamReader_ {
    public static void main(String[] args) throws IOException {
        String filename = "C:\\Users\\DELL\\Desktop\\a.txt";
        InputStreamReader inputStreamReader = new InputStreamReader(new FileInputStream(filename), "gbk");
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
        String line = bufferedReader.readLine();
        System.out.println(line);
    }
}
