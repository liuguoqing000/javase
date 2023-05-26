package IOStream;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * @author 刘国庆
 * @date 2023/5/26
 * @desc
 */
public class BufferedReader_ {
    public static void main(String[] args) throws IOException {
        String filename = "D:\\a.txt";
        BufferedReader bufferedReader = new BufferedReader(new FileReader(filename));
        String line;
        while ((line = bufferedReader.readLine()) != null) {
            System.out.println(line);
        }
        bufferedReader.close();
    }
}
