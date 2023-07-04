package new_features;

import org.junit.Test;

import java.io.*;

/**
 * @author liuguoqing000
 * @date 2023/7/4 16:47
 * @desc try-catch
 */
public class try_catch {
    public static void main(String[] args) {
        new try_catch().m3();
    }

    /*版本1.0*/
    @Test
    public void m1() throws IOException {
        FileWriter fw;
        BufferedWriter bw = null;
        try {
            fw = new FileWriter("C:\\Users\\DELL\\IdeaProjects\\javase\\src\\new_features\\a.txt");
            bw = new BufferedWriter(fw);
            bw.write("hello,world");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (bw != null) {
                    bw.close();
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }


    /* 版本2.0 */
    @Test
    public void m2() {
        // try后小括号中创建的对象被自动释放资源
        try (FileWriter fw = new FileWriter("C:\\Users\\DELL\\IdeaProjects\\javase\\src\\new_features\\a.txt");
             BufferedWriter bw = new BufferedWriter(fw);) {
            bw.write("hello,world");
        } catch (IOException e) {
            System.out.println(e);
        }
    }


    /* 版本3.0 */
    @Test
    public void m3() {
        // try后小括号中声明的对象被自动释放资源
        InputStreamReader reader = new InputStreamReader(System.in);
        OutputStreamWriter writer = new OutputStreamWriter(System.out);
        try (reader; writer;) {
            writer.write("hello,world");
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
