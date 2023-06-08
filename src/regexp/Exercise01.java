package regexp;

import org.junit.Test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author liuguoqing000
 * @date 2023/6/8 21:26
 * @desc 结巴去重练习题
 */
public class Exercise01 {
    public static void main(String[] args) {

    }

    /* 解法1 */
    public void m1() {
        StringBuilder result = new StringBuilder();
        // 1.删....
        String content = "我....我要....学学学学....编程java！";
        String regStr = "([.]{4})";
        Pattern pattern = Pattern.compile(regStr);
        Matcher matcher = pattern.matcher(content);
        content = matcher.replaceAll("");
        // 2.将每个重复的字符串匹配到
        regStr = "(.)\\1*";
        pattern = Pattern.compile(regStr);
        matcher = pattern.matcher(content);
        // 3.只去每个匹配到的字符串的第一个字，拼接即可
        while (matcher.find()) {
            result.append(matcher.group(0).charAt(0));
        }
        System.out.println(result);
    }

    /* 解法2 */
    @Test
    public void m2() {
        // 1.删....
        String content = "我....我要....学学学学....编程java！";
        String regStr = "([.]{4})";
        Pattern pattern = Pattern.compile(regStr);
        Matcher matcher = pattern.matcher(content);
        content = matcher.replaceAll("");
        // 2.简写，通过外部反引用，替换重复的字符串中的一个字替代该字符串
        regStr = "(.)\\1+";
        System.out.println(Pattern.compile(regStr).matcher(content).replaceAll("$1"));
    }
}
