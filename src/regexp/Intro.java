package regexp;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author liuguoqing000
 * @date 2023/6/8 16:28
 * @desc 正则表达式基本用法与底层原理
 */
public class Intro {
    public static void main(String[] args) {
//        String regStr = "^[\u0391-\uffe5]+$";    匹配汉字
        String content = "1245aa12";
        // 1.正则表达式
        String regString = "\\d\\d[A-Za-z][A-Za-z]\\d\\d";
        // 2.根据正则表达式创建 pattern对象
        Pattern pattern = Pattern.compile(regString);
        // 3.使用pattern对象与content匹配
        Matcher matcher = pattern.matcher(content);
        // 4.开始匹配
        while (matcher.find()) {
            System.out.println(matcher.group(0));
            //...
            System.out.println(matcher.group(1));// 有几个分组此处就是几

        }
        /*不考虑分组*/
        // find()找到匹配的字符串后记录其开始和结束的索引，返回值为boolean
        // group(0)则根据记录的索引截取字符串并返回
        /*考虑分组*/
        // find()找到匹配的字符串后记录其开始和结束的索引，返回值为boolean
        // group(0)则根据记录的索引截取字符串并返回
        // group(1)返回正则表达式第一个分组内匹配的内容，后者以此类推
    }
}
