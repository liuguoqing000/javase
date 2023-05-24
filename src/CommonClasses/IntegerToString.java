package CommonClasses;

/**
 * @author 刘国庆
 * @date 2023/5/24
 * @desc
 */
public class IntegerToString {
    public static void main(String[] args) {
        Integer i = 10; // 自动装箱
        String str;
        // Integer -> String
        str = i + "";
        str = i.toString();
        str = String.valueOf(i);
        // String -> Integer
        str = "1234";
        i = Integer.parseInt(str);
        i = Integer.valueOf(str);

        // int -> String
        int j = 10;
        str = j + "";
        str = Integer.toString(j);   //自动装箱
        str = String.valueOf(j);     //自动装箱
        // String -> int
        str = "1234";
        j = Integer.parseInt(str);  //自动拆箱
        j = Integer.valueOf(str);   //自动拆箱
    }
}
