package others;


import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author 韩顺平
 * @version 1.0
 */
public class test {
    public static void main(String[] args) {
        StringBuilder result = new StringBuilder();
        String content = "我....我要....学学学学....编程java！";
        String regStr = "([^.])";
        Pattern pattern = Pattern.compile(regStr);
        Matcher matcher = pattern.matcher(content);
        while (matcher.find()) {
            result.append(matcher.group(0));
        }
        System.out.println(result);
    }
}
