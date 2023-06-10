package commonclass;

/**
 * @author 刘国庆
 * @date 2023/5/24
 * @desc
 */
public class WrapperMethods {
    public static void main(String[] args) {
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);

        System.out.println(Character.isDigit('1'));
        System.out.println(Character.isLetter('1'));
        System.out.println(Character.isUpperCase('a'));
        System.out.println(Character.isLowerCase('a'));

        System.out.println(Character.isWhitespace(' '));
        System.out.println(Character.toUpperCase('a'));
        System.out.println(Character.toLowerCase('A'));

        String str1 = new String("AAAA");
        String str2 = new String("abb");
        str1 = str2;
    }
}
