package IOStream;

import java.io.*;

/**
 * @author 刘国庆
 * @date 2023/5/27
 * @desc
 */
public class PrintWriter_ {
    public static void main(String[] args) throws IOException {
        String filename = "C:\\Users\\DELL\\Desktop\\a.txt";
//        PrintWriter printWriter = new PrintWriter(System.out);
        PrintWriter printWriter = new PrintWriter(new FileWriter(filename, true));
        printWriter.println("ads");
        printWriter.close();
    }
}
