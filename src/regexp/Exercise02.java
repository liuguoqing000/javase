package regexp;

import org.junit.Test;

import javax.naming.ContextNotEmptyException;
import java.util.regex.Pattern;

/**
 * @author liuguoqing000
 * @date 2023/6/9 16:06
 * @desc 字符串与正则
 */
public class Exercise02 {
    public static void main(String[] args) {

    }

    /*
     * @desc replaceAll
     **/
    @Test
    public void m1() {
        String content = "这是jdk1.7,那是jdk1.8吗？";
        System.out.println(content.replaceAll("jdk1\\.[78]", "JDK"));
    }

    /*
     * @desc matches
     **/
    @Test
    public void m2() {
        String content = "18811089966";
        // 要求以187或186开头
        System.out.println(content.matches("18[6|7]\\d{8}"));
    }

    /*
     * @desc split
     **/
    @Test
    public void m3() {
        String content = "ddasd#asd-dasd966dasad";
        // 要求以 数字 或 # - 分割
        String[] split = content.split("#|-|\\d+");
        for (String s : split) {
            System.out.println(s);
        }
    }
}
