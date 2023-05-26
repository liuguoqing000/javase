package CommonClass;

import java.sql.SQLOutput;

/**
 * @author 刘国庆
 * @date 2023/5/25
 * @desc String常用方法
 */
public class StringMethods {
    public static void main(String[] args) {
        String str1 = "abcbc";
        String str2 = "AbcBc";
        System.out.println(str1.equals(str2));
        // 忽略大小写比较
        System.out.println(str1.equalsIgnoreCase(str2));
        System.out.println(str1.length());
        // 返回给定字符串在字符串中第一次出现的索引
        System.out.println(str1.indexOf("bc"));
        // 返回给定字符在字符串中最后一次出现的索引
        System.out.println(str1.lastIndexOf("bc"));
        // 截取索引1及1后的所有字符
        System.out.println(str1.substring(1));
        // 截取从索引1到索引3-1的字符串
        System.out.println(str1.substring(1, 3));
        System.out.println(str1.toUpperCase());
        System.out.println(str1.toLowerCase());
        // 拼接
        System.out.println(str1.concat(str2));
        // a替换成1
        System.out.println(str1.replace("a", "1"));
        //分割
        String poem = "D:\\src\\a.txt";
        String[] path = poem.split("\\\\");
        for (int i = 0; i < path.length; i++) {
            System.out.println(path[i]);
        }
        // 转换为字符数组
        char[] chs = str1.toCharArray();
        for (int i = 0; i < chs.length; i++) {
            System.out.println(chs[i]);
        }
        // 占位
        double d = 5.2333;
        String formatString = "保留两位小数是%.2f";
        str1 = String.format(formatString, d);
        System.out.println(str1);
    }
}
