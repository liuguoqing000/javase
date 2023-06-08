package regexp;

import org.junit.Test;
import reflection.Person;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author liuguoqing000
 * @date 2023/6/8 19:55
 * @desc
 */
public class CommonMethods {
    public static void main(String[] args) {
    }

    /*Pattern类*/
    @Test
    public void Pattern_() {
        // 整体匹配
        // 与 matcher.find()的区别:matcher.find()须写^和 $才相当于全体匹配
        String content = "hello hello lgq";
        String regStr = ".*hello.*";
        System.out.println(Pattern.matches(regStr, content));
    }

    /*Matcher类*/
    @Test
    public void Matcher_() {
        String content = "hello asfas hello";
        String regStr = "hello";
        Pattern pattern = Pattern.compile(regStr);
        Matcher matcher = pattern.matcher(content);
        while (matcher.find()) {
            System.out.println("=========");
            // 返回所匹配字符串开始及结束的索引
            System.out.println(matcher.start());
            System.out.println(matcher.end());
            System.out.println("找到:" + content.substring(matcher.start(), matcher.end()));
        }
        // 整体匹配
        System.out.println("整体匹配：" + matcher.matches());
        // 替换匹配到的字符串（注，原来的content内容不发生变化）
        String newContent = matcher.replaceAll("world");
        System.out.println(newContent);
    }
}
