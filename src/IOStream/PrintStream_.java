package IOStream;

import java.io.IOException;
import java.io.PrintStream;

/**
 * @author 刘国庆
 * @date 2023/5/27
 * @desc
 */
public class PrintStream_ {
    public static void main(String[] args) throws IOException {
        String filename = "C:\\Users\\DELL\\Desktop\\a.txt";
        PrintStream out = System.out;
        out.println("test");
        out.println("test2");
        out.write("test2".getBytes());
        out.close();

        System.setOut(new PrintStream("C:\\Users\\DELL\\Desktop\\a.txt"));
        System.out.println("hh");
    }
}
