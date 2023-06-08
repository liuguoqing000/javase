package regexp;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author liuguoqing000
 * @date 2023/6/8 17:06
 * @desc 演示命名分组捕获的使用
 */
public class Group {
    public static void main(String[] args) {
        String content = "1234dddd";
        String regStr = "(?<g1>\\d\\d)(?<g2>\\d\\d)";
        Pattern pattern = Pattern.compile(regStr);
        Matcher matcher = pattern.matcher(content);
        while (matcher.find()) {
            System.out.println(matcher.group(0));
            System.out.println(matcher.group("g1"));
            System.out.println(matcher.group("g2"));
        }

    }
}
